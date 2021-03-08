package com.company.Controller;

import com.company.Entities.FavouriteCategories;
import com.company.LowLevelOperation.DBCustomerController;
import com.company.LowLevelOperation.DBFavouriteCategoriesController;

import java.sql.Connection;
import java.sql.SQLException;

public class FavouriteCategoriesController {
    Connection connection=DBFavouriteCategoriesController.getConnection();

    public FavouriteCategoriesController() throws SQLException, ClassNotFoundException {
    }
    public String[] getFavouriteCategories() throws SQLException {
        Object[] favouriteCategories=DBFavouriteCategoriesController.getFavoriteCategories(connection);
        String[] favouriteCategoriesToString=new String[favouriteCategories.length];
        for (int i=0;i< favouriteCategories.length;i++){
            favouriteCategoriesToString[i]=favouriteCategories[i].toString();
        }
        return favouriteCategoriesToString;
    }

}
