package com.xworkz.oops;

public class productBook extends product
 {
	public void read() {
		System.out.println("Reading");
		this.name="book";
		this.price=450;
		System.out.println("Product name is "+this.name);
		System.out.println("Price is "+this.price);

	}
	
}
