package com.app.String;

public class RemoveAllWhiteSpacesInString {
	
	public void testRemoveWhiteSpaces()
	{
		String str= "My name is khan";
		System.out.println("with white spaces");
		System.out.println(str);
		String removeStr= str.replaceAll("\\s", "");
		System.out.println("Without white spaces");
		System.out.println(removeStr);
		
	}
	
	
	public void testRemoveWhiteSpaces2()
	{
		System.out.println("==================================");
		String str= "My name is		khan";
		System.out.println("with white spaces");
		System.out.println(str);
		
		char [] strArray= str.toCharArray();		
		StringBuffer strBuffer= new StringBuffer();
		for(int i=0; i<strArray.length; i++)
		{
			if((strArray[i]!=' ') && (strArray[i] !='\t'))
			{
				strBuffer.append(strArray[i]);
			}
		}
		
		System.out.println();
		System.out.println("Without white spaces: " + strBuffer.toString());
		
	}
	
	public static void main(String[] args) {
		
		RemoveAllWhiteSpacesInString obj= new RemoveAllWhiteSpacesInString();
		obj.testRemoveWhiteSpaces();
		obj.testRemoveWhiteSpaces2();
	}

}
