package com.app.String;

public class StringIntoIntegerViceVersa {
	
	
	public void testStringIntoIntegerViceVersa()
	{
		String str= "12";
		int i= Integer.valueOf(str);
		System.out.println(i);
		
		String strt= "12454";
		int m= Integer.parseInt(strt);
		System.out.println(m);
		
		
		int k= 2333;
		String str1= String.valueOf(k);
		System.out.println(str1);
		
		
		
	}
	
	public static void main(String[] args) {
		
		StringIntoIntegerViceVersa obj= new StringIntoIntegerViceVersa();
		obj.testStringIntoIntegerViceVersa();
	}

}
