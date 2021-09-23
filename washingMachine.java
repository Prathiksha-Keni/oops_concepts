package com.xworkz.oops;

public class washingMachine 
{
	String brand;
	String color;
	String model;
	String category;//i.e top load,front load
	int price;
	String capacity;//i.e 5kg,8kg load capacity

	public void quickWash() 
	{
		System.out.println("Quick wash");
	}
	public void dryer()
	{
		System.out.println("dry clothes");
	}
	public void delay() 
	{
		System.out.println("delay wash");
	}
}
