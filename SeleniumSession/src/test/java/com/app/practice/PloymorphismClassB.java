package com.app.practice;

public class PloymorphismClassB extends PloymorphismClassA {
	

	public void displayName(String name)
	{
		System.out.println("Imran");
	}
	
	
	
	public void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	
	public void add(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	
	public void add(double a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		
		PloymorphismClassA obj= new PloymorphismClassB();
		
		obj.displayName("Data");
		
		//obj.add(2, 4);
	}

}
