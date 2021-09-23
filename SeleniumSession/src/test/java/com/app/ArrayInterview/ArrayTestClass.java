package com.app.ArrayInterview;

public class ArrayTestClass {
	
	
	
	public void testArray()
	{
		int arr[]= new int[5];
		arr[0]= 2;
		arr[1]= 1;
		arr[2]= 4;
		arr[3]= 6;
		arr[4]= 3;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	
	public void PassArrayTest(int arr[])
	{
		int min= arr[0];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum eleemnt is : " + min);
	}
	
	
	public void TwoDimArray()
	{
		int twoArray[][]= { {1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int i=0; i<3; i++)
		{
				for(int j=0; j<3; j++)
				{
					System.out.print( twoArray[i][j] +  "   ");
				}
				System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ArrayTestClass obj= new ArrayTestClass();
		/*
		 * obj.testArray(); System.out.println("=========================="); int
		 * testArray[]= {22,4,34,1,334}; obj.PassArrayTest(testArray);
		 */		
		obj.TwoDimArray();
	}

}
