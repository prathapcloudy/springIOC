package com.spring.looseCoup;

public class StudentBest {
	
	private Cheat cheat;
	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void startCheating() {
		
		cheat.cheat();
	}

}
