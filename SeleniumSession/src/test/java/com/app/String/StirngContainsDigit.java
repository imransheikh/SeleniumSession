package com.app.String;

public class StirngContainsDigit {

	public void testContainsDigit() {
		String str = "Imran sh1ikh";
		char[] strArray = str.toCharArray();
		for (Character c : strArray) {
			if (Character.isDigit(c)) {
				System.out.println("Yes..contains Digit");
				break;
			} else {
				//System.out.println("No.. it does not contain");
			}
		}
		

	}
	
	public static void main(String[] args) {
		
		StirngContainsDigit obj = new StirngContainsDigit();
		obj.testContainsDigit();
	}

}
