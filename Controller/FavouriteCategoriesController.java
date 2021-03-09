package com.company.Controller;

import com.company.Controller.Interfaces.FavouriteCategoriesInterface;
import com.company.Entities.FavouriteCategories;
import com.company.LowLevelOperation.DBCustomerController;
import com.company.LowLevelOperation.DBFavouriteCategoriesController;

import java.sql.Connection;
import java.sql.SQLException;

public class FavouriteCategoriesController implements FavouriteCategoriesInterface {
    public Connection connection=DBFavouriteCategoriesController.getConnection();

    public FavouriteCategoriesController() throws SQLException, ClassNotFoundException {
    }

    @Override
    public String[] getFavouriteController() throws SQLException {
        Object[] favouriteCategories=DBFavouriteCategoriesController.getFavoriteCategories(this.connection);
        String[] favouriteCategoriesToString=new String[favouriteCategories.length];
        for (int i=0;i< favouriteCategories.length;i++){

            favouriteCategoriesToString[i]= i + 1 + ". " + favouriteCategories[i].toString();
        }
        return favouriteCategoriesToString;
    }
}
