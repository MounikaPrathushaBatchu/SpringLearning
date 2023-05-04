package com.nit.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		int hour = date.getHours();
		if(hour<12)
			return "Good Morning! " + user;
		else if(hour<16)
			return "Good Afternoon! " + user;
		else if(hour<20)
			return "Good Evening! " + user;
		else
			return "Good Night! " + user;
	}
}