package com.spring.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("calling airtel class using sim");
	}

	@Override
	public void Data() {
		System.out.println("Internet using airtel sim");
	}

}
