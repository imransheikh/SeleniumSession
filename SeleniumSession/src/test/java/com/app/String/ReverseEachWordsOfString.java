package com.app.String;

public class ReverseEachWordsOfString {

	public void testReverseEachWord()
	{
		String str= "My name is khan";
		String [] strArray= str.split(" ");
		String finalString = "";
		System.out.println(str);
	
		
		for(String s: strArray)
		{
			//System.out.print(s + " ");
			int j=0;
			char [] charArray= s.toCharArray();
			char [] revCharArray= new char[charArray.length];
			for (int i= charArray.length-1; i>=0; i--, j++)
			{
				revCharArray[j]= charArray[i];
				
			}
			String testString= String.valueOf(revCharArray);
			//System.out.println("==============================================");
			System.out.println();
			System.out.print(testString);
			finalString= testString + " " + finalString;
			
			
		}
		System.out.println("===========================");
		System.out.println(finalString);
	}

	public static void main(String[] args) {

		ReverseEachWordsOfString obj = new ReverseEachWordsOfString();
		obj.testReverseEachWord();
	}
}
