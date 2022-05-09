package com.spring.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int id;
	private String studentName;

	public Student() {
	}
	
//	injecting the values for dependencies(literal) using constructor
	public Student(String studentName, int id) {
		
		this.studentName= studentName;
		this.id = id ;
	}

//	injecting the values for the dependencies(literal) using setter method
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}

	public void displayInfo() {
		System.out.println("student id is : " + id + " studentName is :" + studentName);
	}
	
}
