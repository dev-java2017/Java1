package ocpjp.chap3.factory.methodfactory.solution;

import ocpjp.chap3.factory.NormalPerson;
import ocpjp.chap3.factory.Person;

public class NormalPersonFactory extends AbstractMethodFactoryPerson {

	@Override
	protected Person getPerson(int working_hour) {
		person = new NormalPerson();
		return person;
	}
	@Override
	protected void sing() {
		System.out.println("thuong");

	}
}
