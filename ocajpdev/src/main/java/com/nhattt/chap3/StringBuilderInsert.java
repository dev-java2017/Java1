package com.nhattt.chap3;


public class StringBuilderInsert {
	public static void main( String[] args )
    {
		StringBuilder sb = new StringBuilder("Hello");
		/*sb.insert(1, true);
		System.out.println(sb);*/
		char[] name = {'A','B','C'};
		sb.insert(1, name, 2, 1);
		System.out.println(sb);
		byte ascii[] = {65, 66, 67, 68, 69, 70 }; 
		String s1 = new String(ascii); 
		System.out.println(s1); 
		String s2 = new String(ascii, 2, 3); 
		System.out.println(s2); 
		
		
    }
}
