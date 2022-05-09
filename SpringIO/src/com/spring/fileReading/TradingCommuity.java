package com.spring.fileReading;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class TradingCommuity {
	
	private String equity;
	private String commodity;
	
	
	
	
	@Value("${trade.equity}")
	public void setEquity(String equity) {
		this.equity= equity;
	}
	
	@Required
	@Value("${trade.commodity}")
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	
	
	public void displayValues() {
		
		System.out.println("You have traded on " + equity + " in EQU" );
		System.out.println("You have traded on " + commodity +" in  MCX " );
		
	}
	
	

}
