package com.app.interview;

public class Question14 {
	
	
	public static void main(String[] args) {
		
		
		
		
		char c[]= {'a', 'l', 'b', ' ', 'A', 'O'};
		
		for(int i=0; i<5; i++)
		{
			  if(Character.isDigit(c[i])) System.out.println(c[i]+ " is a digit");
			  
			  if(Character.isWhitespace(c[i])) System.out.println(c[i]+ " is a white");
			  
			  if(Character.isUpperCase(c[i])) System.out.println(c[i]+ " is a Upper");
			  
			  if(Character.isLowerCase(c[i])) System.out.println(c[i]+ " is a lower");
			  i=i+3;

		}
	}

}
