package com.thanhmx.chap5;

public class ForLoopDemo {
	
	public static void testBase() {
		/*for (int a = 0, b = 2, int c = 10; a < 10; a++) {
		System.out.println("aaa");
		}*/
//		for (;;);
//		for (;;){}
//		for (;;) {}
		/*for (;;) {
	        ;
	        break;
	    }*/
		
		/*for (int x = 0; x < 3; x++) {
			System.out.println("a" + x);
			System.exit(0);
			System.out.println("a");
		}*/
	}
	
	public static void testForAndArray() {
		/*int [ ][ ] array2D = new int[3][2];
		int count = 0;
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				++count;
			} 
		}
		System.out.println("count " + count);*/
	}
	
	public static void test01() {
		/*int sum = 0;
		int product = 0;
		for (int i = 1; i <= 5; i++)
		   product = i * i;;
		   sum += product;
		   System.out.println(sum);*/
	}
	
	public static void test02() {
		/*int i = 0;
		for (; i<5;) {
			System.out.println(i);
			i++;
		}*/
	}
	
	public static void test03() {
		/*int b = 3;
		int c = 3;
		for (int a = 1;  b != 1; getDataTest03()) {
			b = b - a;
			System.out.println(b);
		}
		System.out.println(c);*/
	}
	
	public static void getDataTest03() {
		/*for (int x = 0; x < 3; x++) {
			System.out.println("Hello.");
			if (x == 1) {
				break;
			}
			System.out.println("Goodbye.");
		}*/
	}
	
	public static void test04() {
		/*int x;
		long x2;
		Long [] la = {7L, 8L, 9L};
		int [][] twoDee = {{1,2,3}, {4,5,6}, {7,8,9}};
		String [] sNums = {"one", "two", "three"};
		for (long y : la );
		for (x2 : la);
		for (int[] n : twoDee);
		for (int n2 : twoDee[2]);
		for (int x2 : twoDee);
		for (Object n2 : twoDee[2]);
		for (Double x3 : la);
		for (String s : sNums);
		for (Dog d : animals);
		for (Object o : sNums);*/
	}
	
	public static void test05() {
		/*int i = 0;
		int l = 0;
        for (int c = 0, System.out.println("Hello"); l < 2 && true ; l++, System.out.println("GoodBye")) {
            System.out.println(i);
            System.out.println(l);
        }*/
	}
	
	public static void test06() {
		/*int num1 = 8;
        int num2 = 8;
        for(int i = 0; i < 3; i++)
            if (num1 == num2)
                try {
                	System.out.println("demo");
                } catch (Exception e) {
                	System.out.println(e);
                }
        System.out.println("outside loop");*/
	}
	
	public static void main(String[] args) {
		testBase();
		testForAndArray();
		test01();
		test02();
		test03();
		test04();
		test05();
		test06();
	}
}
