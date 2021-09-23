package com.app.ClassDesignPattern;

public class NewTest {
	
	
	
	public void test()
	{
		for (int i=1; i<=10; i++)
		{
			for (int j= 1; j<=10; j++)
			{
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		NewTest obj= new NewTest();
		obj.test();
	}

}
