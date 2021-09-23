package com.xworkz.oops;

public class smartAssistanceTesting {

	public static void main(String[] args) 
	{
		smartAssistance voiceSpeaker=new smartAssistance();
		voiceSpeaker.brand="Google";
		voiceSpeaker.color="black";
		voiceSpeaker.model="g4286e";
		voiceSpeaker.price=97000;
		voiceSpeaker.display="no touch display";
		System.out.println(voiceSpeaker.brand);
		System.out.println(voiceSpeaker.color);
		System.out.println(voiceSpeaker.model);
		System.out.println(voiceSpeaker.price);
		System.out.println(voiceSpeaker.display);
		System.out.println("--------------------------------");
		voiceSpeaker.controlDevice();
		voiceSpeaker.musicStreaming();
		voiceSpeaker.information();
		voiceSpeaker.reminders();
		System.out.println("\n.............2nd object..............");

		smartAssistance displaySpeaker=new smartAssistance();
		displaySpeaker.brand="Amazon";
		displaySpeaker.color="white";
		displaySpeaker.model="w8091n";
		displaySpeaker.price=66000;
		displaySpeaker.display="touch display";
		System.out.println(displaySpeaker.brand);
		System.out.println(displaySpeaker.color);
		System.out.println(displaySpeaker.model);
		System.out.println(displaySpeaker.price);
		System.out.println(displaySpeaker.display);
		System.out.println("--------------------------------");
		displaySpeaker.controlDevice();
		displaySpeaker.musicStreaming();
		displaySpeaker.information();
		displaySpeaker.reminders();
	}

}
