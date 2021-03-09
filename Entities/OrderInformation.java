package com.company.Entities;

import com.company.MyApplication;

public class OrderInformation {
    private String orderId;
    private String customerId;
    private String orderStatus;
    private String orderPurchaseTimestamp;
    private String orderApprovedAt;
    private String orderDeliveredCarrierDate;
    private String orderDeliveredCustomerDate;
    private String orderEstimatedDeliveryDate;

    //todo set default values

    public OrderInformation(String orderId, String customerId, String orderStatus, String orderPurchaseTimestamp, String orderApprovedAt, String orderDeliveredCarrierDate, String orderDeliveredCustomerDate, String orderEstimatedDeliveryDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderStatus = orderStatus;
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
        this.orderApprovedAt = orderApprovedAt;
        this.orderDeliveredCarrierDate = orderDeliveredCarrierDate;
        this.orderDeliveredCustomerDate = orderDeliveredCustomerDate;
        this.orderEstimatedDeliveryDate = orderEstimatedDeliveryDate;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderPurchaseTimestamp() {
        return this.orderPurchaseTimestamp;
    }

    public void setOrderPurchaseTimestamp(String orderPurchaseTimestamp) {
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
    }

    public String getOrderApprovedAt() {
        return this.orderApprovedAt;
    }

    public void setOrderApprovedAt(String orderApprovedAt) {
        this.orderApprovedAt = orderApprovedAt;
    }

    public String getOrderDeliveredCarrierDate() {
        return this.orderDeliveredCarrierDate;
    }

    public void setOrderDeliveredCarrierDate(String orderDeliveredCarrierDate) {
        this.orderDeliveredCarrierDate = orderDeliveredCarrierDate;
    }

    public String getOrderDeliveredCustomerDate() {
        return this.orderDeliveredCustomerDate;
    }

    public void setOrderDeliveredCustomerDate(String orderDeliveredCustomerDate) {
        this.orderDeliveredCustomerDate = orderDeliveredCustomerDate;
    }

    public String getOrderEstimatedDeliveryDate() {
        return this.orderEstimatedDeliveryDate;
    }

    public void setOrderEstimatedDeliveryDate(String orderEstimatedDeliveryDate) {
        this.orderEstimatedDeliveryDate = orderEstimatedDeliveryDate;
    }

    @Override
    public String toString() {
        return "Order information: " +'\n'+
                "Order id = '" + MyApplication.ANSI_YELLOW + this.orderId + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Customer id = '" + MyApplication.ANSI_YELLOW + this.customerId + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Order status= '" + MyApplication.ANSI_YELLOW + this.orderStatus + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Order purchase timestamp = '" + MyApplication.ANSI_YELLOW + this.orderPurchaseTimestamp + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Order approved at = '" + MyApplication.ANSI_YELLOW + this.orderApprovedAt + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Order delivered carrier date = '" + MyApplication.ANSI_YELLOW + this.orderDeliveredCarrierDate + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Order delivered customer date = '" + MyApplication.ANSI_YELLOW + this.orderDeliveredCustomerDate + MyApplication.ANSI_RESET + '\'' +'\n'+
                "Order estimated delivery date = '" + MyApplication.ANSI_YELLOW + this.orderEstimatedDeliveryDate + MyApplication.ANSI_RESET + '\'' + "\n";
    }
}
