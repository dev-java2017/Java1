package com.vult.chap3;

public class CompareEqualDemo {
	
	String a;
	
	public CompareEqualDemo(String a) {
		this.a = a;
	}
	
	public void changeObj(CompareEqualDemo demo1, CompareEqualDemo demo2) {
		demo1 = demo2;
	}
	
	public void changeValue(CompareEqualDemo demo) {
		this.a = demo.a;
	}
	
	public static void main(String[] args) {
		CompareEqualDemo demo1 = new CompareEqualDemo("demo 1");
		CompareEqualDemo demo2 = new CompareEqualDemo("demo 2");
		demo1.changeObj(demo1, demo2);
		System.out.println(demo1 == demo2);
		System.out.println(demo1.equals(demo2));
		
		demo2.changeValue(demo1);
		System.out.println(demo1 == demo2);
		System.out.println(demo1.equals(demo2));
		
		System.out.println(demo1.a);
		System.out.println(demo2.a);
	}
	
}
