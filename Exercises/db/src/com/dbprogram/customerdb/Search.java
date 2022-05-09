package com.dbprogram.customerdb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search extends Dbc{

    public Search() throws SQLException {
    }

    public static boolean searchForCustomerEmail(String exactEmail) {
        String sql = "SELECT * FROM customer WHERE email='" + exactEmail + "'";
        try {
            Statement s = new Dbc().sm;
            ResultSet result = s.executeQuery(sql);

            while (result.next()) {
                s.close();
                System.out.println("There's already a customer with that email:" + exactEmail);
                return true;
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
