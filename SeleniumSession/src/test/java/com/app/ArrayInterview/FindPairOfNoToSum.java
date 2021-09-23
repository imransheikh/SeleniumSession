package com.app.ArrayInterview;

public class FindPairOfNoToSum {
	
	public void findPairs(int []arr, int sum)
	{
		//int [] arr= { 1,2,3,4,15,2,3};
		int pair=0;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int k=i+1; k<arr.length; k++)
			{
				pair= arr[i]+arr[k];
				//System.out.println(pair);
				if(pair==sum)
				{
					System.out.println("Pairs of " + arr[i] + " : " + arr[k] + "  = " +sum);
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		FindPairOfNoToSum obj= new FindPairOfNoToSum();
		int [] arr= { 1,2,3,4,15,2,3};
		int sum= 5;
		obj.findPairs(arr, sum);
	}

}
