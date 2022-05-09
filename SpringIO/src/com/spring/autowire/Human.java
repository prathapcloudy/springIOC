package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	// learning-- injecting dependencies for object
	// In xml file no need to inject dependency for heart using property tag
	// using autowire in xml we can inject dependency or in java class also we can
	// inject using @Autowire annotation
	//
	
	private Heart heart;
	
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	//@Autowired
	public Human( @Qualifier("heartBroken") Heart heart) {
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method is called");
	}
	
	public void startPumping() {
		
		if(heart != null) {
		   heart.pumping();
		   System.out.println("animal name is " + heart.getAnimalName() + " heartCount is ");
		}else {
			System.out.println("Your dead");
		}
	}
	
	
	
	

}
