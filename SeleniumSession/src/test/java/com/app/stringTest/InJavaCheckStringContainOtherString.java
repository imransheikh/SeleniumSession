package com.app.stringTest;

public class InJavaCheckStringContainOtherString {

	public boolean checkContainString(String str, String str2)
	{
		
		if(str2.contains(str))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
		
	
	}
	
	public static void main(String[] args) {
		InJavaCheckStringContainOtherString obj= new InJavaCheckStringContainOtherString();
		boolean t= obj.checkContainString("imran", "My name is imran Sheikh");
		System.out.println("I am in ? " + t);
	}
	
}
