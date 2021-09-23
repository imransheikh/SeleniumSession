package com.app.String;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharFromString {

	public void duplicateChar() {
		String str = "imranasheikh";
		char[] charArray = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		// How to print the char from the string
		for (int i = 0; i < str.length(); i++) {
			str.charAt(i);
			System.out.print(str.charAt(i) + " ");
		}

		System.out.println();
		System.out.println("=============================================");
		// How to print the char from the string imranasheikh
		for (char a : charArray) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}

		}

		for (Map.Entry<Character, Integer> mp : map.entrySet()) {

			if (mp.getValue() > 1) {
				System.out.println("Key: " + mp.getKey() + "  Value " + mp.getValue());

			}
		}
		System.out.println("=========================================");
		for(Character c : map.keySet())
		{
			System.out.println("Keys are : " + c);
		}
		System.out.println("=========================================");
		
		for(Integer c : map.values())
		{
			System.out.println("values are : " + c);
		}
		

	}

	public static void main(String[] args) {

		PrintDuplicateCharFromString obj = new PrintDuplicateCharFromString();
		obj.duplicateChar();
	}

}
