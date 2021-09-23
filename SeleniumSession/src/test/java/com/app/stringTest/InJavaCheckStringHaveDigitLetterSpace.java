package com.app.stringTest;

public class InJavaCheckStringHaveDigitLetterSpace {
	
	
	public void checkStringVariousConcept(String str)
	{
		char[] test= str.toCharArray();
		for(Character c: test)
		{
			if((c.isDigit(c)) && (c.isWhitespace(c)) && (c.isLetter(c)) && (c.isLowerCase(c)))
			{
				
			}
				
		}
	}

}
