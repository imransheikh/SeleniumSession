package com.app.ArrayInterview;

public class findLargetAndSmallest {

	public void largestSmallest(int[] arr) {
		//int [] arr= { 1,2,3,4,15,2,3};
		int smallest=arr[0];
		int temp=0;
		for (int k = 0; k < arr.length; k++) {
		
			for(int n=k+1; n<arr.length; n++)
			{
				if(arr[k]>arr[n])
				{
					temp= arr[k];
					arr[k]=arr[n];
					arr[n]=temp;
				}
			}
		}
		
		for(int m:arr)
		{
			System.out.print(m);
			System.out.print("\t");
		}
		System.out.println();
		System.out.println("Smallest is: "+ arr[0]);
		System.out.println("Largest  is: "+ arr[arr.length-1]);
	}
	
	public static void main(String[] args) {
		
		findLargetAndSmallest obj= new findLargetAndSmallest();
		int [] arr= { 1,2,3,4,15,2,3};
		obj.largestSmallest(arr);
	}
}
