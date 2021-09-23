package com.app.String;

public class EnumTestClass {
	
	
	enum color {
		RED, GREEN, BLUE
	}
	
	
	
	public void testMethod()
	{
		System.out.println(color.RED);
	}
	
	
	
	public static void main(String[] args) {
		
		EnumTestClass obj= new EnumTestClass();
		obj.testMethod();
				
	}

}
