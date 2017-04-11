package com.anhdv.chap3;

public class ShiftOperation {

	public static void main(String[] args)  {
		System.out.println(1 << 8);
		System.out.println(8 >> 2);
		System.out.println(-1 >> 1);
		System.out.println(-1 >>> 1);

		int i = 0;
		while (i < 3)
			System.out.println(++i);
	}
}
