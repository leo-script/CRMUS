package com.company.Entities;

import com.company.MyApplication;

public class GeneralInformation {
    private int numberOfProducts;
    private int categoriesNumber;
    private int totalNumberOfUnicClients;
    private int numberOfOrders;
    private int numberDeliveredOrders;

    public GeneralInformation(int numberOfProducts, int categoriesNumber, int totalNumberOfUnicClients, int numberOfOrders, int numberDeliveredOrders) {
        this.numberOfProducts = numberOfProducts;
        this.categoriesNumber = categoriesNumber;
        this.totalNumberOfUnicClients = totalNumberOfUnicClients;
        this.numberOfOrders = numberOfOrders;
        this.numberDeliveredOrders = numberDeliveredOrders;
    }

    public GeneralInformation() {
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getCategoriesNumber() {
        return categoriesNumber;
    }

    public void setCategoriesNumber(int categoriesNumber) {
        this.categoriesNumber = categoriesNumber;
    }

    public int getTotalNumberOfUnicClients() {
        return totalNumberOfUnicClients;
    }

    public void setTotalNumberOfUnicClients(int totalNumberOfUnicClients) {
        this.totalNumberOfUnicClients = totalNumberOfUnicClients;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public int getNumberDeliveredOrders() {
        return numberDeliveredOrders;
    }

    public void setNumberDeliveredOrders(int numberDeliveredOrders) {
        this.numberDeliveredOrders = numberDeliveredOrders;
    }

    @Override
    public String toString() {
        return "\nGeneral Information: " +"\n"+
                "Number of products = " + MyApplication.ANSI_GREEN + this.numberOfProducts + MyApplication.ANSI_RESET + "\n"+
                "Categories number = " + MyApplication.ANSI_GREEN + this.categoriesNumber + MyApplication.ANSI_RESET + "\n"+
                "Total number of unique clients = " + MyApplication.ANSI_GREEN + this.totalNumberOfUnicClients + MyApplication.ANSI_RESET + "\n"+
                "Number of orders = " + MyApplication.ANSI_GREEN + this.numberOfOrders + MyApplication.ANSI_RESET + "\n"+
                "Number of delivered orders = " + MyApplication.ANSI_GREEN + this.numberDeliveredOrders + MyApplication.ANSI_RESET + "\n";
    }
}
