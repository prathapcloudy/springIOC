package com.spring.looseCoup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.Student;

public class Client {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beann.xml");
		
		StudentBest student = context.getBean("student", StudentBest.class);
		
		student.startCheating();
	}

}
