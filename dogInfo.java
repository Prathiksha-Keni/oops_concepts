package com.xworkz.oops;

public class dogInfo {

	public static void main(String[] args)
	{
		dog companion =new dog();
		companion.breed="bull dog";
		companion.color="brown";
		companion.size="small";
		companion.age=5;
		System.out.println(companion.breed);
		System.out.println(companion.color);
		System.out.println(companion.size);
		System.out.println(companion.age);
		System.out.println("--------------------------------");
		companion.eat();
		companion.sniff();
		companion.run();
		companion.sleep();
		System.out.println("\n.............2nd object..............");
		dog sporting =new dog();
		sporting.breed="pointer";
		sporting.color="white";
		sporting.size="medium";
		sporting.age=10;
		System.out.println(sporting.breed);
		System.out.println(sporting.color);
		System.out.println(sporting.size);
		System.out.println(sporting.age);
		System.out.println("--------------------------------");
		sporting.eat();
		sporting.sniff();
		sporting.run();
		sporting.sleep();
	}

}
