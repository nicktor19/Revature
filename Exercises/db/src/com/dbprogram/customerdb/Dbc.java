package com.dbprogram.customerdb;

import java.sql.*;

public class Dbc {
    //create connection objects:
    private String url = "jdbc:mysql://localhost:3306/revature";
    private String username = "root";
    private String password = ""; // enter password here
    protected Statement sm;

    public Dbc() throws SQLException {
        dbConnect();
    }


    private void dbConnect() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);

        //create statement object:
        this.sm = conn.createStatement();
    }
}
