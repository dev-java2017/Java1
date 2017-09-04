package ocpjp.chap3.implement;

import ocpjp.chap3.Duck;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		f = new NoFly();
		s = new NoSound();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
