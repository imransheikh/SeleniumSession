package com.app.stringTest;


public class InJavaTraverseCharactersArrays {
	
	
	public void traverseCharArrays()
	{
		char[] chars= {'a', 'b', 'v', 'd', 'e'};
		Character ch= new  Character('z');
		System.out.println("My single char is: " + ch);
		System.out.println("**************************************");
		for(char c: chars)
		{
			System.out.println("My characters are: " + c);
		}
		
	}
	public static void main(String[] args) {
		InJavaTraverseCharactersArrays obj= new InJavaTraverseCharactersArrays();
		obj.traverseCharArrays();
	}

}
