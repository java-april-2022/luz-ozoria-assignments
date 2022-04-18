package zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The gorilla thew something!");
		this.energyLevel -= 5;
		
	}
	public void eatBananas() {
		System.out.println("The gorilla ate some bananas!");
		this.energyLevel += 10;
	}
	public void climb() {
		Sytem.out.println("The gorilla is climbing a tree!");
		this.energyLevel -= 10;
	}

}
