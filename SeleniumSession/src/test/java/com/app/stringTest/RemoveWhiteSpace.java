package com.app.stringTest;

public class RemoveWhiteSpace {
	
	public void testRemoveWhiteSpace(String str)
	{
		String str1= str.replaceAll("\\s", "");
		System.out.println("My string is: " + str1);
		
		char [] test= str.toCharArray();
		StringBuffer sb= new StringBuffer();
		for(int  i=0; i<test.length; i++)
		{
			if((test[i] !=' ') &&(test[i]!='\t') )
			{
				sb.append(test[i]);
			}
			
		}
		System.out.println("My string after removal : " + sb);
	}

	public static void main(String[] args) {
		RemoveWhiteSpace rwp= new RemoveWhiteSpace();
		rwp.testRemoveWhiteSpace("Imran sheikh    is best");
	}
}
