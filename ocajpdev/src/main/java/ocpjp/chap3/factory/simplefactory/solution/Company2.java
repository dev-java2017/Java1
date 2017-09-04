package ocpjp.chap3.factory.simplefactory.solution;

import ocpjp.chap3.factory.Person;

public class Company2 {

	public void display(int hour_work) {
		Person person = SimpleFactoryPerson.createPerson(hour_work);
		person.login_lucall();
		person.work();
		person.working_report();
	}

	public static void main(String[] args) {
		Company2 comp = new Company2();
		comp.display(6);
	}

}
