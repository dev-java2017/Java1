package com.anhdv.chap5.inheritance;

public class Alpha {
	String getType() {
		return "alpha";
	}
	public static void main(String[] args) {
		Gamma g1 = (Gamma) new Alpha();
//		Gamma g2 = new Beta();
//		System.out.println(g1.getType() + " " + g2.getType());
	}
}

class Beta extends Alpha {
	String getType() {
		return "beta";
	}
}

class Gamma extends Beta {
	String getType() {
		return "gamma";
	}


}
