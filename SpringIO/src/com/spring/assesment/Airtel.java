package com.spring.assesment;

public class Airtel {
	
	private Services service;
	
	public Airtel() {
		
	}
	
	
	public Airtel(Services service) {
		this.service = service;
	}
	
	public void activateServices() {
		service.service();
	}
}
