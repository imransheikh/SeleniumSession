package com.app.ArrayInterview;

public class RotateLeftArrayElement {
	
	
	public void rotateLeft(int[]arr)
	{
		System.out.println();
		System.out.println("===============Before Rotating Element=================");
		System.out.println();
		for(int a: arr)
		{
			System.out.print(a);
			System.out.print("\t");
		}
		//arr[arr.length-1]= arr[0];
		int first= arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]= first;
		//arr[0]=arr[arr.length-1];
		
		System.out.println();
		System.out.println("===============After Rotating Element=================");
		System.out.println();
		for(int a: arr)
		{
			System.out.print(a);
			System.out.print("\t");
		}
	}
	
	
	public void rotateByNo(int[] arr, int t)
	{
		for(int n= 0; n<t; n++)
		rotateLeft(arr);
		System.out.println("======================");
	}

	public static void main(String[] args) {
		RotateLeftArrayElement obj = new RotateLeftArrayElement();
		int[] arr= {2,4,1,5,7};
		//output {4,1,5,7,2}
		//obj.rotateLeft(arr);
		obj.rotateByNo(arr,2);
	}
}
