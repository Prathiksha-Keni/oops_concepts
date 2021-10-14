package com.xworkz.oops;

public class UserDetails 
{
	public static void main(String[] args) 
	{
		validation user =new validation();
		boolean userNameValidation = user.userNameValidation("prathi", "99556644125555555", "abc@mail.com", "bangalore", "560070");
		if (userNameValidation) {
			System.out.println("registration sucessfull");
		} else {
			System.out.println("invalid format");
		}
	}
}
