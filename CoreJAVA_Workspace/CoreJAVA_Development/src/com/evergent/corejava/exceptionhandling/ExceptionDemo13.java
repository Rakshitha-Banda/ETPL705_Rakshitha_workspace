package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr= {1,2,3,4};
 	try {
	 System.out.println(arr[10]);
 	}
 	catch(ArrayIndexOutOfBoundsException e) {
	 System.out.println(e.getMessage());
	 System.out.println(e);
 	}
	}

}
