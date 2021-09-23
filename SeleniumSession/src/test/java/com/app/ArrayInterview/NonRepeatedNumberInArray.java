package com.app.ArrayInterview;

public class NonRepeatedNumberInArray {
	
	public void nonReapedNumber(int []arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			//int [] arr= { 1,2,3,4,15,2,3};;
			int count=0;
			for(int m=i+1; m<arr.length; m++)
			{
				if((arr[i]==arr[m]))
				{
					
					count++;
					arr[m]=-1;
					//System.out.println("Yes...I am non repeated no: " + arr[i]);
					//break;
				}
			}
			if(arr[i]!=-1){
				if(count==0 )
				{
					System.out.println("Yes...I am non repeated no: " + arr[i]);
				}
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		
		NonRepeatedNumberInArray obj= new NonRepeatedNumberInArray();
		int [] arr= { 1,2,3,4,15,2,3,2};
		obj.nonReapedNumber(arr);
	}

}
