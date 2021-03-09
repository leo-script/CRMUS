package com.company.Controller.Interfaces;

import java.sql.SQLException;

public interface PurchaseHistoryInterface {
    String getInfo(String id) throws SQLException;
}
