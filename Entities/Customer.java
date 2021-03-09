package com.company.Entities;

import com.company.MyApplication;

public class Customer {
    private String customerId;
    private String customerUid;
    private int customerZipCode;
    private String customerCity;
    private String customerState;

    public Customer() {
        this.customerId=null;
        this.customerUid=null;
        this.customerZipCode=0000;
        this.customerCity=null;
        this.customerState=null;
    }

    public Customer(String customerId, String customerUid) {
        this.customerId = customerId;
        this.customerUid = customerUid;
    }

    public Customer(String customerId, String customerUid, int customerZipCode, String customerCity, String customerState) {
        this.customerId = customerId;
        this.customerUid = customerUid;
        this.customerZipCode = customerZipCode;
        this.customerCity = customerCity;
        this.customerState = customerState;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUid() {
        return customerUid;
    }

    public void setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
    }

    public int getCustomerZipCode() {
        return customerZipCode;
    }

    public void setCustomerZipCode(int customerZipCode) {
        this.customerZipCode = customerZipCode;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

     @Override
    public String toString() {
        return "Customer id: '" + MyApplication.ANSI_GREEN + this.customerId + MyApplication.ANSI_RESET +'\'' + "\n" +
                "Customer uid: " + MyApplication.ANSI_GREEN + this.customerUid + MyApplication.ANSI_RESET +
                ", Customer zip code: " + MyApplication.ANSI_GREEN + this.customerZipCode + MyApplication.ANSI_RESET +
                ", Customer city: " + MyApplication.ANSI_GREEN + this.customerCity + MyApplication.ANSI_RESET +
                ", Customer state: " + MyApplication.ANSI_GREEN + this.customerState + MyApplication.ANSI_RESET;
    }
}
