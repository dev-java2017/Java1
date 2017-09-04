package ocpjp.chap3.factory.simplefactory.solution;

import ocpjp.chap3.factory.HardWorkPerson;
import ocpjp.chap3.factory.LazyPerson;
import ocpjp.chap3.factory.NormalPerson;
import ocpjp.chap3.factory.Person;

public class SimpleFactoryPerson {
	public static Person createPerson(int hour_work) {

		Person person;

		if (hour_work > 9) {
			person = new HardWorkPerson();
		} else if (hour_work < 7) {
			person = new LazyPerson();
		} else {
			person = new NormalPerson();
		}

		return person;
	}
}
