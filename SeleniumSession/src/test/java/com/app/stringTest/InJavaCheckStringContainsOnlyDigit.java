package com.app.stringTest;

public class InJavaCheckStringContainsOnlyDigit {

	
	
	public boolean checkStringContainOnlyDigit(String str)
	{
		char [] charArray= str.toCharArray();
		for(Character c: charArray)
		{
			if(!Character.isDigit(c))
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public void checkContainsDisgit(String str)
	{
	boolean result= false;
		char[] newChars= str.toCharArray();
		for(Character c: newChars)
		{
			if(c.isDigit(c))
			{
				result= true;
			}
			else 
			{
				result= false;
			}
		}
		
		System.out.println("Am I contains only digit ? : " + result);
	}
	
	public static void main(String[] args) {
		InJavaCheckStringContainsOnlyDigit obj= new InJavaCheckStringContainsOnlyDigit();
		/*boolean str= obj.checkStringContainOnlyDigit("Imran");
		System.out.println("Am I contains only digit ? : " + str);
		
		System.out.println("*******************************************");
		boolean str1= obj.checkStringContainOnlyDigit("1234");
		System.out.println("Am I contains only digit ? : " + str1);
		*/
		
		obj.checkContainsDisgit("Imran");
	}
}
