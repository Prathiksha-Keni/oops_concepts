package com.xworkz.oops;

public class watchTesting {

	public static void main(String[] args)
	{
		watch smartWatch=new watch();
		smartWatch.brand="apple watch";
		smartWatch.category="smart watch";
		smartWatch.color="black";
		smartWatch.display="touch screen";
		smartWatch.model="a1524e";
		smartWatch.price=45000;
		smartWatch.shape="rectangle";
		System.out.println(smartWatch.brand);
		System.out.println(smartWatch.category);
		System.out.println(smartWatch.color);
		System.out.println(smartWatch.display);
		System.out.println(smartWatch.model);
		System.out.println(smartWatch.price);
		System.out.println(smartWatch.shape);
		System.out.println("--------------------------------");
		smartWatch.alarm();
		smartWatch.heartRate();
		smartWatch.reminders();
		smartWatch.sleep();
		System.out.println("\n.............2nd object..............");
		watch digitalWatch=new watch();
		digitalWatch.brand="fit-bit";
		digitalWatch.category="digital watch";
		digitalWatch.color="blue";
		digitalWatch.display="not a touch screen";
		digitalWatch.model="f1545b";
		digitalWatch.price=50000;
		digitalWatch.shape="circle";
		System.out.println(digitalWatch.brand);
		System.out.println(digitalWatch.category);
		System.out.println(digitalWatch.color);
		System.out.println(digitalWatch.display);
		System.out.println(digitalWatch.model);
		System.out.println(digitalWatch.price);
		System.out.println(digitalWatch.shape);
		System.out.println("--------------------------------");
		digitalWatch.alarm();
		digitalWatch.heartRate();
		digitalWatch.reminders();
		digitalWatch.sleep();
	}
}
