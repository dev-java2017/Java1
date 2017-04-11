package com.anhdv.chap5.inheritance;

public class Child2 extends Child {

	public Child2() {

		System.out.println("Child2");
	}

	public Child2(int a) {
		super(a);
		System.out.println("xyz");
	}

	public static void main(String[] args) {
		//Child2 temp = new Child2();
		Child2 temp = new Child2(2);

	}
}
