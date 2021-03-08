package com.company.Controller;

import com.company.LowLevelOperation.DBCustomerController;

import java.sql.Connection;
import java.sql.SQLException;

public class CustomerController {
    Connection connection= DBCustomerController.getConnection();

    public CustomerController() throws SQLException, ClassNotFoundException {
    }

    public String getCustomerById(String id) throws SQLException {
        Object customer= DBCustomerController.getInfoById(connection,id);
        return (customer == null ? "Customer was not found!" : customer.toString());
    }
}
