package ocpjp.chap3.implement;

import ocpjp.chap3.Soundable;

public class NoSound implements Soundable {

	@Override
	public void makeSound() {
		System.out.println("silent");
	}
}
