package com.evergent.corejava.exceptionhandling;


class InsufficientFundException extends Exception{
	public InsufficientFundException(String message) {
		//System.out.println(message);
		super(message);
	}
}
public class ExceptionDemo11 {
	//method that throws a custom checked exception
	public static void withdraw(double amount)throws InsufficientFundException{
		double balance=500.00;
		if(amount>balance) {
			throw new InsufficientFundException("InsufficientException for withdrawl");
		}
		else {
			System.out.println("withdrawl succesful");
		}}
	public static void main(String[] args) {
		try {
			withdraw(600.00);//this will trigger insufficient exception
			
		}
		catch(InsufficientFundException e) {
			System.out.println("caught insufficient exception:"+e.getMessage());
			System.out.println(e);
			System.out.println("program continues after handling the exception");
		}
		
	
		

	}}


