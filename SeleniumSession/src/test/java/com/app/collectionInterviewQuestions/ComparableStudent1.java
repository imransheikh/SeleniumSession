package com.app.collectionInterviewQuestions;

import java.util.Collections;

public class ComparableStudent1 implements Comparable<ComparableStudent1>{

	int rollNo;
	String name;
	String address;
	
	public ComparableStudent1(int rollNo, String name, String address) {
		this.rollNo= rollNo;
		this.name= name;
		this.address= address;
	}
	
	@Override
	public int compareTo(ComparableStudent1 o1) {
		//Collections.sor
		
		return name.compareTo(o1.name);  
		
	}
	
	
	

}
