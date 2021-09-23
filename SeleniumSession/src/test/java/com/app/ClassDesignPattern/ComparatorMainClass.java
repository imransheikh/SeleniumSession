package com.app.ClassDesignPattern;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMainClass {

	public static void main(String[] args) {
		
		Student s1= new Student(55, "Imran", 001);
		Student s2= new Student(23, "Sheikh", 005);
		Student s3= new Student(43, "Emilia", 002);
		Student s4= new Student(99, "Namita", 003);
		
		ArrayList<Student> al= new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("====================Before Sorting=======================");
		for(Student s: al)
		{
			System.out.println("Age : " + s.age + " Name: " + s.name + " Roll Number: " + s.rollNo);
		}
		
		
		Collections.sort(al, new AgeComparator());
		
		System.out.println("====================After Sorting=======================");
		for(Student s: al)
		{
			System.out.println("Age : " + s.age + " Name: " + s.name + " Roll Number: " + s.rollNo);
		}

	}

}
