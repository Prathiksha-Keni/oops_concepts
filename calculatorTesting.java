package com.xworkz.oops;

public class calculatorTesting {

	public static void main(String[] args) {
		calculator scientific=new calculator();
		scientific.brand="casio";
		scientific.color="black";
		scientific.model="c3698o";
		scientific.price=8000;
		scientific.category="scientific";
		System.out.println(scientific.brand);
		System.out.println(scientific.color);
		System.out.println(scientific.model);
		System.out.println(scientific.price);
		System.out.println(scientific.category);
		System.out.println("--------------------------------");
		scientific.calculation();
		scientific.equation();
		scientific.convert();
		scientific.graphs();
		System.out.println("\n.............2nd object..............");
		calculator graphing=new calculator();
		graphing.brand="Texas";
		graphing.color="white";
		graphing.model="c1486o";
		graphing.price=9000;
		graphing.category="graphing";
		System.out.println(graphing.brand);
		System.out.println(graphing.color);
		System.out.println(graphing.model);
		System.out.println(graphing.price);
		System.out.println(graphing.category);
		System.out.println("--------------------------------");
		graphing.calculation();
		graphing.equation();
		graphing.convert();
		graphing.graphs();

	}

}
