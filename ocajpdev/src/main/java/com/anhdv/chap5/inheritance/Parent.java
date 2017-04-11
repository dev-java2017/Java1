package com.anhdv.chap5.inheritance;

public class Parent {

	public Parent() {
		System.out.println("Parent");
	}

	public int age = 50;
	protected String name = "parent";
	private String privateChild = "private child";
	String otherChild = "other child";

	public String getPrivateChild() {
		return privateChild;
	}

	public static void main(String[] args) {

	}

}
