package com.evergent.corejava.exceptionhandling;

//throws an exception will be executed method by method
public class ExceptionDemo7throws1 {
	String name=null;
	int k=0;
	public void myData(){
		System.out.println("one");
		try {
		System.out.println(name.length());}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("end");
		
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo7throws1 ex1=new ExceptionDemo7throws1();
			ex1.myData();
		}
		catch(Exception e) {
			System.out.println("i can handle :"+e);
		}

	}

}
