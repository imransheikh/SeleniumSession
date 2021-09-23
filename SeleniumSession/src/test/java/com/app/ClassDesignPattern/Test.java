package com.app.ClassDesignPattern;

public class Test {
	
	public int a;
	
	private Test()
	{
		a++;
		System.out.println(a);
	}
	
	
	
	public void TestMethod()
	{
		for(int i= 1; i<=4; i++)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		Test obj1= new Test();
/*		Test obj2= new Test();
		Test obj3= new Test();
*/		
		obj1.TestMethod();
	}

}
