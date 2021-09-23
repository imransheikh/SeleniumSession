package com.app.ClassDesignPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortings {
	
	
	
	public void sortingStringObject()
	{
		List<String> al= new ArrayList();
		al.add("Imran");
		al.add("Sheikh");
		al.add("360Logica");
		al.add("Salmon");
		
		System.out.println("====================Before sorting=========================");
		for(String s: al)
		{
			System.out.println(s);
		}
		
		Collections.sort(al);
		System.out.println("=====================After sorting==========================");
		for(String ss: al)
		{
			System.out.println(ss);
		}
	}
	
	
	
	public void sortingWrapperClassObject()
	{
		List<Integer> al= new ArrayList();
		al.add(Integer.valueOf(203));
		al.add(Integer.valueOf(202));
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(206));
		
		System.out.println("====================Before sorting=========================");
		for(Integer s: al)
		{
			System.out.println(s);
		}
		
		Collections.sort(al);
		System.out.println("=====================After sorting==========================");
		for(Integer ss: al)
		{
			System.out.println(ss);
		}
	}

	public static void main(String[] args) {
		
		CollectionsSortings obj= new CollectionsSortings();
		//obj.sortingStringObject();
		obj.sortingWrapperClassObject();
	}

}
