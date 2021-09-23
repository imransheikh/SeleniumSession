package com.app.ArrayInterview;

public class CommonElementIn3Array {
	
	public void commonElements(int[]arr1, int []arr2, int[]arr3)
	{
		for(int i:arr1)
		{
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
		for(int i:arr2)
		{
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
		for(int i:arr3)
		{
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
		System.out.println("===========COMMON ELEMENTS================");
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				for(int k=0; k<arr3.length; k++)
				{
					if(arr1[i]==arr2[j])
					{
						if(arr2[j]==arr3[k])
						{
							System.out.print(arr1[i]);
							System.out.print("\t");
						}
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
	
		CommonElementIn3Array obj= new CommonElementIn3Array();
		int[]arr1= {1,2,3,4,5,6,7,8,9};
		int[]arr2= {1,2,3,4,5};
		int[]arr3= {4,5,6,7,8,9};
		obj.commonElements(arr1, arr2, arr3);
	}
	
}
