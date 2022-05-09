package com.dbprogram.customerdb;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;

/**
 * The Customer table:
 * cust_id = int, primary key (PK), auto_increment, not null (no need to do anything here.
 * name = char[50], Not null
 * Ensure name is Entered, can't be empty.
 * email = char[200], not null
 * ensure the email is an email (contains '@' and '.' symbols.
 */

public class CreateCustomer extends Dbc {
    private String sql;
    private String name;
    private String email;

    public CreateCustomer() throws SQLException {
        setName(); //set name
        setEmail(); //set email
        //create sql string and get ready for uploading.
        sql = "INSERT INTO customer (name, email) VALUES ('"+ name +"', '"+ email +"')";
        insertCustomer(sql);
    }

    //set name
    private void setName() {
        boolean repeat = true;// repeater
        while (repeat) {
            try {
                System.out.println("Please Enter Customer Name: ");
                this.name = validName(UserInput.UserInputSingle());
                repeat = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    //validate name isn't empty;
    @Contract("null -> fail")
    private @NotNull String validName(String name) throws Exception{
        if (name == null || name.isEmpty())
            throw new Exception("Name can't be empty or null");
        else if (name.length() < 3)
            throw new Exception("Name needs to be longer than 2 characters.");
        else if (!Pattern.matches("[a-zA-Z]+", name))
            throw new Exception("Numbers and Special Symbols are not allowed.");
        else
            return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    //set email
    private void setEmail() {
        boolean repeat = true;// repeater
        while (repeat) {
            try {
                System.out.println("Please Enter Customer Email: ");
                this.email = validEmail(UserInput.UserInputSingle());
                repeat = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //validate email
    private @NotNull String validEmail(String email) throws Exception{
        System.out.println(email);

        //get if the email already exist:
        Boolean checker = Search.searchForCustomerEmail(email);

        if (email == null || email.isEmpty())
            throw new Exception("Email can't be empty or null");
        else if (!email.matches("^(.+)@(.+)\\.(.+)$"))
            throw new Exception("Please enter a correct email.");
        else if (checker.equals(true))
            throw new Exception("That email already exist.");
        else
            return email.toLowerCase();
    }

    //insert
    private void insertCustomer(String sql) {
        try {
            Statement dbc = new Dbc().sm;
            dbc.executeUpdate(sql);
            System.out.println("Account created for email: " + email);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + ". Please restart the process.");
        }
    }
}
