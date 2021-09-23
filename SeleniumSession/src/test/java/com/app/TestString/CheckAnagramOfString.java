package com.app.TestString;

import java.util.Arrays;

public class CheckAnagramOfString {
	
	
	
	public void testAnagram()
	{
		String str1= "Listen";
		String str2= "Silent";
		
		char[] str1Array= str1.toLowerCase().toCharArray();
		char[] str2Array= str2.toLowerCase().toCharArray();
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		System.out.println(str1Array);
		System.out.println(str2Array);
		
		if(Arrays.equals(str1Array, str1Array))
		{
			System.out.println("Yes...I am Anagram");
		}
		else {
			System.out.println("I am not Anagram");
		}
		
	}
	
	
	
	
	public void countNoOfWords()
	{
		String name= "My name is khan";
		
		int count=0;
		String []nameArray= name.split(" ");
		for(String s: nameArray)
		{
			System.out.print(s + "  ");
			count++;
		}
		System.out.println();
		System.out.println("No of words are : " + count);
	}
	
	
	public void reverseString()
	{
		String str= "Testing";
		System.out.println("Orignal String is: " + str);
		System.out.println();
		char []charArray= str.toCharArray();
		char []revArray= new char[charArray.length];
		int j=0;
		for(int i=charArray.length-1; i>=0; i--)
		{
			revArray[j++]= charArray[i];
		}
		
		
		String newString= String.valueOf(revArray);
		System.out.println("Reverse String is: " + newString);
	}
	
	
	
	
	public void RemoveWhiteSpaces()
	{
		String str= "Imran sheikh    is best";
		String str1= str.replaceAll(" ", "");
		System.out.println(str1);
		System.out.println("=======================");
		
		
		char [] charArray= str.toCharArray();
		StringBuffer sb= new StringBuffer();
		for(int i=0; i<charArray.length; i++)
		{
			
			if((charArray[i] !=' ') && (charArray[i] !='\t'))
			{
			sb.append(charArray[i]);
			
			}
		}
		
		System.out.println(sb);
	}
	
	
	public void checkStringContainsDigit()
	{
		String str= "Imran 1 Sheikh";
		char[] array= str.toCharArray();
		boolean result=false;
		for(Character s: array)
		{
			if(Character.isDigit(s))
			{
				result=true;
				break;
			}
			else {
				result=false;
			}
		}
		System.out.println("Stirng contains digit : " + result);
		
	}
	
	
	public void checkPalindrome()
	{
		String str= "civic";
		char [] strArray= str.toCharArray();
		
		char[] strTest= new char[strArray.length];
		int j=0;
		for(int i= strArray.length-1; i>=0; i--)
		{
			strTest[j++] = strArray[i];
		}
		
		String str1=String.valueOf(strArray);
		String str2= String.valueOf(strTest);
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Yes Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		CheckAnagramOfString obj= new CheckAnagramOfString();
		//obj.testAnagram();
		//obj.countNoOfWords();
		//obj.reverseString();
		//obj.RemoveWhiteSpaces();
		
		//obj.checkStringContainsDigit();
		obj.checkPalindrome();
		
	}

}
