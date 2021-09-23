package com.app.String;

public class PalindromeOfString {

	public void testPalindrome() {
		String str = "cividc";
		System.out.println("Length is: " + str.length());

		boolean result = false;
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				result = false;
			} else {
				result = true;
			}
			i++;
			j--;
		}

		System.out.println("String is palindrome: " + result);
	}
	
	public void testPalindrome2()
	{
		String str = "civic";
		System.out.println("Length is: " + str.length());
		
		int j=0;
		char [] tstArray= str.toCharArray();
		char [] strArray= new char[str.length()];
		for (int i=tstArray.length-1; i>=0; i--, j++)
		{
			strArray[j]= tstArray[i];
		}
		
		String str2= String.valueOf(strArray);
		String str3= String.valueOf(tstArray);
		if(str2.equals(str3))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" Not Palindrome");
		}
		
		
	}

	public static void main(String[] args) {

		PalindromeOfString obj = new PalindromeOfString();
		//obj.testPalindrome();
		obj.testPalindrome2();
	}

}
