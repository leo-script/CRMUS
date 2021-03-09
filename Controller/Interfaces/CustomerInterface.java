package com.company.Controller.Interfaces;

import java.sql.SQLException;

public interface CustomerInterface {
    String getCustomerById(String id)throws SQLException;
}
