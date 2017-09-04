package ocpjp.chap3.factory.methodfactory.solution;

import ocpjp.chap3.factory.Person;
import ocpjp.chap3.factory.simplefactory.solution.Company2;

public class Company3 {

	public void display(int hour_work) {
		AbstractMethodFactoryPerson abstractPerson = new NormalPersonFactory();
		Person person = abstractPerson.createPerson(hour_work);
		person.login_lucall();
		person.work();
		person.working_report();
	}

	public static void main(String[] args) {
		Company2 comp = new Company2();
		comp.display(6);
	}

}
