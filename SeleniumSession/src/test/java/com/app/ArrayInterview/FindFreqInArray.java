package com.app.ArrayInterview;

public class FindFreqInArray {
	
	
	
	public void getFrequency(int[] arr)
	{
		
		for(int i=0; i<arr.length-1; i++)
		{
			int count= 1;
			//{1,2,4,6,7,3,1,2,6,1};
			for(int m= i+1; m<arr.length; m++)
			{
				if(arr[i]==arr[m])
				{
					count++;
					arr[m]=-1;
				}
			}
			
			if(arr[i]!=-1)
			{
				System.out.println("No is: " +arr[i] + "  Frequency is: " + count );
				
			}
			
			
		}
	}

	
	public static void main(String[] args) {
		
		FindFreqInArray obj= new FindFreqInArray();
		int[] arr= {1,2,4,6,7,3,1,2,6,1, 4,4,4};
		obj.getFrequency(arr);
	}
}
