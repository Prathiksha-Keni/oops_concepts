package com.xworkz.oops;
//Hybrid inheritance
public class productTest {

	public static void main(String[] args) {
		productBook productBook = new productBook();
		productBook.read();
		productBook.review();
		System.out.println("------------------------------------");
	    productWatch productWatch = new productWatch();
	    productWatch.displayTime();
	    productWatch.review();

	}

}
