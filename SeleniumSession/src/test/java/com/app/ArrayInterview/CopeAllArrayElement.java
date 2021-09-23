package com.app.ArrayInterview;

public class CopeAllArrayElement {
	
	
	
	public void testCopy()
	{
		int arr[]= {1,2,4,5};
		int arra[] = new int [arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
			arra[i]= arr[i];
		}
		System.out.println();
		System.out.println("======================");
		
		for(int i=0; i<arra.length; i++)
		{
			System.out.print(arra[i] + " ");
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		CopeAllArrayElement obj= new CopeAllArrayElement();
		obj.testCopy();
	}
	

}
