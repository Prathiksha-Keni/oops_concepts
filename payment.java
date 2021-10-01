package com.xworkz.oops;

//constructor overloading
public class payment 
{
	long card;
	String UPI;
	int cash;
	
	// constructor number 1
	public payment(int cash) 
	{	this.cash=cash;
		System.out.println("payment sucessful using cash");
		
	}
	
	// constructor number 2
	public payment(String UPI)
	{	this.UPI=UPI;
		System.out.println("payment sucessful using UPI");
	}
	
	// constructor number 3
		public payment(long card)
		{	this.card=card;
			System.out.println("payment sucessful using Card");
		}
}
