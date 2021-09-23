package com.app.stringTest;

import java.util.Arrays;

public class InJavaCheckAnagramString {

	
	
	//Anagram =if two string have same set of character but in different order.
		
	public boolean checkAnagramString(String strOne, String strTwo)
	{
		String strOneNew =strOne.replaceAll("[^a-zA-Z]", "");

		//System.out.println("My new String is : " + strOneNew );
		char [] charactersListOne= strOne.replaceAll("[^a-zA-Z]", "").toCharArray();
		char [] charactersListTwo= strTwo.replaceAll("[^a-zA-Z]", "").toCharArray();
		
		/*char [] charactersListOne1;
		char [] charactersListTwo1; */
		
		 Arrays.sort(charactersListOne);
		 Arrays.sort(charactersListTwo);
		if(Arrays.equals(charactersListOne, charactersListTwo))
		{
			System.out.println("Yes.. we are anagram string");
			return true;
		}
		else 
			System.out.println("Oh..no  we are NOT !!");
			return false;
	
		
	}
	public static void main(String[] args) {
		InJavaCheckAnagramString objAnagramString = new InJavaCheckAnagramString();
		objAnagramString.checkAnagramString("Imran", "mIran");
	}
}
