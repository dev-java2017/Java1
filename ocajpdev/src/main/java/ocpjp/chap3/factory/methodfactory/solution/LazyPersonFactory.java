package ocpjp.chap3.factory.methodfactory.solution;

import ocpjp.chap3.factory.LazyPerson;
import ocpjp.chap3.factory.Person;

public class LazyPersonFactory extends AbstractMethodFactoryPerson {

	@Override
	protected Person getPerson(int working_hour) {
		return new LazyPerson();
	}
	@Override
	protected void sing() {
		System.out.println("thap");

	}
}
