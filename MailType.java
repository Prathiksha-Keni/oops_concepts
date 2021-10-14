package com.xworkz.oops;

public class MailType
{
	public String mailType(String mailId)
	{
		if(mailId.contains("gmail"))
		{
			System.out.println("Gmail");
			return "Valid";
		}
		else if(mailId.contains("yahoo"))
		{
			System.out.println("Yahoo");
			return "Valid";
		}
		else if(mailId.contains("outlook"))
		{
			System.out.println("Outlook");
			return "Valid";
		}
		else if(mailId.contains("hotmail"))
		{
			System.out.println("Hotmail");
			return "Valid";
		}
		else
		{
			System.out.println("Invalid mail Id");
			return "Invalid";
		}
	}

}
