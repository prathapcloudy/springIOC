package com.spring.fileReading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TradeDetails {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beann.xml");
		
		TradingCommuity tc = context.getBean("trade", TradingCommuity.class);
		
		tc.displayValues();

	}

}
