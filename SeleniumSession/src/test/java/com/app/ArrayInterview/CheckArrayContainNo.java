package com.app.ArrayInterview;

public class CheckArrayContainNo {
	
	
	public void checkContainsNumber(int[] arr, int no)
	{
		for(int k=0; k<arr.length; k++)
		{
			if(arr[k]==no)
			{
				System.out.println("Yes Number exist");
			}
		}
		
		System.out.println("=============================");
		for(int i:arr)
		{
			System.out.print(i);
			System.out.print("\t");
		}
	}
	
	public static void main(String[] args) {
		CheckArrayContainNo obj= new CheckArrayContainNo();
		int [] arr= { 1,2,3,4,5,2,3};
		int n=5;
		obj.checkContainsNumber(arr,n);
	}

}
