package com.app.stringTest;

public class NumberOfVowelAndConstants {

	
	public void testVowelConstant(String str)
	{
		int Vcount=0;
		int Ccount=0;
		String vowel="";
		char [] charArray= str.toCharArray();
		for (char c: charArray)
		{
			if(c=='A' || c=='a' || c=='E' || c=='e' ||c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u')
			{
				
				vowel=vowel+c;
				
				System.out.println("Vowels are: " + vowel);
				Vcount++;
			}
			else{
				Ccount++;
			}
			
		}
		System.out.println("Vowels are: " + vowel);
		System.out.println("My vowel count is: " + Vcount);
		System.out.println("My constant count is: " + Ccount);
	}
		public static void main(String[] args) {
			NumberOfVowelAndConstants nc= new NumberOfVowelAndConstants();
			nc.testVowelConstant("Imran sheikh");
		}
}
