package com.app.interview;

interface calculate
{
	int VAR=0;
	void cal(int item);
}

class display implements calculate
{
 
	int x;
	@Override
	public void cal(int item) {
		if(item<2)
			x= VAR;
		else 
			x= item*item;
		
	}
	
}




public class Question21 {
	public static void main(String[] args) {
		
		display[] arr= new display[3];
		
		for(int i=0; i<3; i++)
		arr[i]= new display();
		arr[0].cal(0);
		arr[1].cal(1);
		arr[2].cal(2);
		
		System.out.println(arr[0].x + " " + arr[1].x + " " + arr[2].x);
		
	}
	

}
