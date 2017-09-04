package com.anhdv.chap5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class A {
	public int getCode(){ return 2;}
}
class AA extends A {
	public int  getCode(){ return 3;}
}
public class TestClass {
	static Collection c = new ArrayList<Object>();

	public static void main(String[] args) throws Exception {
		A a = new A();
		A aa = new AA();
		System.out.println("12345".charAt(6));
		Iterator it = c.iterator();
		while(it.hasNext()) {
			String[] a = {"a", "b"};
Runtime.getRuntime().exec(a);
		}

	}
	public int getCode() {
		return 1;
	}
}


