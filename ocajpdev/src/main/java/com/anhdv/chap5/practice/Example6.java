package com.anhdv.chap5.practice;

public class Example6 {
	public static void main(String[] args) {
		/*Type first = new SubType();
		System.out.println(first.getTypeName());*/
		new Clidlet().flipper();
	}
}

class Type {
	public Object getTypeName() {
		return "Type";
	}
}
class Clidlet extends Clidder {
	static {
		System.out.println("bbbb");
	}
	public final void flipper() {
		System.out.println("Clidlet");
	}

	static void main(String[] args) {
		new Clidlet().flipper();
	}
}

class SubType extends Type {
	public String getTypeName() {
		return "SubType";
	}
}

class Clidder {
	static {
		System.out.println("aaaaaa");
	}
	private final void flipper() {
		System.out.println("Clidder");
	}
}

