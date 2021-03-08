package com.company;
import com.company.LowLevelOperation.DBCustomerController;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        System.out.println(DBCustomerController.getCustomerById(DBCustomerController.getConnection()));
        MyApplication myApplication=new MyApplication();
        myApplication.start();

    }
}
