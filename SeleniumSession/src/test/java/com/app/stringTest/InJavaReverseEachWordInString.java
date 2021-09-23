package com.app.stringTest;

public class InJavaReverseEachWordInString {

	
	//Reverse string by using only for & if condition
	public String reverseEachWord(String str)
	{
		String reverseWords= "";
		String [] word= str.split("\\s");
		for (String s: word)
		{
			//System.out.println("my words are : " + s);
			StringBuilder  sb= new StringBuilder(s);
			sb.reverse();
			//System.out.println("my reverse of words: " + sb);
			String str1= sb.toString() + " ";
			reverseWords  = reverseWords+str1;
			//System.out.println("my reverse of String " + sb);
		}
		System.out.println("my reverse of String " + reverseWords);
		
		return "Imran";
	}
	String reverseString= "";
	String reverseString1= "";
	
	public void reverseWordsByBufferBuilder(String str)
	{
		String[] strArray= str.split(" ");
		
		
		for(String s: strArray)
		{
			StringBuilder sb= new StringBuilder(s);
			sb.reverse();
			reverseString= sb.toString()+ " ";
			reverseString1= reverseString+reverseString1;
		}
		
		System.out.println("Reverse String is: " + reverseString1);
		
		
	}
	
	
	public static void main(String[] args) {
		InJavaReverseEachWordInString  obj= new InJavaReverseEachWordInString ();
		obj.reverseEachWord("My name is sheikh");
		
		obj.reverseWordsByBufferBuilder("My name is sheikh");
	}
	
	
}
