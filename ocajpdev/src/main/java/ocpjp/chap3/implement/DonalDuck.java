package ocpjp.chap3.implement;

import ocpjp.chap3.Duck;

public class DonalDuck extends Duck {

	public DonalDuck() {
		f = new FlyWithWings();
		s = new QuackSound();
	}

	@Override
	public void display() {
		System.out.println("donal duck");
	}
}
