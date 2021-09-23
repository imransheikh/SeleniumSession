package com.app.stringTest;

public class InJavaCountNumberOfConstantAndVowels {
	
	int Vcount =0;
	int Ccount =0;
	
	public void  countVowelAndConstant(String str)
	{
		char [] chars= str.toCharArray();
		
		for(Character c: chars)
		{
			if((c=='A') ||(c=='a') || (c=='E') ||(c=='e') || (c=='I') ||(c=='i') || (c=='O') ||(c=='o')
					|| (c=='U') ||(c=='u'))
			{
				Vcount++;
			}
			else 
			{
				Ccount++;
				
			}
			
		}
		System.out.println("My Total number if vowel are: " + Vcount);
		System.out.println("My Total number if constant are: " + Ccount);
	}

	
	public static void main(String[] args) {
		InJavaCountNumberOfConstantAndVowels obj= new InJavaCountNumberOfConstantAndVowels();
		obj.countVowelAndConstant("Amran");
	}
}
