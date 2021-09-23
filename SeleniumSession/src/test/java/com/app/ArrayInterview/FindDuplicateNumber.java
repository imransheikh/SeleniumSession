package com.app.ArrayInterview;

public class FindDuplicateNumber {
	
	
	public void findDuplciate(int []arr)
	{
		//int [] arr= { 1,2,3,4,5,2,3,2};
		for(int i=0; i<arr.length-1; i++)
		{
			int count=1;
			for(int k=i+1; k<arr.length; k++)
			{
				if(arr[i]==arr[k])
				{
					count++;
					arr[k]=-1;
					
				}
			}
			if(arr[i]!=-1){
				if(count>1 )
				{
					System.out.println("Duplicate: " + arr[i]);
				}
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		
		FindDuplicateNumber obj= new FindDuplicateNumber();
		int [] arr= { 1,2,3,4,5,2,3,2,5};
		obj.findDuplciate(arr);
	}

}
