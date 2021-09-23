package com.app.ClassDesignPattern;



public class TestSingletonClass {
	
	static TestSingletonClass obj= null;
	private TestSingletonClass()
	{
		
	}
	
	
	public static synchronized TestSingletonClass getMyClassInstance()
	{
		if(obj==null)
		{
			obj= new TestSingletonClass();
			System.out.println("I am in..");
		}
		return obj;
	}
	
	public static void main(String[] args) {
		
		TestSingletonClass tc1= TestSingletonClass.getMyClassInstance();
		System.out.println("My objects tc1: " + tc1);
		TestSingletonClass tc2= TestSingletonClass.getMyClassInstance();
		System.out.println("My objects tc2: " + tc2);
	}

}
