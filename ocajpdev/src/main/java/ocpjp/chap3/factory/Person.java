package ocpjp.chap3.factory;

public abstract class Person {
	protected String name;
	protected int age;
	protected String status;

	public void login_lucall() {
		System.out.println("login_lucall");
	}
	public  void work() {
		System.out.println("work");
	}

	public void working_report() {
		System.out.println("working_report");
	}

	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
