package com.evergent.corejava.rakshitha.application4;

//inheritance relation between Dairyproduct class and category class(Is_A relation) 
class DairyProduct extends Category 
{
	//intializing objects through constructor
  public DairyProduct(String name, int price) {
  	//super keyword is used to call super class constructor
      super(name, price);
 }
  //overriding method
  public String getName() {
      return name;
  }
}
