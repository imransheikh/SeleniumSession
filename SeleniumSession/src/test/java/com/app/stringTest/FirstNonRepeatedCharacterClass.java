package com.app.stringTest;

import java.util.HashMap;

public class FirstNonRepeatedCharacterClass {

	public char firstNonRepeatedCharacter(String word) {
        HashMap<Character,Integer> scoreboard = new HashMap<>();
        
        // build table [char -> count]
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
                
            } else {
                scoreboard.put(c, 1);
            }
        }
        // since HashMap doesn't maintain order, going through string again
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            System.out.println("my char is: " + c);
            System.out.println("my char count is: " + scoreboard.get(c));
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }
	
	public static void main(String[] args) {
		
		FirstNonRepeatedCharacterClass fnrc= new FirstNonRepeatedCharacterClass();
		char c= fnrc.firstNonRepeatedCharacter("imranam");
		System.out.println("My first non repeated character is: " + c);
	}

}



	

