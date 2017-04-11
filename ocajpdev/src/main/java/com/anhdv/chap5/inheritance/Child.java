package com.anhdv.chap5.inheritance;

public class Child extends Parent {

	public Child() {
		System.out.println("Child");
	}

	public Child(int a) {
		System.out.println("a  = " + a);
	}

//	int otherChild = 12;

	public void testSuper() {
//		System.out.println(super.privateChild);
//		System.out.println(super.otherChild);
	}

	public static void main(String[] args) {
		/*Parent var1 = new Child();
		var1.getPrivateChild();*/

	}

}
