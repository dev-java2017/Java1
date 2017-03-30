package com.vult.chap3;

public class OperatorPrecedenceDemo {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = --y + y-- + --x;
		System.out.println(z);
		
		System.out.println(1 + 2 + "abc");
		System.out.println("abc" + 1 + 2);
	}
}
