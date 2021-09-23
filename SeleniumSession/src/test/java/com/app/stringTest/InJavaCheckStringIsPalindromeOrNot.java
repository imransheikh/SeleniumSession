package com.app.stringTest;

import java.util.HashSet;
import java.util.Set;

public class InJavaCheckStringIsPalindromeOrNot {
	
	public void checkStringPalindrome(String str)
	{
		StringBuilder sb= new StringBuilder(str);
		StringBuilder newStr= sb.reverse();
		String str1= newStr.toString();
		
		if (str.equals(str1)) {
			System.out.println("Yes... I am palindrome");
		} else {
			System.out.println("Oh no... I am not palindrome");
		}

	}
	
	
	String revString= "";
	public void checkStringPalindrome2(String str)
	{
		
		for (int i= str.length()-1; i>=0; --i)
		{
			revString +=str.charAt(i);
		}
		
		if (str.equals(revString)) {
			System.out.println("Yes... I am palindrome");
		} else {
			System.out.println("Oh no... I am not palindrome");
		}
		
	}
	
	public void removeDuplicateChar(String str)
	{
		System.out.println("String before duplicate: " + str);
		char[] strArray= str.toCharArray();
		Set<Character> charSet=  new HashSet<Character>();
		StringBuilder sb= new StringBuilder();
		for(char c: strArray)
		{
			//System.out.println("character: " + c);
			if(!(charSet.contains(c)))
			{
				charSet.add(c);
				sb.append(c);
				
			}
		}
		System.out.println("String after duplicate: " + sb.toString());
	}
	
	
	

	

	public static void main(String[] args) {
		InJavaCheckStringIsPalindromeOrNot obj= new InJavaCheckStringIsPalindromeOrNot();
		//obj.checkStringPalindrome("madam");
		//obj.checkStringPalindrome2("madam");
		obj.removeDuplicateChar("Imran ImSheikh");
	}
}
