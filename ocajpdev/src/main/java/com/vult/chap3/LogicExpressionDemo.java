package com.vult.chap3;

public class LogicExpressionDemo {
	public static void main(String[] args) {
		LogicExpressionDemo demo = new LogicExpressionDemo();

		boolean b = demo.isTrue("param 1") || demo.isFalse("param 2") && demo.isFalse("param 3") | demo.isFalse("param 4");
		System.out.println("Expression is " + b);
	}
	
	public boolean isTrue(String msg) {
		System.out.println(msg);
		return true;
	}
	
	public boolean isFalse(String msg) {
		System.out.println(msg);
		return false;
	}
}
