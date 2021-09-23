package com.app.stringTest;

public class TestClass {

	public void StringHasUniqueElement(String str)
	{
		char[] chars= str.toCharArray();
		boolean status= false;
		for(Character c: chars)
		{
			if(str.indexOf(c) == str.lastIndexOf(c))
			{
				status= true;
			}
			else
				status= false;
		}
		
	System.out.println("Is this string have unique character ? " + status);	
	}
	
	
	
	public void reverseEachWord(String str)
	{
		String [] str1= str.split(" ");
		
		for(String s: str1)
		{
			System.out.println("My words are : " + s);
			StringBuffer sb= new StringBuffer(s);
			sb.reverse();
			System.out.println("My reverse string is : "+ sb);
		}
	}
	
	public static void main(String[] args) {
		TestClass obj= new TestClass();
		//obj.StringHasUniqueElement("ImI");
		obj.reverseEachWord("I am new in autoamtion engg");
	}
	
}
