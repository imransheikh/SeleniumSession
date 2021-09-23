package com.app.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class FirstNonRepeatedCharacterInString {

	public void testFirstNonRepeatedChar() {
		String str = "imran sheikh imran";
		char[] strArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap();

		for (char a : strArray) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		System.out.println("Traversing the map....");
		for(Map.Entry<Character, Integer> mp: map.entrySet())
		{
			System.out.println("Keys : " + mp.getKey() + "  Values: " + mp.getValue());
			if(mp.getValue()==1)
			{
				System.out.println("First non Repeared char: " + mp.getKey());
				break;
			}
		}
		
		System.out.println("==================================");
		for(int i=0; i<str.length(); i++)
		{
			char c= str.charAt(i);
			//System.out.print(c + " ");
			if (map.get(c)==1)
			{
				System.out.println("First non repeated character : " + c);
				break;
			}
		}
		
		
	}

	public static void main(String[] args) {
		FirstNonRepeatedCharacterInString obj = new FirstNonRepeatedCharacterInString();
		obj.testFirstNonRepeatedChar();

	}

}
