package com.anhdv.chap3;

public class LogicalOperation {

	public static void main(String[] args) {
		int x = 0;
		System.out.println(false & ++x == 0);
		System.out.println(x);
		System.out.println(!false);
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(true | ++x == 0);
		System.out.println(x);
	}
}
