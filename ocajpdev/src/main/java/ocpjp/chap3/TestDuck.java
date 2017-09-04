package ocpjp.chap3;

import ocpjp.chap3.implement.DonalDuck;

public class TestDuck {
	public static void main(String[] args) {
		Duck donalDuck = new DonalDuck();
		donalDuck.display();
		donalDuck.performFly();
		donalDuck.performQuack();
	}
}
