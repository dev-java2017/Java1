package ocpjp.chap3.implement;

import ocpjp.chap3.Fly;

public class NoFly implements Fly {

	@Override
	public void fly() {
		System.out.println("no fly");
	}
}
