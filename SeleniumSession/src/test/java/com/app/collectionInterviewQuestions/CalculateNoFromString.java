package com.app.collectionInterviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateNoFromString {
	
	
	public void test(String s){
	       int sum = 0;
	        for(int i = 0; i < s.length() ; i++){
	            if( Character.isDigit(s.charAt(i)) ){
	                sum = sum + Character.getNumericValue(s.charAt(i));
	            }
	        }
	        System.out.println(sum);
	        
	        
	        
	        
	        String input = "abc12xx3";
	        Pattern pattern = Pattern.compile("[\\d]");
	        Matcher matcher = pattern.matcher(input);
	        int sum1 = 0;
	        while(matcher.find()) {
	            sum1 += Integer.parseInt(matcher.group());
	        }
	        System.out.println(sum1);
	        
	    }
	
	public static void main(String[] args) {
		CalculateNoFromString obj= new CalculateNoFromString();
		String s ="eww1dff12vv123";
		obj.test(s);
		
	}

}
