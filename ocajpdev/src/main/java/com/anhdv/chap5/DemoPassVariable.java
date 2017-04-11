package com.anhdv.chap5;

public class DemoPassVariable {
	Person anhdv = new Person();
	//Person2 anhdv2 = new Person2();

	void change(Person anhdv) {
		anhdv.age = 32;
		System.out.println("age in change method is " + anhdv.age);
		anhdv = new Person();
		anhdv.age = 18;
		System.out.println("age in change method after new object is " + anhdv.age);
	}

	public static void main(String[] args) {
		DemoPassVariable demo = new DemoPassVariable();
		System.out.println("demo.anhdv.age is " + demo.anhdv.age);

		demo.change(demo.anhdv);
		System.out.println("demo.anhdv.age after changeIt is " + demo.anhdv.age);

		/*demo.change2(demo.anhdv2);
		System.out.println("demo.anhdv2.age after changeIt is " + demo.anhdv2.getAnhdv().age);*/
	}

	/*void change2(Person2 anhdv2) {
		anhdv2.setAge(32);
		anhdv2 = new Person2();
		anhdv2.setAge(18);
	}*/
}
