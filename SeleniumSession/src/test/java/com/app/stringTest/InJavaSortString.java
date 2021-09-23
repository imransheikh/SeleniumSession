package com.app.stringTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class InJavaSortString {

	
	public void sortSingleString(String str)
	{
		System.out.println("My orignal string is: " +str );
		char[] chars= str.toCharArray();
		Arrays.sort(chars);
		String.valueOf(chars);
		System.out.println("My sorted string is: " +String.valueOf(chars) );
	}
	
	public void sortStrings()
	{
		
		List<String> names= new ArrayList<String>();
		names.add("Imran");
		names.add("Prashant");
		names.add("pulkit");
		names.add("Apulkit");
		
		for(String str1: names)
		{
			System.out.println("My orignal string list is: " + str1);
		}
		
		Collections.sort(names);
		
		for(String str1: names)
		{
			System.out.println("My sorted list are: " + str1);
		}
	
	}
	
	public static void main(String[] args) {
		InJavaSortString obj= new InJavaSortString();
		obj.sortSingleString("imran");
		obj.sortStrings();
	}
}
