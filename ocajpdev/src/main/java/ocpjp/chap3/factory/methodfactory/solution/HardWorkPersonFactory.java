package ocpjp.chap3.factory.methodfactory.solution;

import ocpjp.chap3.factory.HardWorkPerson;
import ocpjp.chap3.factory.Person;

public class HardWorkPersonFactory extends AbstractMethodFactoryPerson {

	@Override
	protected Person getPerson(int working_hour) {
		HardWorkPerson a = new HardWorkPerson();
		if (working_hour > 9) {
			a.setAge(30);
		} else if (working_hour < 9) {
			a.setAge(18);
		}
		a.setAge(8);
		return a;
	}

	@Override
	protected void sing() {
		System.out.println("cao");

	}

}
