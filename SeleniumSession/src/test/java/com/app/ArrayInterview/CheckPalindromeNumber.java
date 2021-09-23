package com.app.ArrayInterview;

public class CheckPalindromeNumber {
	
	
	//545
	public void testCheckPalindrome(int n)
	{
		int sum=0;
		int r=0;
		int temp= n;
		int t= 3/10;
		System.out.println(t);
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
	
	
	
	public void testFactorial(int n)
	{
		
		System.out.println(12/10);
		System.out.println(2%10);
		System.out.println("==================");
		int fact=1;
		for(int i=n; i>0; i--)
		{
			System.out.println(i);
			fact=fact*i;
		}
		System.out.println(fact);
	}
	

	
	public static void main(String[] args) {
		CheckPalindromeNumber obj= new CheckPalindromeNumber();
		int i= 546;
		//obj.testCheckPalindrome(i);
		obj.testFactorial(5);
		
	}

}
