package com.company.LowLevelOperation;

import com.company.Entities.Customer;
import com.company.Entities.FavouriteCategories;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBFavouriteCategoriesController extends DBController{
    public static Object[] getFavoriteCategories(Connection connection) throws SQLException {
        int i=0;
        String productCategoryName=null;
        double orderItems=0;
        double price=0;
        double freightValue=0;
        double totalPrice=0;
        FavouriteCategories[] favouriteCategoriesList=new FavouriteCategories[5];
        try {
            ResultSet resultSet= connection.createStatement().executeQuery("SELECT * FROM top_product_categories ORDER BY total_price DESC");
            while (resultSet.next()&&i<5)
            {
                productCategoryName=resultSet.getString("product_category_name");
                orderItems=resultSet.getDouble("order_items");
                price=resultSet.getDouble("price");
                freightValue= resultSet.getDouble("freight_value");
                totalPrice= resultSet.getDouble("total_price");
                favouriteCategoriesList[i++]=new FavouriteCategories(productCategoryName,orderItems,price,freightValue,totalPrice);

            }


        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            throw e;
        }
        return favouriteCategoriesList;
    }
}
