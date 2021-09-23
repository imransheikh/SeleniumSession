package com.app.stringTest;

public class InJavaReverseString {
	char [] reverseChar;
	public void reverseString(String str)
	{
		System.out.println("My orignal string is: " + str);
		char [] characters= str.toCharArray();
		char [] reverseChar = new char [characters.length];
		System.out.println("my length is: " +reverseChar.length );
		//char [characters.length-1] reverseChar= new char[];
		//for(int i=0; i<characters.length; i++)
		int k=0;
		for (int i = characters.length - 1; i >= 0; i--) {
			if (i < 0) {
				break;
			}
			System.out.println("My char are: " + characters[i]);
			reverseChar[k] = characters[i];
			k++;
			// System.out.println("My reverse are: " +characters[i-1] );
		}

			for(int i=0; i<reverseChar.length; i++)
			{
				
				System.out.println("My reverse are: " +reverseChar[i] );
				
				
			}
			String str12= String.valueOf(reverseChar);
			System.out.println("My reverse String is: " + str12);
			
	}
	public static void main(String[] args) {
		InJavaReverseString obj= new InJavaReverseString();
		obj.reverseString("Imran");
	}

}
