package com.company.Controller;

import com.company.Controller.Interfaces.OrderInformationInterface;
import com.company.LowLevelOperation.DBController;
import com.company.LowLevelOperation.DBOrderController;

import java.sql.Connection;
import java.sql.SQLException;

public class OrderInformationController implements OrderInformationInterface {
    public Connection connection= DBController.getConnection();

    public OrderInformationController() throws SQLException, ClassNotFoundException {
    }

    @Override
    public String getOrderInformationById(String id){
        Object orderInformation= DBOrderController.getInfoById(this.connection, id);
        return (orderInformation == null ? "Order information was not found!" : orderInformation.toString());

    }
}
