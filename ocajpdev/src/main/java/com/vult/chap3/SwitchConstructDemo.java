package com.vult.chap3;

public class SwitchConstructDemo {
	
	public static void main(String[] args) {
		int a = 5;
		switch (a) {
		case 3:
			System.out.println(3);
		case 4:
			System.out.println(4);
		case 5:
			System.out.println(5);
			a = a + 2;
		case 6:
			System.out.println(6);
		case 7:
			System.out.println(7);
			break;
		default:
			System.out.println("default");
		}
	}
}
