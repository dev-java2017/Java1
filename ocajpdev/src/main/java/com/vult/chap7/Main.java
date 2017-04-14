package com.vult.chap7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Start");
		Main main = new Main();
		try {
			System.out.println(main.sumValue(5, 5));
		} catch (TestException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public int sumValue(int a, int b) throws TestException{
		if (a + b == 10) {
			throw new TestException();
		} else {
			return a + b;
		}
	}
	
	
	
	
	
	
	
	public static void tryCatchSuperException () {
		try {
			throw new NumberFormatException();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public void tryWithResource() {
		// old
		BufferedReader brOld = null;
	    try {
	    	brOld = new BufferedReader(new FileReader("123"));
	    	brOld.readLine();
	    } catch (IOException e) {
	    	//do something
		} finally {
	        if (brOld != null) {
				try {
					brOld.close();
				} catch (IOException e) {
				}
	        }
	    }
		
		// SE 7
		try (BufferedReader br = new BufferedReader(new FileReader("123"))) {
	        br.readLine();
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
