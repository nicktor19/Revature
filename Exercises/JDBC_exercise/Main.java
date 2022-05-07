package com.thenick;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 1: load driver
        //Class.forName("jdbc:mysql://localhost");

        //Step 2: create connection object
        String url = "jdbc:mysql://localhost:3306/revature";
        String username = "root";
        String password = "NotForYourEyes";

        Connection connection = DriverManager.getConnection(url, username, password);

        //Step 3: create statement object
        Statement statement2 = connection.createStatement();

        //Step 4: Execute Query
        System.out.println("Customer Name: "); //gather customer name
        String name= getInput();
        System.out.println("Customer Email: "); //gather customer email
        String email = getInput();


        String sql2 = "INSERT INTO customer (name, email) Values('"+ name + "', '" + email + "')";
        int row = statement2.executeUpdate(sql2);
        System.out.println("Inserted \"" + row + "\" row.");

        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM customer";
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt(1) +
                    "\nName: " + resultSet.getString(2) +
                    "\nEmail: " + resultSet.getString(3));
        }

        //step 5 : close connection
        connection.close();
    }

    public static String getInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
