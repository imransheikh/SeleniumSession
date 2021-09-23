package com.app.String;

import java.util.Arrays;

public class SortString {
	
	public void testSort()
	{
		String st= "Noida";
		String str= st.toLowerCase();
		
		System.out.println("====================");
		System.out.println(str);
		System.out.println("====================");
		char[] strArray= str.toCharArray();
		Arrays.sort(strArray);
		
		String strNew= String.valueOf(strArray);
		System.out.println("=======================");
		System.out.println(strNew);
	}
	
	
	
	public static void main(String[] args) {
		SortString obj= new SortString();
		obj.testSort();
	}

}
