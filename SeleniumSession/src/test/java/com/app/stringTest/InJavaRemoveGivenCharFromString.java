package com.app.stringTest;

public class InJavaRemoveGivenCharFromString {

	
	public void removeChar(char c, String str)
	{
		char [] charArray= str.toCharArray();
		char [] newCharArray= new char[charArray.length];
		
		int i=0;
		for(Character cc: charArray)
		{
			//System.out.println("My character are: " + cc);
			if(!(cc==c))
			{
				newCharArray[i]=cc;
				System.out.println("My new char test: "+ newCharArray[i]);
				i++;
			}
		}
		
		String newUpdatedString = String.valueOf(newCharArray);
		System.out.println("My new String is: " + newUpdatedString);
		
	}
	
	public static void main(String[] args) {
		InJavaRemoveGivenCharFromString obj = new InJavaRemoveGivenCharFromString();
		obj.removeChar('a', "Imran");
	}
	
}
