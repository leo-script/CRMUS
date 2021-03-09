package com.company.Controller;

import com.company.Controller.Interfaces.CustomerInterface;
import com.company.LowLevelOperation.DBCustomerController;

import java.sql.Connection;
import java.sql.SQLException;

public class CustomerController implements CustomerInterface {
    public Connection connection= DBCustomerController.getConnection();

    public CustomerController() throws SQLException, ClassNotFoundException {
    }

    @Override

    public String getCustomerById(String id) throws SQLException {
        Object customer= DBCustomerController.getInfoById(this.connection,id);
        return (customer == null ? "Customer was not found!" : customer.toString());
    }

}
