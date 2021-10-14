package com.xworkz.oops;

public class Mail
{
	public String mailVerification(String mailId)
	{
		if(mailId.contains("@")&& mailId.contains(".com"))
		{
			System.out.println("Vaild mail Format");
			return "Valid";
		}
		else
		{
			System.out.println("Invalid mail Format");
			return "Invalid";
		}
	}
}
