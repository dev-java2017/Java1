package com.anhdv.chap3;

public class BitwiseOperators {

	public static void main(String[] args) {
		short x = 0B0011010101110010;
		short y = 0B0110101011101011;
		System.out.println(x & y);
		System.out.println(~x);
		System.out.println(x ^ y);
		System.out.println(x | y);
	}

}
