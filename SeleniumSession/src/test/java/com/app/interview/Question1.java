package com.app.interview;


class Overload {
	int x;
	double y;
	void add(int a, int b)
	{
		x=a+b;
	}
	
	void add(double c, double d)
	{
		y= c+d;
	}
	
	Overload()
	{
		this.x= 0;
		this.y=0;
	}
}


public class Question1 {
	
	public static void main(String[] args) {
		Overload obj= new Overload();
		int a= 2; 
		double b= 3.2;
		obj.add(a, a);
		obj.add(b, b);
		System.out.println(obj.x + "  " + obj.y);
	}
	

}
