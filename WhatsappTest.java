package com.xworkz.oops;

public class WhatsappTest {

	public static void main(String[] args)
	{
		// object of class WhatsAppV001
//		WhatsAppV001 whatsAppV001 = new WhatsAppV001();
//		whatsAppV001.chat();
//		whatsAppV001.createGroup();
		
		// object of class WhatsAppV002 since we have inherited properties of WhatsAppV001 all the methods in WhatsAppV001 is available in WhatsAppV002 
//		WhatsAppV002 whatsAppV002 =new WhatsAppV002();
//		whatsAppV002.profilePicture();
//		whatsAppV002.voiceCall();
//		whatsAppV002.chat();
//		whatsAppV002.createGroup();
		
		// object of class WhatsAppV003 since we have inherited properties of WhatsAppV001 all the methods in WhatsAppV001 is available in WhatsAppV002 and here we inherited properties of WhatsAppV002 
		WhatsAppV003 whatsAppV003 =new WhatsAppV003();
		whatsAppV003.videoCall();
		whatsAppV003.profilePicture();
		whatsAppV003.voiceCall();
		whatsAppV003.chat();
		whatsAppV003.createGroup();
	}

}
