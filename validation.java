package com.xworkz.oops;

public class validation
{
	public boolean userNameValidation(String name,String phNo,String emailId,String city,String pincode)
	{
		boolean validUser=true;
		if(name.length()<4 && name.equals(null)) 
		{
			System.out.println("Invalid name Format");
			validUser=false;
		}
		else if(phNo.length()>10 && phNo.equals(null)) 
		{
			System.out.println("Invalid phone number Format");
			validUser=false;
		}
		else if(pincode.equals(null))
		{
			System.out.println("Invalid pincode Format");
			validUser=false;
		}
		else if(emailId.contains("@")&& emailId.contains(".com"))
		{
			
			validUser=false;
		}
		if (validUser) {
			return validUser;
		} else {
			return validUser;
		}
	}
}
