package com.app.seleniumsession;

public  class TestAbstractClass {
	
	
	
	static {
		System.out.println("I am static block ");
	}
	
	 {
		System.out.println("I am  NON static block ");
	}
	
	public TestAbstractClass() {
		System.out.println("I am constructor");
	}
	
	public void display()
	{
			System.out.println("I am non static method");
	}
	
	public static void demo() {
	      System.out.println("Hello this is an instance method");
	   }
	
	
	public static void main(String[] args) {
		
		new TestAbstractClass().display();
	}
	

}
