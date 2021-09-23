package com.app.collectionInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class ClassMapValuesToList {
 
 Map<Integer, String> map;
 
 public ClassMapValuesToList(Map<Integer, String> map) {
      this.map = map;
 }
 
 
 public List<String> convertValuesToList() {
    return new ArrayList(map.values());
 }
 
 
 public void TestMethod()
 {
	 System.out.println("===========LIST NEW METHOD==================");
	  Map<Integer, String> map= new HashMap<Integer, String>();
	    map.put(1, "one");
	    map.put(2, "two");
	    map.put(3, "three");
	    map.put(4, "Four");
	    List<String> listData= new ArrayList<String>();
	    listData.addAll(map.values());
	    for(String s: listData)
	    {
	    	System.out.println(s);
	    }
	    
	    List<Integer> listData1= new ArrayList<Integer>();
	    listData1.addAll(map.keySet());
	    System.out.println("===========INTEGER LIST NEW METHOD==================");
	    for(Integer s: listData1)
	    {
	    	System.out.println(s);
	    }
 }
 
 
 
 
 public static void main(String[] args) {           
 Map<Integer, String> map = new HashMap<Integer, String>();
 
    map.put(1, "one");
    map.put(2, "two");
    map.put(3, "three");
    map.put(4, "Four");
    map.put(5, "Five");
    map.put(6, "Six");
    map.put(7, "Seven");
    map.put(8, "Eight");
    map.put(9, "Nine");
    map.put(10, "Ten");
 
    ClassMapValuesToList  conv = new ClassMapValuesToList (map);
     List<String> keysList = conv.convertValuesToList();
     System.out.println("Values:");
    for (String val : keysList) {
       System.out.println(val);
}
    conv.TestMethod();
    
 
 }
}

