package com.app.ArrayInterview;

public class SmallestPositiveIntegerNotSubset {
	
	
	
	public void findSmallestInteger(int [] arr)
	{
		int subset=0;
		for(int i: arr){
			System.out.print(i);
			System.out.print("\t");
		}
		
		System.out.println();
		System.out.println("==========================");
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int k=i+1; k<arr.length; k++)
			{
				subset= arr[i]+arr[k];
				System.out.print(subset);
				System.out.print("\t");
			}
		}
		System.out.println();
		System.out.println("==========================");
		
		System.out.print(0 & (1 << 0));
		System.out.println();
		
		 for (int i = 0; i < (1<<3); i++) 
	        { 
			    //System.out.print(i);
				//System.out.print("\t");
			  	System.out.print("{ "); 
				 for (int j = 0; j < 3; j++) 

						if ((i & (1 << j)) > 0) 
							System.out.print(j + " "); 

		                 
		              					
						System.out.print("}"); 

						
				 }
	        
	        
	}
	
	
	public void findSmallest(int arr[], int n)  
    { 
        int res = 1; // Initialize result 
  
        // Traverse the array and increment 'res' if arr[i] is 
        // smaller than or equal to 'res'. 
        for (int i = 0; i < n && arr[i] <= res; i++) 
        	
            res = res + arr[i]; 
  
        System.out.println(res);
    } 
	
	
	public void testMethod()
	{
		 for (int i = 0; i <3; i++) 
	        { 

				 for (int j = 0; j < 3; j++) 
					 System.out.println(i+    "  : " + j);
					//System.out.print("\t");

						
				 }
	        

	}
	
	public static void main(String[] args) {
		
		SmallestPositiveIntegerNotSubset obj= new SmallestPositiveIntegerNotSubset();
		int []arr= {1, 3, 6, 10, 11, 15};
		//obj.findSmallestInteger(arr);
		//obj.testMethod();
		 int arr1[] = {1, 1, 1, 1}; 
	      int n1 = arr1.length; 
	      obj.findSmallest(arr1,n1); 
	}
	

}
