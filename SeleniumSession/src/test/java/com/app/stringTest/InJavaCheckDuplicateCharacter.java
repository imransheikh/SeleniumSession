package com.app.stringTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InJavaCheckDuplicateCharacter {

	
	public void printDuplicateCharqacter(String str)
	{
		
		char [] characterArray= str.toCharArray();
		/*for(char a: characterArray)
		{
			System.out.println("My String into character: " + a);
		}*/
		
		HashMap<Character, Integer > hashMap= new HashMap<Character, Integer >();
		for(char c: characterArray)
		{
			if(hashMap.containsKey(c))
			{
				hashMap.put(c, hashMap.get(c)+1);
			}
			else 
			{
				hashMap.put(c, 1);
				
			}
		
		}
		
		for (Map.Entry mp: hashMap.entrySet())
		{
			System.out.println("My entry of keys and values are: " + mp.getKey() + ": " + mp.getValue());
		
		}
		Set<Character> uniqueCharacter	=hashMap.keySet();
		
		for(Character c: uniqueCharacter)
		{
			if(hashMap.get(c)>1)
			{
				System.out.println("My character which have duplicate are : " +hashMap.values());
				System.out.println("My character which have duplicate are : " + +hashMap.get(c));
				
			}
			
			
			
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		InJavaCheckDuplicateCharacter obj= new InJavaCheckDuplicateCharacter();
		obj.printDuplicateCharqacter("imranSheikh");
	}
	
	
}
