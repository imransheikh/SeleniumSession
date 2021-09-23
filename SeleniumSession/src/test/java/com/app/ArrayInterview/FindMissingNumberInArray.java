package com.app.ArrayInterview;

import java.util.ArrayList;

public class FindMissingNumberInArray {
	
	public void findMissingNo(int []arr, int count)
	{
		
		
		int c= (count)*(count+1)/2;
		System.out.println(c);
		int sum=0;
		for(int k=0; k<arr.length; k++)
		{
			sum+=arr[k];
		}
		
		System.out.println("Sum :" + sum);
		int missing= c-sum;
		System.out.println("Missing Number is: " + missing);
		
		
		/*for(int i=0; i<arr.length; i++)
		{
			if(!(i==4))
			{
				arr[i]= i+1;
			}
			
			
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			System.out.print("\t");
		}
		System.out.println();
		System.out.println("Missing Number is: ");
		for(int n=1; n<=20; n++)
		{
			for(int i=0; i<arr.length; i++)
			{
				if((n==arr[i]))
				{
					//System.out.print(n);
					System.out.print("\t");
					break;
				}
				else {
					//System.out.println("Missing: ");
					System.out.print(n);
				}
				
			}
		}*/
		}
	
	public void missing()
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a[] = {1,3,5,6,7,10 };
		int j = a[0];
		for (int i=0;i<a.length;i++)
		{
		    if (j==a[i])
		    {
		        j++;
		        continue;
		    }
		    else
		    {
		        arr.add(j);
		        i--;
		    j++;
		    }
		}
		System.out.println("missing numbers are ");
		for(int r : arr)
		{
		    System.out.println(" " + r);
		}
	}
	
	
	public static void main(String[] args) {
		
		FindMissingNumberInArray obj= new FindMissingNumberInArray();
		//int []arr= new int[10];
		int []arr= {1,2,4,5,6,7,8,9,10};
		int count = 10;
		obj.findMissingNo(arr, count);
		//obj.missing();

	}

}
