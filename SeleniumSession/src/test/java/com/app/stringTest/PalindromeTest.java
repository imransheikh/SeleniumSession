package com.app.stringTest;

public class PalindromeTest {

	
	public boolean checkStringPalindrome(String str)
	{
		
		int length= str.length();
		System.out.println("My string length is: " + length);
		for(int i=0; i<length; i++)
		{
			//System.out.println("My string char are : "+str.charAt(i));
		}
		//
		for (int i = 0; i < length / 2; i++) {
			System.out.println("My "+(length - i - 1));
			System.out.println("My string char are : "+str.charAt(i)  + " " +str.charAt(length - i - 1));
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
	}
	
	
	public static void main(String []arg)
	{
		PalindromeTest pt = new PalindromeTest();
		boolean test= pt.checkStringPalindrome("abaaba");
		System.out.println("Is my string palindrome ? " + test);
	}
}
