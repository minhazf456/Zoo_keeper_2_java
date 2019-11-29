package com.codingdojo.java.zookeeper2;

public class Bat extends Mammal {
	
	public Bat() {
	this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("WoWW I can fly, Ah Ah Ah feel like losing energy !");
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Khapush Khapush ! Human's flesh is so scrumptious");
		displayEnergy();
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Attacking California!");
		displayEnergy();
	}
}
