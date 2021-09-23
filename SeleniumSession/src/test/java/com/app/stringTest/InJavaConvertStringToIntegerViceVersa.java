package com.app.stringTest;

public class InJavaConvertStringToIntegerViceVersa {

	
	public void stringToInteger(String str)
	{
		int i= Integer.parseInt(str);
		int j = Integer.valueOf(str);
		
		
		System.out.println("String to Integer by using parseInt : "+ i);
		System.out.println("String to Integer by using ValueOf : "+ j);
	}
	
	public void integerToString(int k)
	{
		String str = String.valueOf(k);
		System.out.println("Integer to String  by using valueOf : "+ str);
		
	}
		
		
	
	
	
	public static void main(String[] args) {
		InJavaConvertStringToIntegerViceVersa obj= new InJavaConvertStringToIntegerViceVersa();
		obj.stringToInteger("10");
		obj.integerToString(20);
	}
}
