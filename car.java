package com.xworkz.oops;

public class car
{
	String brand;
	String color;
	String FuelType;//i.e either petrol or diesel
	String ManualOrAutomatic;
	String model;
	String bodyType;//i.e SEDAN/HATCHBACK/SUV
	int price;
	
	public void GearChange() 
	{
		System.out.println("Gear changed");
	}
	public void playMusic() 
	{
		System.out.println("Playing music");
	}
	public void accelerator()
	{
		System.out.println("accelerated");
	}
	public void seatAdjustment() 
	{
		System.out.println("Seat adjusted");
	}
	public void lights() 
	{
		System.out.println("head lights on/off");
		System.out.println("indicator lights on/off");
		System.out.println("wind shield on/off");
	}
	public void autoWindowRise() 
	{
		System.out.println("Window rised up automatically");	
	}

}
