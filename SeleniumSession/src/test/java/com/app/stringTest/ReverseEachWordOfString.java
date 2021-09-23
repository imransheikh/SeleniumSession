package com.app.stringTest;

public class ReverseEachWordOfString {
	
	public void reverseEachWordOfString(String str)
	{
		String [] stringWord= str.split(" ");
		int j= stringWord.length;
		String Sreverse="";
		for(int i=0; i<stringWord.length; i++)
		{
			System.out.println("Before Reverse: " + stringWord[i]);
			Sreverse=stringWord[i];
			//System.out.println("my splitted words are : " + Sreverse);
			//char[] Creverse= new char[Sreverse.length()];
			System.out.println("my length is: "+Sreverse.length() );
			char[] Creverse= new char[Sreverse.length()];
			char [] charArray= Sreverse.toCharArray();
			for(int k=charArray.length; k>=0; k--)
			{
				Creverse[k-1]=charArray[k];
				System.out.println("My test: " + Creverse[k]);
				Sreverse= Sreverse+Creverse[i];
			}
			
			//System.out.println("After Reverse: " + Sreverse);
		}
		
	
		for(String s: stringWord)
		{
			//System.out.println("my words are: " + s);
		}
	}

	public static void main(String[] args) {
		ReverseEachWordOfString rv= new ReverseEachWordOfString();
		rv.reverseEachWordOfString("Imran");
		//rv.reverseEachWordOfString("Imran sheikh Irfan Khan");
	}
}
