package com.evergent.corejava.rakshitha.application4;
import java.util.*;



public class GeneralStoreManagementSystem2_Rakshitha
{
     Scanner sc = new Scanner(System.in);
     //Has_A relationship between customercart class and GeneralStoreManagementSystem2_Rakshitha class
     CustomerCart cart = new CustomerCart();
    DiscountCalculator discountCalculator = new DiscountCalculator();
    TaxCalculator taxCalculator = new TaxCalculator();
    static {
    	System.out.println("Welcome to General Store Management Application!");
    }

    public void start() 
    {
        while(true) 
        {
            System.out.println("  Main Menu      ");
            System.out.println("=================");
            System.out.println("1. Buy products");
            System.out.println("2. Discount of products");
            System.out.println("3. Payment after discount");
            System.out.println("4. Show list of items that customer has purchased");
            System.out.println("5. Exit");
            System.out.println("=================");
            System.out.println("Enter your choice (1-5):");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice)
            {
                case 1 : showProductMenu();
                		break;
                case 2 : showDiscount(); 
                		break;
                case 3 : makePayment(); 
                		break;
                case 4 : cart.showItems();
                		break;
                case 5 : {
                    System.out.println("Thank you for coming!");
                    System.exit(0);
                }
                default : System.out.println("Invalid choice, please try again.");
                		break;
            }
        }
    }

    public void showProductMenu() 
    {
        while(true) 
        {
            System.out.println("  Product categories      ");
            System.out.println("=================");
            System.out.println("1. Dairy Products");
            System.out.println("2. Beverages");
            System.out.println("3. Snacks");
            System.out.println("4. Vegetables");
            System.out.println("5. Go to Main Menu");
            System.out.println("=================");
            System.out.println("Enter your choice (1-5):");

            int categoryChoice = Integer.parseInt(sc.nextLine());

            switch(categoryChoice) {
                case 1 : showDairyProducts(); 
                		break;
                case 2 : showBeverages();
                		break;
                case 3 : showSnacks();
                		break;
                case 4 : showVegetables();
                		break;
                case 5 : showProductMenu();
                		break;
                default : System.out.println("Invalid choice, please try again."); break;
            }
        }
    }

    public void showDairyProducts() 
    {
        while(true) 
        {
            System.out.println("  Dairy Products      ");
            System.out.println("=================");
            System.out.println("1. Milk (Rs.10)");
            System.out.println("2. Butter (Rs.100)");
            System.out.println("3. Go to Main Menu");
            System.out.println("=================");
            System.out.println("Enter your choice (1-3):");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1: addToCart(new DairyProduct("Milk", 10));
                		break;
                case 2 : addToCart(new DairyProduct("Butter", 100));
                		break;
                case 3 : start();
                		break;
                default :System.out.println("Invalid choice, please try again.");
                		break;
            }
        }
    }

    public void showBeverages()
    {
        while(true) 
        {
            System.out.println("  Beverages      ");
            System.out.println("=================");
            System.out.println("1. Soda (Rs.50)");
            System.out.println("2. Juice (Rs.70)");
            System.out.println("3. Pepsi (Rs.100)");
            System.out.println("4. Go to Main Menu");
            System.out.println("=================");
            System.out.println("Enter your choice (1-4):");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1 : addToCart(new Beverage("Soda", 50));
                		break;
                case 2: addToCart(new Beverage("Juice", 70));
                		break;
                case 3 : addToCart(new Beverage("Pepsi", 100));
                		break;
                case 4 :  start();
                		break;
                default : System.out.println("Invalid choice, please try again.");
                		break;
            }
        }
    }

    public void showSnacks() 
    {
        while(true)
        {
            System.out.println("  Snacks      ");
            System.out.println("=================");
            System.out.println("1. Chips (Rs.50)");
            System.out.println("2. Cookies (Rs.500)");
            System.out.println("3. Nuts (Rs.1000)");
            System.out.println("4. Go to Main Menu");
            System.out.println("=================");
            System.out.println("Enter your choice (1-4):");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1: addToCart(new Snack("Chips", 50));
                		break;
                case 2 :addToCart(new Snack("Cookies", 500));
                		break;
                case 3: addToCart(new Snack("Nuts", 1000));
                		break;
                case 4 :start();
                		break;
                default : System.out.println("Invalid choice, please try again.");
                		break;
            }
        }
    }

    public void showVegetables() 
    {
        while(true)
        {
            System.out.println("  Vegetables      ");
            System.out.println("=================");
            System.out.println("1. Tomato (Rs.50/kg)");
            System.out.println("2. Brinjal (Rs.40/kg)");
            System.out.println("3. Lady's Finger (Rs.60/kg)");
            System.out.println("4. Go to Main Menu");
            System.out.println("=================");
            System.out.println("Enter your choice (1-4):");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1: addToCart(new Vegetable("Tomato", 50));
                		break;
                case 2 : addToCart(new Vegetable("Brinjal", 40));
                		break;
                case 3 : addToCart(new Vegetable("Lady's Finger", 60));
                		break;
                case 4 : start();
                		break;
                default:System.out.println("Invalid choice, please try again.");
                		break;
            }
        }
    }
    //copy constructor

    public void addToCart(Category product)
    {
        System.out.println("Enter Quantity:");
        int quantity = Integer.parseInt(sc.nextLine());
        cart.addProduct(product, quantity);
    }

    public void showDiscount() 
    {
        int discount = discountCalculator.calculateDiscount(cart.getTotalAmount());
        System.out.println("The total amount is: " + cart.getTotalAmount());
        System.out.println("Discount amount is: Rs." + discount);
        System.out.println();
    }

    public void makePayment() 
    {
        int discount = discountCalculator.calculateDiscount(cart.getTotalAmount());
        int tax = taxCalculator.calculateTax(cart.getTotalAmount());
        int netAmount = cart.getTotalAmount() + tax - discount;
        System.out.println("The total amount is: " + cart.getTotalAmount());
        System.out.println("Discount amount is: Rs." + discount);
        System.out.println("Tax amount is: Rs." + tax);
        System.out.println("The net amount to pay is: Rs." + netAmount);
        System.out.println();
    }



    public static void main(String[] args)
    {
        GeneralStoreManagementSystem2_Rakshitha system = new GeneralStoreManagementSystem2_Rakshitha();
        system.start();
    }
}


