package com.dbprogram;

import java.sql.*;


public class Dbc {
    //create connection objects:
    protected String url = "jdbc:mysql://localhost:3306/revature";
    protected String username = "root";
    protected String password = ""; // enter password here

    protected void dbConnect() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);

        //create statement object:
        Statement statement = conn.createStatement();

        //create query building
    }
}
