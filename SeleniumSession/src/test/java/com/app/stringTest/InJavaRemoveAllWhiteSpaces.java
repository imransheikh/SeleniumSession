package com.app.stringTest;

public class InJavaRemoveAllWhiteSpaces {
	
	public void removeWhiteSpaces(String str)
	{
		System.out.println("My Orignal String is : " + str);
		//String newStr= str.replaceAll("[\\s]", "");
		String newStr= str.replaceAll(" ", "");
		System.out.println("My updated String is : " + newStr);
	}
	
	public static void main(String[] args) {
		InJavaRemoveAllWhiteSpaces obj= new InJavaRemoveAllWhiteSpaces();
		obj.removeWhiteSpaces("I am not a good programmer");
		
	}

}
