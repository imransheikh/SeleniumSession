package com.app.stringTest;



public class InJavaCountSpecificCharInString {
int count=0;
	
	public void countCharacter(String str, char c)
	{
		int l= str.length();
		System.out.println("String length is: " + l);
		
		int m= str.replaceAll(String.valueOf(c), "").length();
		int total= l-m;
		System.out.println("Total number of char is: " + total);
		//int cn = s.length() - s.replaceAll(String.valueOf(c), "").length();
		char [] characters= str.toCharArray();
		Character c1= new Character(c);
		
		
		for (char s: characters)
		{
			Character s1= new Character(s);
			if(s1.equals(c1))
			{
				count++;
			}
			
		}
		
		System.out.println("Number of occurrance of character " + c +":"+ count);
		 
	}
	
	public static void main(String[] args) {
		InJavaCountSpecificCharInString obj= new InJavaCountSpecificCharInString();
		obj.countCharacter("ImranSheikh", 'h');
	}
}
