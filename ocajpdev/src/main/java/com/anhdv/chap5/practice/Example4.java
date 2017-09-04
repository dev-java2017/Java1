package com.anhdv.chap5.practice;

public class Example4 {
	/*public static void main(String[] args) {
		Creature c1 = new Creature();
		Creature c2 = new Bird();
//		Bird b1 = (Bird) c1; // Line 1 --> runtime error
//		Bird b2 = (Falcon) c2; // Line 2 --> runtime
//		Bird b3 = c2; // Line 3
		Bird b4 = new Falcon(); // Line 4
//		Bird b5 = (Bird) new Creature(); // Line 5
//		Falcon f1 = b4; // Line 6
		double x = 11e1;
		Object x = null;
		System.out.println(x + true); //1
		System.out.println(true + x); //2
		System.out.println(x + x); //3


		System.out.println(x);
	}*/
	public static long main(String[] args){
		System.out.println("Hello");
		return 10L;
	}

}

class Creature {}
class Bird extends Creature {}
class Falcon extends Bird {}
