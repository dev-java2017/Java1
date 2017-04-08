package com.thanhmx.chap5;

public class BreakContinueDemo {
	public static void breakAndContinue() {
		/*int j = 0;
		while (true) {
			if (j == 3) {
				break;
			} else if (j == 2) {
				System.out.println("Hello");
				j++;
				continue;
			}
			System.out.println(j);
			j++;
		}*/
	}

	/*
	 * break and continue LABEL; may only be used within the block that has the
	 * label
	 */
	public static void breakAndContinueWithLabels() {
		/*int i = 0;
		FIRST: while (i < 5) {
			if (i == 2) {
				System.out.println("break FIRST");
				i++;
				break FIRST;
			}
			System.out.println(i);
			i++;
		}*/

		/*int j = 0;
		SECOND: while (j < 5) {
			if (j == 3) {
				System.out.println("continue SECOND");
				j++;
				continue SECOND;
			}
			System.out.println(j);
			j++;
		}*/

		/*int k = 0;
		OUTER: while (k < 3) {
			int l = 0;
			INNER: while (l < 3) {
				if (l == 1) {
					k++;
					System.out.println("XXX");
					continue OUTER;
				}
				System.out.println(k + " " + l);
				l++;
			}
			k++;
		}*/
	}
	
	public static void test01() {
		boolean isTrue = true;
		int a = 0;
		outer: for (int i = 0; i < 5; i++) {
			while (isTrue) {
				a++;
				break outer;
			}
		}

		int b = 0;
		for (int i = 0; i < 5; i++) {
			while (isTrue) {
				b++;
				break;
			}
		}
		System.out.println(a == b);
	}

	public static void main(String[] args) {
		breakAndContinue();
		breakAndContinueWithLabels();
		test01();
	}
}
