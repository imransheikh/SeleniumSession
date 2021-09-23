package com.app.String;

public class ReverseString {
	
	
	
	public void testReverse()
	{
		String str= "Imran Sheikh";
		char [] strArray= str.toCharArray();
		char [] revStrArray= new char[strArray.length];
		
		for(int i=0; i<strArray.length; i++)
		{
			System.out.print(strArray[i] + " ");
			
		}
		System.out.println();
		System.out.println("=====================");
		int j=0;
		for (int i=strArray.length-1; i>=0; i--, j++ )
		{
			System.out.print(strArray[i] + " ");
			revStrArray[j]= strArray[i] ;
		}
		System.out.println();
		System.out.println("=====================");
		System.out.println("Reverse String is : " +revStrArray.toString() );
		String TestString= String.valueOf(revStrArray);
		System.out.println(TestString);
		
		
	}
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.testReverse();
	}

}
 