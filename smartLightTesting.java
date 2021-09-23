package com.xworkz.oops;

public class smartLightTesting 
{

	public static void main(String[] args) 
	{
		smartLight smartBulbs=new smartLight();
		smartBulbs.brand="syska";
		smartBulbs.color="white";
		smartBulbs.model="c5555a";
		smartBulbs.price=4000;
		System.out.println(smartBulbs.brand);
		System.out.println(smartBulbs.color);
		System.out.println(smartBulbs.model);
		System.out.println(smartBulbs.price);
		System.out.println("--------------------------------");
		smartBulbs.brightness();
		smartBulbs.schedule();
		smartBulbs.changing();
		smartBulbs.sync();
		System.out.println("\n.............2nd object..............");
		smartLight smartLightstrips=new smartLight();
		smartLightstrips.brand="philips";
		smartLightstrips.color="white";
		smartLightstrips.model="p8888e";
		smartLightstrips.price=2000;
		System.out.println(smartLightstrips.brand);
		System.out.println(smartLightstrips.color);
		System.out.println(smartLightstrips.model);
		System.out.println(smartLightstrips.price);
		System.out.println("--------------------------------");
		smartLightstrips.brightness();
		smartLightstrips.schedule();
		smartLightstrips.changing();
		smartLightstrips.sync();
	}

}
