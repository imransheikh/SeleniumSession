package com.app.ArrayInterview;

public class FindIntersection {
	
	public void findInterSection(int[]arr1, int []arr2)
	{
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
					{	System.out.print(arr1[i]);
							System.out.print("\t");
					
					}
			}
	}
	}

	public static void main(String[] args) {
		int[]arr1= {21, 34, 41, 22, 35};
		int[]arr2= {61, 34, 45, 21, 11};
		FindIntersection obj= new FindIntersection();
		obj.findInterSection(arr1, arr2);
	}
}
