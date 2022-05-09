package com.spring.assesment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TelecomDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beann.xml");
		
		System.out.println("beann.xml file loaded");
		
		Airtel air = context.getBean("airtel", Airtel.class);
		
		air.activateServices();
	}

}
