package com.company.Controller;

import com.company.Controller.Interfaces.GeneralInformationInterface;
import com.company.LowLevelOperation.DBGeneralInformationController;

import java.sql.Connection;
import java.sql.SQLException;

public class GeneralInformationController implements GeneralInformationInterface {
    public Connection connection= DBGeneralInformationController.getConnection();

    public GeneralInformationController() throws SQLException, ClassNotFoundException {
    }
    @Override
    public String getInfo() throws SQLException {
        Object generalInfo= DBGeneralInformationController.getInfoById(this.connection);
        return (generalInfo == null ? "Information was not found!" : generalInfo.toString());
    }
}
