package com.app.ArrayInterview;

public class CheckArmstrongNumber {
	
	
	public void checkArmStrong(int n) {

		int test= n;
		int temp = 0;
		temp = n;
		int digit = 0;
		int r;
		double sum=0;

		while (n > 0) {
			n = n / 10;
			digit++;
		}
		
		//System.out.println("Digit is : " + digit);
		//System.out.println(Math.pow(2, digit));
		
		while(temp>0)
		{
			r= temp%10;
			System.out.println(r);
			System.out.println(Math.pow(r, digit));
			sum= sum + Math.pow(r, digit);
			temp= temp/10;
		}
		
		
		System.out.println("========================");
		
		if(sum==test)
		{
			System.out.println(sum + "   Palindrome");
		}
		else {
			System.out.println(sum + "   Not Palindrome");
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		 CheckArmstrongNumber obj= new CheckArmstrongNumber();
		 obj.checkArmStrong(153);
	}
	

}
