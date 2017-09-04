package ocpjp.chap3.factory.simplefactory.problem;

import ocpjp.chap3.factory.HardWorkPerson;
import ocpjp.chap3.factory.LazyPerson;
import ocpjp.chap3.factory.NormalPerson;
import ocpjp.chap3.factory.Person;

public class Company {

	public void display(int hour_work) {
		Person person;

		if (hour_work > 9) {
			person = new HardWorkPerson();
		} else if (hour_work < 7) {
			person = new LazyPerson();
		} else {
			person = new NormalPerson();
		}

		person.login_lucall();
		person.work();
		person.working_report();

	}

	public static void main(String[] args) {
		Company comp = new Company();
		comp.display(6);
	}

}
