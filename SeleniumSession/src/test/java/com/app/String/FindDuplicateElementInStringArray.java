package com.app.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateElementInStringArray {

	public void testDuplicateString() {
		String str = "Imran Sheikh is not an engineer Imran";
		String[] strArray = str.split(" ");
		Set<String> set = new LinkedHashSet();
		for (String s : strArray) {
			System.out.print(s + " ");
			if (!(set.add(s))) {
				System.out.println();
				System.out.println("Duplicate element is : " + s);
			}

		}

		System.out.println();
		System.out.println("=================================");
		for (String st : set) {
			System.out.print(st + " ");
		}
	}
	
	public void testDuplicateString2(String[] str) {
			
			for(int i=0; i<=str.length-1; i++)
			{
				//System.out.println(str[i]);
				
				for (int j=i+1; j<=str.length-1; j++ )
				{
					if(str[i].equals(str[j]))
					{
						System.out.println("Duplicate element is " + str[i]);
						
					}
				}
			}
		
			}

	public static void main(String[] args) {

		FindDuplicateElementInStringArray obj = new FindDuplicateElementInStringArray();
		//obj.testDuplicateString();
		String[] str= {"imran", "sheikh", "prashant", "sheikh"};
		obj.testDuplicateString2(str);
	}

}
