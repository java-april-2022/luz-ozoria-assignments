package zookeeper2;

import zookeeper2.Mammal;

public class Bat extends Mammal {
	
	int energyLevel = 300;
	
	public void fly() {
		System.out.println("Flap Flap!");
		this.energyLevel -= 50;
		
	}
	public void eatHumans() {
		System.out.println("The bat ate a human being!");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Ahhhhhhh! Fireee!!");
		this.energyLevel -= 100;
	}
}
