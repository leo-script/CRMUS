package com.company.Entities;

import com.company.MyApplication;

public class PurchaseHistory {
    private String customerId;
    private String customerState;
    private String orderPurchaseTimestamp;
    private String productId;
    private String productCategoryName;
    private double price;
    private double freightValue;
    private double purchaseSum;

    public PurchaseHistory(String customerId, String customerState, String orderPurchaseTimestamp, String productId, String productCategoryName, double price, double freightValue, double purchaseSum) {
        this.customerId = customerId;
        this.customerState = customerState;
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
        this.productId = productId;
        this.productCategoryName = productCategoryName;
        this.price = price;
        this.freightValue = freightValue;
        this.purchaseSum = purchaseSum;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getOrderPurchaseTimestamp() {
        return orderPurchaseTimestamp;
    }

    public void setOrderPurchaseTimestamp(String orderPurchaseTimestamp) {
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(double freightValue) {
        this.freightValue = freightValue;
    }

    public double getPurchaseSum() {
        return purchaseSum;
    }

    public void setPurchaseSum(double purchaseSum) {
        this.purchaseSum = purchaseSum;
    }
    @Override
    public String toString() {
        return "PurchaseHistory: " +'\n'+
                "Customer id = '" + MyApplication.ANSI_PURPLE + this.customerId + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Customer state = '" + MyApplication.ANSI_PURPLE + this.customerState + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Order purchase timestamp = '" + MyApplication.ANSI_PURPLE + this.orderPurchaseTimestamp + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Product id = '" + MyApplication.ANSI_PURPLE + this.productId + MyApplication.ANSI_RESET + '\'' +
                "Product category name = '" + MyApplication.ANSI_PURPLE + this.productCategoryName + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Price = " + MyApplication.ANSI_PURPLE + this.price + MyApplication.ANSI_RESET + '\n'+
                "Freight value = " + MyApplication.ANSI_PURPLE + this.freightValue + MyApplication.ANSI_RESET + '\n'+
                "Purchase Sum = " + MyApplication.ANSI_PURPLE + this.purchaseSum + MyApplication.ANSI_RESET;
    }
}
