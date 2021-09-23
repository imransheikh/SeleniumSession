package com.app.ArrayInterview;

public class FindRepeatedTwiceExceptOne {

	
	public void findRepeatedExceptOne(int [] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			//int []arr= {1,2,4,1,3,2,3};
			int repeated= 1;
			int nonRepeated= 0;
			for(int k=i+1; k<arr.length; k++ )
			{
				if(arr[i]==arr[k])
				{
					repeated++;
					arr[k]=-1;
				}
			}
			
			if(arr[i]!=-1)
			{
				if(repeated!=2)
				{
					System.out.println(arr[i]);
				}
			}
				
		}
	}
			
		public static void main(String[] args) {
			FindRepeatedTwiceExceptOne obj= new FindRepeatedTwiceExceptOne();
			int []arr= {1,2,4,1,3,2,3};
			obj.findRepeatedExceptOne(arr);
		}	
}
