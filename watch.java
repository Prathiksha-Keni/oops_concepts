package com.xworkz.oops;

public class watch 
{
	String brand;
	String color;
	String model;
	String category;//i.e Analog,Digital,Smart watch
	int price;
	String display;//i.e touch screen or not
	String shape;//i.e shape of the watch (circle,rectangle)
	
	public void alarm() 
	{
		System.out.println("Set alarm");
	}
	public void heartRate() 
	{
		System.out.println("Heart Rate monitoring");
	}
	public void sleep() 
	{
		System.out.println("Sleep Tracking");
	}
	public void reminders() 
	{
		System.out.println("Reminders to take care of health");
	}

}
