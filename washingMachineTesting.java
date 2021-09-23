package com.xworkz.oops;

public class washingMachineTesting {

	public static void main(String[] args)
	{
		washingMachine topload=new washingMachine();
		topload.brand="LG";
		topload.category="topload";
		topload.color="black";
		topload.model="l5824g";
		topload.price=75000;
		topload.capacity="5kg";
		System.out.println(topload.brand);
		System.out.println(topload.category);
		System.out.println(topload.color);
		System.out.println(topload.model);
		System.out.println(topload.price);
		System.out.println("--------------------------------");
		topload.quickWash();
		topload.dryer();
		topload.delay();
		System.out.println("\n.............2nd object..............");
		washingMachine forntload=new washingMachine();
		forntload.brand="IFB";
		forntload.category="forntload";
		forntload.color="white";
		forntload.model="i7536b";
		forntload.price=80000;
		System.out.println(forntload.brand);
		System.out.println(forntload.category);
		System.out.println(forntload.color);
		System.out.println(forntload.model);
		System.out.println(forntload.price);
		System.out.println("--------------------------------");
		forntload.quickWash();
		forntload.dryer();
		forntload.delay();
	}
}
