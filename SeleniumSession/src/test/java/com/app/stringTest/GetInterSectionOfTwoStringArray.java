package com.app.stringTest;

import java.util.HashSet;
import java.util.Set;

public class GetInterSectionOfTwoStringArray {
	
	
	
	public void getItersection(String[]str1, String[] str2)
	{
		Set<String> intersect= new HashSet<String>();
		
		for(int i=0; i<str1.length; i++)
		{
			for(int j=0; j<str2.length; j++)
			{
				if(str1[i]==str2[j])
				{
					intersect.add(str1[i]);
				}
			}
			
		}
		
		for(String s: intersect)
		{
			System.out.println("Common element are: " + s);
		}
		
	}
	public static void main(String[] args) {
		GetInterSectionOfTwoStringArray  obj= new GetInterSectionOfTwoStringArray ();
		String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        obj.getItersection(inputArray1, inputArray2);
	}
	

}
