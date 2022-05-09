package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
    public static void main(String [] args) {
    
    	//example of inversion of control
    	//spring container creates the object for the user 
    	//spring container will read the config file based on the classes mentioned in the file it will create the object 
    	//using getBean method we can get the object
    	//no need to touch the source often
    	
    	//ApplicationContext is the interface
    	//ClassPathXmlApplicationContext is the implemented class of ApplicationContext interface 
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	System.out.println("first spring project");
    	Vodafone voda = context.getBean("vodafone", Vodafone.class);
    	voda.calling();
    	voda.Data();
	}
   
}
