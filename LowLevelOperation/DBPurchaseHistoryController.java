package com.company.LowLevelOperation;

import com.company.Entities.Customer;
import com.company.Entities.PurchaseHistory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBPurchaseHistoryController extends DBController{
    public static Object getInfoById(Connection connection,String id) throws SQLException {
        String customerId=null;
        String customerState=null;
        String orderPurchaseTimestamp=null;
        String productId=null;
        String productCategoryName=null;
        double price=0;
        double freightValue=0;
        double purchaseSum=0;
        PurchaseHistory purchaseHistory=null;
        try {
            ResultSet resultSet= connection.createStatement().executeQuery("SELECT Customers.customer_id, Customers.customer_state, Orders.order_purchase_timestamp, \n" +
                    "Order_items.product_id, Products.product_category_name, Order_items.price, Order_items.freight_value,\n" +
                    "(Order_items.price + Order_items.freight_value)::numeric(10,2) as Purchase_sum\n" +
                    "FROM Customers\n" +
                    "LEFT JOIN Orders ON Orders.customer_id = Customers.customer_id \n" +
                    "RIGHT JOIN Order_items ON Orders.order_id = Order_items.order_id\n" +
                    "INNER JOIN Products ON Order_items.product_id = Products.product_id\n" +
                    "WHERE Orders.order_status not ilike 'canceled' \n" +
                    "AND Customers.customer_id = '"+id+"'\n" +
                    "ORDER BY Orders.order_purchase_timestamp ASC");
            while (resultSet.next())
            {
                customerId = resultSet.getString("customer_id");
                customerState=resultSet.getString("customer_state");
                orderPurchaseTimestamp=resultSet.getString("order_purchase_timestamp");
                productId=resultSet.getString("product_id");
                productCategoryName=resultSet.getString("product_category_name");
                price=resultSet.getDouble("price");
                freightValue=resultSet.getDouble("freight_value");
                purchaseSum=resultSet.getDouble("purchase_sum");
                purchaseHistory=new PurchaseHistory(customerId, customerState, orderPurchaseTimestamp, productId, productCategoryName, price, freightValue, purchaseSum);

            }

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            throw e;
        }
        return purchaseHistory;
    }
}
