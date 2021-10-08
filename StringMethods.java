package com.xworkz.oops;

public class StringMethods {

	public static void main(String[] args) {
		String institute="Xworkz Bangalore"; //literal way of object creation for string
		String name="Xworkz";
		//length method
		int length = institute.length();
		System.out.println(length);
		
		//char
		char charAt = institute.charAt(15);
		System.out.println(charAt);
		
		//Index of
		int indexOf = institute.indexOf('B');
		System.out.println(indexOf);
		
		//Last Index of
		int lastIndexOf = institute.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		//Concatenation
		String concat = institute.concat(" Btm");
		System.out.println(concat);
		
		//Ends With
		boolean endsWith = institute.endsWith("rkz");
		System.out.println(endsWith);
		
		//lower case
		String lowerCase = institute.toLowerCase();
		System.out.println(lowerCase);
		
		//upper case
		String upperCase = institute.toUpperCase();
		System.out.println(upperCase);
		
		//to char array
		char[] charArray = institute.toCharArray();
		System.out.println(charArray);
		
		//compare to
		int compareTo = institute.compareTo(name);
		System.out.println(compareTo);
		
		//contains
		boolean contains = institute.contains("rkz");
		System.out.println(contains);
		
		//starts with
		boolean startsWith = institute.startsWith("Xwor");
		System.out.println(startsWith);
		
		// index of 1st occurrence of the sub string
		int indexOf2 = institute.indexOf("wor");
		System.out.println(indexOf2);
		
		//index of 1st occurrence of the sub char have to specify the starting index value
		int indexOf3 = institute.indexOf("B",5 );
		System.out.println(indexOf3);
		
		//index of 1st occurrence of the sub string have to specify the starting index value
		int indexOf4 = institute.indexOf("Ban", 0);
		System.out.println(indexOf4);
		
		//last index of
		int lastIndexOf2 = institute.lastIndexOf("rkz");
		System.out.println(lastIndexOf2);
		
		
		
	

	}

}
