package com.nhattt.chap3;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StringTest {
	public static void main( String[] args ) {
		/*String[] string = new String[]{"A","S","D","F","G","H","J","K","L","Q"};
		List<String> list = Arrays.asList(string);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).codePointAt(0));
		}*/
		System.out.println("Default charset: " + Charset.defaultCharset());
		byte[] bs = {65,83,68,70,71,72,74,75,76,81};
		String string2 = new String(bs);
		System.out.println(string2);
		string2 = new String(bs, Charset.forName("ISO-8859-1"));
		System.out.println(string2);
		string2 = new String(bs, 2);
		System.out.println(string2);
		string2 = new String(bs, 0, 4);
		System.out.println(string2);
		System.out.println(new String(bs,60,1,3));
		
		string2 = new String("ASD ASSDF ADD");
		System.out.println(string2.codePointCount(1, 12));
		System.out.println(string2.concat(": 123"));
		String a = new String("a");
		System.out.println(a.compareTo("A"));
		System.out.println(a.compareToIgnoreCase("A"));
		System.out.println(a.contentEquals("b"));
		
		char[] b = {'H','e','l','l','o'};
		System.out.println(a.copyValueOf(b,1,3));
		
		String Str = new String("This is really not immutable!!");
		System.out.println("Returned Value = " + Str.endsWith("immutable!!"));
		System.out.println("Returned Value = " + Str.endsWith("immu"));
		
		/*double piVal = Math.PI;
		System.out.format("%f\n", piVal);
		System.out.format(Locale.US, "%10.5f", piVal);*/
		System.out.println(Arrays.toString(Str.getBytes()));
		
		String source = "This is a demo";
        char[] target = new char[15];
        target[0] = '*';
        target[1] = '/';
        source.getChars(5,source.length() , target, 2);
        System.out.println(Arrays.toString(target));
        System.out.println("java example".indexOf('a'));
        System.out.println("this is a test".indexOf("i", 3));
        System.out.println("aabcc".indexOf("d"));
	}
}
