package com.app.stringTest;

import java.util.HashSet;

public class FindDuplicateElementInArray {
	
	
	public void findDuplicate(String[] str)
	{
		HashSet<String> setUnique= new HashSet<String>();
		for(String s: str)
		{
			System.out.println("My Array element: "+ s);
			if(!(setUnique.add(s)))
			{
				System.out.println("Duplicate element: " + s);
			}
			
		}
		
		for(String str1: setUnique)
		{
			System.out.println("element: " + str1);
		}
	}
	
	public void printDuplciateElement(String[] str)
	{
		// {"imran", "sheikh", "prashant", "imran"};
		System.out.println("length: "+ str.length);
		for(int j=0; j<str.length; j++)
		{
			//System.out.println(str[j]);
		}
		for(int i=0; i<str.length-1; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplciate element: " + str[j]);
				}
			}
		}
	}
	
	
	
	
	

	
	public static void main(String[] args) {
		FindDuplicateElementInArray obj= new FindDuplicateElementInArray();
		String[] str= {"imran", "sheikh", "prashant", "imran"};
		//obj.findDuplicate(str);
		
		obj.printDuplciateElement(str);
	}
}
