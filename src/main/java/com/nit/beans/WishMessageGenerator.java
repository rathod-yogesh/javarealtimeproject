package com.nit.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date; //HAS-A property (soupporting compisition)
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
		
	}
	public void setDate (Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
	}
	
	//business method
	
	public String generateMessage(String user) {
		Date date=new Date();
		
		System.out.println("WishMessageGenerator.generateMessage()");
		int hour=date.getHours();	//24 hours format (0 to23)
		//generate wish message
		if(hour<12){
			return "Gud Morning::" +user;
		}
		else if(hour<16){
			return "Gud Afternoon::" +user;
		}
		else if(hour<20){
			return "Gud Evening::" +user;
		}
		else{
			return "Gud Night::" +user;
		}
	}
}
