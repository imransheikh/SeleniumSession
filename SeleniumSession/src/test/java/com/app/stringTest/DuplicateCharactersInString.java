package com.app.stringTest;

import java.util.HashMap;
import java.util.Set;
 
class DuplicateCharactersInString
{
    static void duplicateCharCount(String inputString)
    {
        //Creating a HashMap containing char as key and it's occurrences as value
 
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
        //Converting given string to char array
 
        char[] strArray = inputString.toCharArray();
         //checking each char of strArray
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
               charCountMap.put(c, 1);
               System.out.println("my values : " +charCountMap.values());
               System.out.println("my key set: " + charCountMap.keySet() );
               System.out.println("my values to respective object is: " + charCountMap.get(c));
            }
        }
        //Getting a Set containing all keys of charCountMap
        Set<Character> charsInString = charCountMap.keySet();
       for (Character ch : charsInString)
        {
        	System.out.println("My all keys are: " + charCountMap.get(ch));
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count
             System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }
    public static void main(String[] args)
    {
       duplicateCharCount("Jav");
       //duplicateCharCount("JavaJ2EE");
    }
}