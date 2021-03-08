package com.company;
import com.company.Controller.CustomerController;
import com.company.Controller.FavouriteCategoriesController;
import com.company.Controller.OrderInformationController;
import com.company.Entities.OrderInformation;

import java.sql.SQLException;
import java.util.Scanner;

public class MyApplication {
    private  final FavouriteCategoriesController favouriteCategoriesController;
    private final OrderInformationController orderInformationController;
    private final CustomerController customerController;
    private final Scanner scanner;

    public MyApplication() throws SQLException, ClassNotFoundException {
        scanner = new Scanner(System.in);
        customerController=new CustomerController();
        orderInformationController=new OrderInformationController();
        favouriteCategoriesController=new FavouriteCategoriesController();
    }

    public void start() {
        while(true) {
            System.out.println();
            System.out.println("Welcome to CRMUS!");
            System.out.println("Select option: ");
            System.out.println("1. Get customers by id");
            System.out.println("2. Top 5 categories");
            System.out.println("3. Top 5 products");
            System.out.println("4. Get order information by id");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-4): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.print("Please enter customer id: ");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    getCustomerByIdMenu(id);
                }
                else if (option == 2) {
                    getFavouriteCategoriesMenu();

                }
                else if (option == 3) {
//                    getTop5Products();//TODO
                }
                else if(option == 4){
                    System.out.print("Please enter order id: ");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    getOrderByIdMenu(id);
                }
                else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("********************");



        }
    }
    public void getCustomerByIdMenu(String customerId) throws SQLException {
        String response = customerController.getCustomerById(customerId);//TODO
        System.out.println(response);
    }
    public  void getOrderByIdMenu(String orderId){
        String response= orderInformationController.getOrderInformationById(orderId);
        System.out.println(response);
    }
    public void getFavouriteCategoriesMenu(){
        try {
            String[] favouriteCategories= favouriteCategoriesController.getFavouriteCategories();
            for(int i=0;i<favouriteCategories.length;i++){
                System.out.println(favouriteCategories[i]);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
