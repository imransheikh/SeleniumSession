package com.app.interview;

class box {
	
	int width;
	int height;
	int length;
	int volume;
	
	void volume()
	{
		volume= width*height*length;
	}
	
	
	void volume(int x)
	{
		volume= x;
	}
	
	
}



public class Question9 {
	public static void main(String[] args) {
		box obj= new box();
		obj.height=1;
		obj.length= 5;
		obj.width= 5;
		obj.volume(5);
		
		System.out.println(obj.volume);
	}
	
	
}
