package com.xworkz.oops;


// constructor overloading
public class registration 
{
	String name;
	String email;
	long phNo;
	
	// constructor number 1
	public registration(String name,long phNo) //can only use public modifier
	{	this.name=name;
		this.phNo=phNo;
		System.out.println("registration sucessful using "+this.phNo+" phone number");
		
	}
	
	// constructor number 2
	public registration(String name,String email)
	{	this.name=name;
		this.email=email;
		System.out.println("registration sucessful using "+this.email+" mail id");
	}
}
