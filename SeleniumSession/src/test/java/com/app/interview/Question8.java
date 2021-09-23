package com.app.interview;

interface calculator 
{
	void cal(int item);
}

class DisplayA implements calculator
{
	int x;
	@Override
	public void cal(int item) {
		x= item*item;
		
	}
	
}

class DisplayB implements calculator
{
	int x;
	@Override
	public void cal(int item) {
		x= item/item;
		
	}
	
}

public class Question8 {
	
	public static void main(String[] args) {
		DisplayA obj1= new DisplayA();
		DisplayB obj2= new DisplayB();
		
		obj1.x= 0;
		obj2.x= 0;
		obj1.cal(2);
		obj2.cal(2);
		System.out.println(obj1.x + " " + obj2.x);
	}

}
