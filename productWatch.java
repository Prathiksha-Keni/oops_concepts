package com.xworkz.oops;

public class productWatch extends product
{
	public void displayTime() {
		System.out.println("Time displayed");
		this.name="watch";
		this.price=1500;
		System.out.println("Product name is "+this.name);
		System.out.println("Price is "+this.price);
	}
	
}
