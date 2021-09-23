package com.app.stringTest;

import java.util.HashMap;

public class InJavaFirstNonRepeatedCharacter {
	
	public void getFirstNonRepeatedChar(String str)
	{
		String strNew= str.replaceAll("[\\s]", "");
		System.out.println("my string without space:  "+ strNew);
		char[] characters= strNew.toCharArray();
		
		
		HashMap<Character, Integer> maps= new HashMap<>();
		for(char c: characters)
		{
			if(maps.containsKey(c))
			{
				maps.put(c,maps.get(c)+1);
			}
			else 
				maps.put(c,1);
		}
		
		
		for(char c: characters)
		{
			if(maps.get(c)==1)
			{
				System.out.println("I am first non repeated character:  " + c);
			break;
			}
		}
		
		
		
		
		}
		
	

	
	
	
	public static void main(String[] args) {
		InJavaFirstNonRepeatedCharacter obj= new InJavaFirstNonRepeatedCharacter();
		obj.getFirstNonRepeatedChar("imran sheikhm");
	}
}
