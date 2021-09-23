package com.app.String;

public class CountNoOfWords {
	
	public void testCountNoOfWords()
	{
		String str= "My name is khan";
		String []strArray= str.split(" ");
		int count=0;
		for(String s: strArray)
		{
			System.out.print(s + " ");
			count++;
		}
		System.out.println();
		System.out.println("==================================");
		
		for (int i=0; i<strArray.length; i++)
		{
			System.out.print(strArray[i] + " ");
			
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println("No of words are : " + count);
	}
	
	public static void main(String[] args) {
		
		CountNoOfWords obj= new CountNoOfWords();
		obj.testCountNoOfWords();
	}

}
