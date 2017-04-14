package com.anhdv.chap5.practice;

public class Example2 {

	private static int count;

	public void test() {
		System.out.println("test Example2");
	}
	public static void main(String[] args) {
		Example2 ex2 = new Example2();
		Example2 ex21 = new Ex21();


		ex2.test();
		ex21.test();

		Ex21 ex211 = new Ex21();
		Example2 temp = (Example2)ex211;
//		temp.a = 2;
	}
}

class Ex21 extends Example2 {
	public int a = 1;
	public void test() {
		System.out.println("test Ex21");
	}
}
