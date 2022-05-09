package com.spring.ioc;

public class Vodafone implements Sim {

	@Override
	public void calling() {
     System.out.println("calling using vodafone sim");		
	}

	@Override
	public void Data() {
		System.out.println("internet using vodafone sim");		
	}

}
