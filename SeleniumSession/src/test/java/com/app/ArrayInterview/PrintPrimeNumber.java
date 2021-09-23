package com.app.ArrayInterview;

public class PrintPrimeNumber {
	
	//Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only
	
	public void testPrimeNumber(int n)
	{
		//2, 3, 5, 7, 11, 13, 17
		
		System.out.println(3%2);
		
		System.out.print(2 + " ");
		for (int i = 3; i <= n; i++) 
		{

			for (int m = 2; m <i; m++) {

				if((i%m!=0))
				{
					System.out.print(i + " ");
					break;
				}
				else if (i%m==0)
				{
					break;
				}
			}

		}
		
		
	}
	
	
	public boolean checkNumberIsPrime(int n)
	{
		if(n<=1)
		return false;
		
		for(int i=2; i<n; i++)
			if(n%i==0)
			{
				System.out.println("T");
				return false;
			}
			
				return true;

		
		
		
	}
	
	
	public static void main(String[] args) {
		
		PrintPrimeNumber obj= new PrintPrimeNumber();
		int n=17;
		//obj.testPrimeNumber(n);
		
		System.out.println(obj.checkNumberIsPrime(2));
		
		
		
	}
	

}
