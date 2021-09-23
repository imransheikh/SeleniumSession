package com.app.ClassDesignPattern;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMainClass {

	public static void main(String[] args) {

		ComparableClass1 obj1 = new ComparableClass1(15, 005, "Imran Sheikh");
		ComparableClass1 obj2 = new ComparableClass1(45, 003, "Emilia");
		ComparableClass1 obj3 = new ComparableClass1(32, 001, "Soji");
		ComparableClass1 obj4 = new ComparableClass1(28, 006, "Madelyn");

		ArrayList<ComparableClass1> al = new ArrayList<>();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		
		Collections.sort(al);
		for(ComparableClass1 s : al)
		{
			System.out.println(" Age is : " + s.age  + " Roll Number: " + s.rollNo + " Name: " + s.name);
		}
		
	}

}
