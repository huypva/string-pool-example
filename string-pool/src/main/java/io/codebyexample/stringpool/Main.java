package io.codebyexample.stringpool;

public class Main {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("Compare str1==str2: " + (str1==str2));

		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("Compare str3==str4: " + (str3==str4));

		System.out.println("Compare value str1.equals(str3): " + (str1.equals(str3)));
	}

}
