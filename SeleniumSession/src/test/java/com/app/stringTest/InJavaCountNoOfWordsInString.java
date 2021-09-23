package com.app.stringTest;

public class InJavaCountNoOfWordsInString {
	 int count=0;
	
	public void countWord(String str)
	{
		
		String [] newStr= str.split(" ");
		System.out.println("My string without space :" + str);
		for (String s: newStr)
		{
			System.out.println("My words are: " + s);
			count++;
		}
		
		System.out.println("Total no of words in this string : " +count);
	}
	

	public static void main(String[] args) {
		InJavaCountNoOfWordsInString obj= new InJavaCountNoOfWordsInString();
		obj.countWord("I am not good in coding");
	}
}
