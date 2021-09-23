package com.app.stringTest;

public class InJavaCopyCharArrayToString {
	
	public void testMethod()
	{
		char [] ch= { 'a', 'z', 'k', 'm'};
		String str1= String.valueOf(ch);
		System.out.println("my character into string is: " + str1);
		
		
	}

	public static void main(String[] args) {
		InJavaCopyCharArrayToString obj= new InJavaCopyCharArrayToString();
		obj.testMethod();
	}
}
