package com.company.Controller;

import com.company.Controller.Interfaces.PurchaseHistoryInterface;
import com.company.LowLevelOperation.DBCustomerController;
import com.company.LowLevelOperation.DBPurchaseHistoryController;

import java.sql.Connection;
import java.sql.SQLException;

public class PurchaseHistoryController implements PurchaseHistoryInterface {
    public Connection connection= DBCustomerController.getConnection();

    public PurchaseHistoryController() throws SQLException, ClassNotFoundException {

    }

    @Override
    public String getInfo(String id) throws SQLException {
        Object purchaseHistory= DBPurchaseHistoryController.getInfoById(this.connection,id);
        return (purchaseHistory == null ? "No history was not found!" : purchaseHistory.toString());
    }


}
