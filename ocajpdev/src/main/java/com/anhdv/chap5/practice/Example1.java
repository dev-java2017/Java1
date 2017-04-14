package com.anhdv.chap5.practice;

public class Example1 {
	private Example1(Object o) {
		System.out.println("object");
	}
	/*private Example1(Long o) {
		System.out.println("object");
	}*/
	private Example1(Double[] ary) {
		System.out.println("ary");
	}

	static void call(Long x, Long y) {
        System.out.print("Long x, Long y");
    }

    static void call(int... x) {
        System.out.print("int... x");
    }
   /* static void call(Integer... x) {
        System.out.print("integer... x");
    }
//    static void call(int x, int y) {
//        System.out.print("int x");
//    }

    static void call(Number x, Number y) {
        System.out.print("Number x, Number y");
    }
*/
	public static void main(String[] args) {
		new Example1(null);

		int a = 3;
		call(a, a);
	}
}
