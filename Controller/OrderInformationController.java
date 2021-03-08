package com.company.Controller;

import com.company.Entities.OrderInformation;
import com.company.LowLevelOperation.DBController;
import com.company.LowLevelOperation.DBOrderController;

import java.sql.Connection;
import java.sql.SQLException;

public class OrderInformationController {
    Connection connection= DBController.getConnection();

    public OrderInformationController() throws SQLException, ClassNotFoundException {
    }
    public String getOrderInformationById(String id){
        Object orderInformation= DBOrderController.getInfoById(connection, id);
        return (orderInformation == null ? "Order information was not found!" : orderInformation.toString());

    }
}
