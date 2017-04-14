package com.anhdv.chap5.practice;

public class Example3 {
	public Example3() {
		System.out.println("Example3");
	}
	public static void main(String... args) {
		System.out.println("Demo");
		new Ex31();
	}
}

class Ex31 extends Example3 {

	Example3 ob = new Example3();
	Ex31() {
		System.out.println("Ex31");
	}
}
//demo
//example3
//ex31