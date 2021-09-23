package com.app.stringTest;

import java.util.HashMap;

public class CountOccurenceOfChar {
	
	public void TestCharOccurance(String str)
	{
	HashMap<Character, Integer > charCountMap=  new HashMap<Character, Integer >();	
	
	char [] charArray= str.toCharArray();
	
		for(char c: charArray)
		{
     		if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
				System.out.println("How get works: " +charCountMap.get(c)+1 );
			}
			else
				charCountMap.put(c, 1);
     		//System.out.println("How put works: " +charCountMap.put(c, 1) );
     		//System.out.println("How put works2: " +charCountMap );
		}
		//System.out.println("My char count is: " +charCountMap);
	}


	public static void main(String[] args) {
		CountOccurenceOfChar tc = new CountOccurenceOfChar();
		tc.TestCharOccurance("Imran sheikh Imran");
	}
}
