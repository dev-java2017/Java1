package ocpjp.chap3.factory.methodfactory.solution;

import ocpjp.chap3.factory.Person;

public abstract class AbstractMethodFactoryPerson {
	Person person;
	public Person createPerson(int working_hour) {
		return getPerson(working_hour);
	}

	protected abstract Person getPerson(int working_hour);


	protected abstract void sing();
}
