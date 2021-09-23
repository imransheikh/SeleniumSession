package com.app.ArrayInterview;

public class DuplicateElement {
	
	
	
	public void testDuplicate()
	{
		int arr[] = { 1, 2, 7, 6, 8, 1, 2, 2, 6 };
		//int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
	
	
	public void testReverseElement()
	{
		int arr[] = { 1, 2, 7, 6, 8, 1, 2, 2, 6 };
		//int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + "  ");
		}
	}
	
	
	public void testEvenElement()
	{
		int arr[] = { 1, 2, 7, 6, 8, 1, 2, 2, 6 };
		//int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		
		System.out.println();
		for(int i=1; i<arr.length; i=i+2)
		{
			System.out.print(arr[i] + "  ");
		}
	}
	
	
	public void testMax() {
		int arr[] = { 1, 2, 7, 6, 8, 1, 2, 2, 6 };
		
		int max= arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			//System.out.print(arr[i] + "  ");
			if(arr[i]<max)
			{
				max=arr[i];
			}
			
		}
		
		System.out.println("Max element is : " + max);

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		DuplicateElement obj= new DuplicateElement();
		//obj.testDuplicate();
		//obj.testReverseElement();
		System.out.println();
		//obj.testEvenElement();
		obj.testMax();
	}

}
