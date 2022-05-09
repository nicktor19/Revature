package com.dbprogram.customerdb;

import java.sql.*;

//using customer table from revature DB goal
public class SelectQuery extends Dbc{
    private String sql = "SELECT name, email FROM customer";
    protected Statement dbc;

    public SelectQuery() throws SQLException{

        try {
            this.dbc = new Dbc().sm;
            ResultSet result = dbc.executeQuery(this.sql);

            //print out all rows:
            while (result.next()) {
                System.out.println("Customer Name: " + result.getNString(1) +
                        "\nCustomer Email: " + result.getNString(2));
            }
            result.close(); //close connection.
        } catch (SQLException e ) {
            System.out.println(e);
        }
    }
}
