package com.spring.autowire;

public class Heart {
	
	private String animalName;
	private int heartCount;
	
	
	
	public String getAnimalName() {
		return animalName;
	}

	public int getHeartCount() {
		return heartCount;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	public void setHeartCount(int count) {
		this.heartCount = count;
	}
	
	public void pumping() {
		
		
		System.out.println("Your heart is pumping");
		System.out.println("Alive");
	}

}
