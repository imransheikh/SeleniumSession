package com.app.TestString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateCharInString {
	
	
	
	public void testDuplicateChar()
	{
		String str= "My name is khan";
		
		char [] charArray= str.replaceAll(" ", "").toCharArray();
		
		
		for(char c: charArray)
		{
			System.out.print(c + "  ");
		}
		
		Map<Character, Integer> map= new HashMap<>();
		
		for (int i = 0; i < charArray.length; i++) {

			if (!map.containsKey(charArray[i])) {
				map.put(charArray[i], 1);
			} else {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			}
		}
		
		System.out.println();
		System.out.println("Duplicate character in String !!");
			Set<Character> set= map.keySet();
			
			for(Character s: set)
			{
				//System.out.println(s  + "  "   + map.get(s));
				//System.out.println(map.get(s));
				if(map.get(s)>1)
				{
					System.out.println("Duplicate char in String is: " + s   + " Freq: " + map.get(s));
				}
			}
		
		
			System.out.println();
			System.out.println("============================");
			Set<Entry<Character, Integer>> set1= map.entrySet();
			for(Map.Entry<Character, Integer> tc: set1)
			{
				System.out.println("Keys: " + tc.getKey()  +  " Values: " + tc.getValue());
			}
			
			
		
	}
	
	
	
	public static void main(String[] args) {
		FindDuplicateCharInString obj= new FindDuplicateCharInString();
		obj.testDuplicateChar();
	}

}
 