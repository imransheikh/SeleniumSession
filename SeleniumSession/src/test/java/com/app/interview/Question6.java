package com.app.interview;


class K{
	
	public K()
	{
		System.out.println("A");
	}
}


class B extends K{
	
	public B()
	{
		System.out.println("B");
	}
}



class C extends K{
	
	public C()
	{
		System.out.println("C");
	}
}
public class Question6 {
	
	public static void main(String[] args) {
		
		new C();
	}
	

}
