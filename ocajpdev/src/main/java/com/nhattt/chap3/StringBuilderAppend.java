package com.nhattt.chap3;

/**
 * Hello world!
 *
 */
public class StringBuilderAppend 
{
    public static void main( String[] args )
    {
    	StringBuilder sb = new StringBuilder(); 
    	StringBuilder sb1 = new StringBuilder(); 
    	StringBuilder sb2 = new StringBuilder(); 
    	sb.append(5);
    	sb.append(false);
    	sb.append('a'); 
    	sb.append(10.5f); 
    	sb.append(10.5);
    	sb.append("Hi"); 
    	sb1.append(sb); 
    	sb2.append(sb, 1, 6);
    	System.out.println(sb); 
    	System.out.println(sb1); 
    	System.out.println(sb2);
    	//
    	sb = new StringBuilder();
    	char[] name1 = { 'O', 'C', 'A', 'J', 'P' };
    	char[] name2 = { '.','J', 'a', 'v', 'a', '8' };
    	sb.append(name1);
    	sb.append(name2, 0, 5);
    	//
    	System.out.println(sb);
    	sb = new StringBuilder();
    	sb.append(new Test("OCAJP"));
    	System.out.println(sb);
    	
    	 /*StringBuilder str = new StringBuilder("programming");
         System.out.println("string = " + str);

         // appends the CodePoint as string to the StringBuilder
         str.appendCodePoint(74);
       
         // print the StringBuilder after appendingCodePoint 74
         System.out.println("After appendCodePoint = " + str);*/

    }
}

class Test {
	String name;

	public Test(String name) {
		this.name = name;
	}
	
}
