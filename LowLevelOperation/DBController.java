package com.company.LowLevelOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBController {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://database-1.c1ipwagrda55.us-east-2.rds.amazonaws.com:5432/java_crm";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "QhEO56Qvn2aElhLhh0SO");
            return con;
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            throw e;
        }
    }
}
