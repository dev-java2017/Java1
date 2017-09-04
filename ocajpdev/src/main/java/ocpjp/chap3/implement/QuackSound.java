package ocpjp.chap3.implement;

import ocpjp.chap3.Soundable;

public class QuackSound implements Soundable {

	@Override
	public void makeSound() {
		System.out.println("quack");
	}
}
