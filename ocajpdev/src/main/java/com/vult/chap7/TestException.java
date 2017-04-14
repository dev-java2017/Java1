package com.vult.chap7;

public class TestException extends Exception{
	private static final long serialVersionUID = 1L;

	public TestException() {
		super();
	}
	
	public TestException(String a) {
		super(a);
	}
	
	@Override
	public String getMessage() {
		return "Exception throwed";
	}
}
