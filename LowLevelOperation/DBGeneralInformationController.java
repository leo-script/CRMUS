package com.company.LowLevelOperation;

import com.company.Entities.Customer;
import com.company.Entities.GeneralInformation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBGeneralInformationController extends DBController{

    public static Object getInfoById(Connection connection) throws SQLException {
        int numberOfProducts=0;
        int categoriesNumber=0;
        int totalNumberOfUnicClients=0;
        int numberOfOrders=0;
        int numberDeliveredOrders=0;
        GeneralInformation generalInformation=null;

        try {
            ResultSet resultSet= connection.createStatement().executeQuery("SELECT Count(DISTINCT product_id) as number_of_products FROM products");

            ResultSet resultSet1= connection.createStatement().executeQuery("SELECT Count(DISTINCT product_category_name) as number_of_products FROM products");

            ResultSet resultSet2= connection.createStatement().executeQuery("SELECT Count(DISTINCT customer_uid) as number_of_uni_customers FROM customers ");

            ResultSet resultSet3= connection.createStatement().executeQuery("SELECT Count(DISTINCT order_id) as total_orders FROM orders ");

            ResultSet resultSet4= connection.createStatement().executeQuery("SELECT Count(DISTINCT order_id) as total_delivered_orders FROM orders WHERE order_status ilike '%delivered%' ");
            while (resultSet.next()&&resultSet1.next()&&resultSet2.next()&&resultSet3.next()&&resultSet4.next())
            {
                numberOfProducts=resultSet.getInt("number_of_products");
                categoriesNumber=resultSet1.getInt("number_of_products");
                totalNumberOfUnicClients=resultSet2.getInt("number_of_uni_customers");
                numberOfOrders=resultSet3.getInt("total_orders");
                numberDeliveredOrders=resultSet4.getInt("total_delivered_orders");
                generalInformation=new GeneralInformation(numberOfProducts, categoriesNumber, totalNumberOfUnicClients, numberOfOrders, numberDeliveredOrders);


            }

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            throw e;
        }
        return generalInformation;


    }

}
