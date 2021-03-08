package com.company.Entities;

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
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderPurchaseTimestamp() {
        return orderPurchaseTimestamp;
    }

    public void setOrderPurchaseTimestamp(String orderPurchaseTimestamp) {
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
    }

    public String getOrderApprovedAt() {
        return orderApprovedAt;
    }

    public void setOrderApprovedAt(String orderApprovedAt) {
        this.orderApprovedAt = orderApprovedAt;
    }

    public String getOrderDeliveredCarrierDate() {
        return orderDeliveredCarrierDate;
    }

    public void setOrderDeliveredCarrierDate(String orderDeliveredCarrierDate) {
        this.orderDeliveredCarrierDate = orderDeliveredCarrierDate;
    }

    public String getOrderDeliveredCustomerDate() {
        return orderDeliveredCustomerDate;
    }

    public void setOrderDeliveredCustomerDate(String orderDeliveredCustomerDate) {
        this.orderDeliveredCustomerDate = orderDeliveredCustomerDate;
    }

    public String getOrderEstimatedDeliveryDate() {
        return orderEstimatedDeliveryDate;
    }

    public void setOrderEstimatedDeliveryDate(String orderEstimatedDeliveryDate) {
        this.orderEstimatedDeliveryDate = orderEstimatedDeliveryDate;
    }

    @Override
    public String toString() {
        return "OrderInformation{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderPurchaseTimestamp='" + orderPurchaseTimestamp + '\'' +
                ", orderApprovedAt='" + orderApprovedAt + '\'' +
                ", orderDeliveredCarrierDate='" + orderDeliveredCarrierDate + '\'' +
                ", orderDeliveredCustomerDate='" + orderDeliveredCustomerDate + '\'' +
                ", orderEstimatedDeliveryDate='" + orderEstimatedDeliveryDate + '\'' +
                '}';
    }
}
