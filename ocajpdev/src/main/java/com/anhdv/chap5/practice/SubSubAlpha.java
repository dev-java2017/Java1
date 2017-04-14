package com.anhdv.chap5.practice;

class Alpha {
	static String s = " ";

	protected Alpha() {
		s += "alpha ";
	}
}

public class SubSubAlpha extends SubAlpha {
	private SubSubAlpha() {
		s += "subsub ";
	}

	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
