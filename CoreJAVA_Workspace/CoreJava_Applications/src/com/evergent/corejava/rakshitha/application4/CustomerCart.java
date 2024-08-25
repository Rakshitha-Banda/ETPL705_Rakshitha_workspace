package com.evergent.corejava.rakshitha.application4;

import java.util.ArrayList;
import java.util.List;

 class CustomerCart {

	  final List<String> products = new ArrayList<>();
	   final  List<Integer> quantities = new ArrayList<>();//final variable
	    static int totalAmount = 0; //static variable

	    public void addProduct(Category product, int quantity) {
	        products.add(product.getName());
	        quantities.add(quantity);
	        totalAmount += product.getPrice() * quantity;
	    }

	    public int getTotalAmount() {
	        return totalAmount;
	    }

	    public void showItems() {
	        System.out.println("Products      Quantity");
	        System.out.println("=======================");
	        for (int i = 0; i < products.size(); i++) {
	            System.out.println(products.get(i) + "          " + quantities.get(i));
	        }
	    }
}
