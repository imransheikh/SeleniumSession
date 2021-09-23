package com.app.collectionInterviewQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ClassHashtable {
	
	
	public void TestMethod()
	{
		Hashtable<Integer, String> hashTable= new Hashtable<Integer, String>();
		hashTable.put(1, "Imran");
		hashTable.put(2, "Pulkit");
		hashTable.put(3, "Prashant");
		hashTable.put(4, "Atul");
		
		Map<Integer, String> hashTable1= new HashMap<Integer, String>();
		hashTable1.put(1, "Imran");
		hashTable1.put(2, "Pulkit");
		hashTable1.put(3, "Prashant");
		hashTable1.put(4, "Atul");
		
		for(Map.Entry<Integer, String> mk: hashTable.entrySet())
		{
			System.out.println(mk.getKey() + " : " + mk.getValue());
		}
		
		
		System.out.println("===============================");
		//List<String> str= new ArrayList<String>();
		Collection<String> str= hashTable.values();
		
		Iterator itr= str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//str= hashTable1.values();
		
	}
	
	public static void main(String[] args) {
		ClassHashtable obj= new ClassHashtable();
		obj.TestMethod();
		
	}

}
