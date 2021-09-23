package com.app.ArrayInterview;

public class PrintFibonacciSeries {
	
	
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
	public void testFibonacci(int n)
	{
		int n1= 0;
		int n2= 1;
		int n3;
		
		System.out.print(n1 + " " + n2 + " ");
		
		for(int i=2; i<=n; i++)
		{
			n3= n1+n2;
			System.out.print(n3 + " ");
			n1=n2;
			n2=n3;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		PrintFibonacciSeries obj= new PrintFibonacciSeries();
		int number= 10;
		obj.testFibonacci(number);
	}

}
