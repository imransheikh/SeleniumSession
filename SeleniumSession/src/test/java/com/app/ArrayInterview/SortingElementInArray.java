package com.app.ArrayInterview;

public class SortingElementInArray {
	
	
	public void sumOfAllElement()
	{
		int arr[] = { 1, 2, 7, 6, 8, 0, 2, 2, 6 };
		
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
			
		}
		
		System.out.println("Sum of Element : " + sum);
	}
	
	
	
	
	public void testSort()
	{
		int arr[] = { 1, 2, 7, 6, 8, 0, 2, 2, 6 };
		
		int temp=0;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("3rd largest: " + arr[arr.length-3]);
	}
	
	
	public void removeDuplicate()
	{
		//int arr[] = { 1, 2, 7, 6, 8, 0, 2, 2, 6 };
		int arr[] = {10,20,20,20,30,30,40, 50,50};  
		int unique[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");			
		}
		
		int k=0;
		for(int i=0; i<arr.length-1; i++)
		{
				if(arr[i]!=arr[i+1])
				{
					unique[k++]= arr[i];
				}
		
		}
		unique[k++]= arr[arr.length-1];
		
		  for (int i=0; i<k; i++){  
	            arr[i] = unique[i];  
	        }  
		
		
		System.out.println();
		System.out.println("Unique element");
		for(int i=0; i<k; i++)
		{
			System.out.print(arr[i] + " ");			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		SortingElementInArray obj= new SortingElementInArray();
		//obj.testSort();
		
		//obj.sumOfAllElement();
		obj.removeDuplicate();
	}

}
