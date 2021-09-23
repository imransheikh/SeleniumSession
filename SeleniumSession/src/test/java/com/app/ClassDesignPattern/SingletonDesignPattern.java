package com.app.ClassDesignPattern;

public class SingletonDesignPattern {
	
	static SingletonDesignPattern obj= null;
	
	private SingletonDesignPattern()
	{
		
	}

	public static synchronized SingletonDesignPattern getInstance()
	{
		if(obj==null)
		{
			obj= new SingletonDesignPattern();
		}
		return  obj;
	}
	
	public static void main(String[] args) {
		
		SingletonDesignPattern s1= SingletonDesignPattern.getInstance();
		SingletonDesignPattern s2= SingletonDesignPattern.getInstance();
		
		System.out.println("Instance S1 value: " + s1);
		System.out.println("Instance S2 value: " + s2);
	}
	
}
