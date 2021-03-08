package com.company.Entities;

public class Customer {
    private String customerId;
    private String customerUid;
    private int customerZipCode;
    private String customerCity;
    private String customerState;

    public Customer() {
        customerId=null;
        customerUid=null;
        customerZipCode=0000;
        customerCity=null;
        customerState=null;
        //todo: Set default values
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
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUid() {
        return this.customerUid;
    }

    public void setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
    }

    public int getCustomerZipCode() {
        return this.customerZipCode;
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
        return this.customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    @Override
    public String toString() {
        return "Customer id: '" + customerId + '\'' + "\n" +
                "Customer uid: " + customerUid +
                ", Customer zip code: " + customerZipCode +
                ", Customer city: " + customerCity +
                ", Customer state: " + customerState;
    }
}
