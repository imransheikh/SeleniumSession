package com.app.stringTest;

public class StringHasUniqueCharacter {

	
	public void checkUniqueCharacter(String str)
	{
		boolean status= true;
		char[] charArray= str.toCharArray();
		int i = str.indexOf('n');
		int j = str.lastIndexOf('n');
		System.out.println("my first and last string index is : " + i + " : " + j);
		
		for(char c: charArray)
		{
			if((str.indexOf(c))==(str.lastIndexOf(c)))
			{
				status=true;
			}
				else
				{
				status=false;
				}
			
		}
		System.out.println("My string is Unique ?? "+ status);
	}
	
	public static void main(String[] args) {
		StringHasUniqueCharacter su= new StringHasUniqueCharacter();
		su.checkUniqueCharacter("Imran sekhn");
	}
}
