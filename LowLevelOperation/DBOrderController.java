package com.company.LowLevelOperation;

import com.company.Entities.OrderInformation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DBOrderController extends DBController{
    public static Object getInfoById(Connection connection, String id){
        String orderId=null;
        String customerId=null;
        String orderStatus=null;
        String orderPurchaseTimestamp=null;
        String orderApprovedAt=null;
        String orderDeliveredCarrierDate=null;
        String orderDeliveredCustomerDate=null;
        String orderEstimatedDeliveryDate=null;
        OrderInformation orderInformation=null;

        try{
            ResultSet resultSet=connection.createStatement().executeQuery("SELECT * FROM orders WHERE order_id="+"'"+id+"'");
            while (resultSet.next()){
                orderId=resultSet.getString("order_id");
                customerId=resultSet.getString("customer_id");
                orderStatus=resultSet.getString("order_status");
                orderPurchaseTimestamp=resultSet.getString("order_purchase_timestamp");
                orderApprovedAt=resultSet.getString("order_approved_at");
                orderDeliveredCarrierDate=resultSet.getString("order_delivered_carrier_date");
                orderDeliveredCustomerDate=resultSet.getString("order_delivered_customer_date");
                orderEstimatedDeliveryDate=resultSet.getString("order_estimated_delivery_date");

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        orderInformation=new OrderInformation(orderId, customerId, orderStatus, orderPurchaseTimestamp, orderApprovedAt, orderDeliveredCarrierDate, orderDeliveredCustomerDate, orderEstimatedDeliveryDate);
        return orderInformation;

    }

}
