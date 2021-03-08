package com.company.LowLevelOperation;

import com.company.Entities.Customer;

import java.sql.*;

public abstract class DBCustomerController extends DBController {

    public static Object getInfoById(Connection connection, String id) throws SQLException {
        String customerId=null;
        String customerUid=null;
        int customerZipCodeIndex=0;
        String customerCity=null;
        String customerState=null;
        Customer customer=null;

        try {
            ResultSet resultSet= connection.createStatement().executeQuery("SELECT * FROM Customers WHERE Customer_id=\'"+id+"\'");
            while (resultSet.next())
            {
                customerId = resultSet.getString("customer_id");
                customerUid = resultSet.getString("customer_uid");
                customerZipCodeIndex = resultSet.getInt("customer_zip_code_index");
                customerCity = resultSet.getString("customer_city");
                customerState = resultSet.getString("customer_state");
                customer=new Customer(customerId,customerUid,customerZipCodeIndex,customerCity,customerState);

            }


        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            throw e;
        }
        return customer;


    }
}
