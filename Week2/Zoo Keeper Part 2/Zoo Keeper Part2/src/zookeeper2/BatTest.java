package zookeeper2;
import zookeeper2.Bat;

public class BatTest {
	public static void main(String[] args) {
		Bat vampy = new Bat();
		
		vampy.attackTown();
		vampy.attackTown();
		vampy.attackTown();
		vampy.eatHumans();
		vampy.eatHumans();
		vampy.fly();
		vampy.fly();
		
		vampy.displayEnergy();
	}
}

