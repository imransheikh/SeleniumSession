package com.app.RestAssurred;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class MockAPI {
	
	/*
 	1. Print no of courses returned by API 
	2. Print purchase Amount
	3. Print title of first course 
	4. Print all course title and their respective price
	5. Print no of copies sold by RPA course
	6. Verify if sum of all courses prices matches with purchase amount
	 */
	
	@Test
	public void parseComplexMockResponse()
	{
		JsonPath js= new JsonPath(Payload.getPayload());
		System.out.println("Response is: " + js.prettify());
	
		//Print no of courses returned by API 
		List<String> list=	js.get("courses");
		System.out.println("Number of course : " + list.size());
	
		//Print purchase Amount
		int purchaseAmount = js.get("dashboard.purchaseAmount");
		System.out.println("Purchase Amount is: " + purchaseAmount);
		
		//Print title of first course 
		String titleOfFirstCourse = js.get("courses[0].title");
		System.out.println("Title of first course " + titleOfFirstCourse);
		
		//Print all course title and their respective price
		List<String> titles = js.get("courses.title");
		for(String str: titles )
		{
			System.out.println("titles: " + str);
		}
		
		
		List<Integer> prices = js.get("courses.price");
		for(int pr: prices )
		{
			System.out.println("Prices: " + pr);
		}
		Map<String,Integer> map= new HashMap<String,Integer>();
		
		
		
		for(int i=0; i<titles.size(); i++)
		{
	
			map.put(titles.get(i), prices.get(i));
		}
		
		for(Map.Entry mp: map.entrySet())
		{
			System.out.println("Key: " + mp.getKey() + " Value: " + mp.getValue());
			
		}
		
		
		//Print no of copies sold by RPA course
		List<Integer> copies = js.get("courses.copies");
		Map<String,Integer> mapNew= new HashMap<String,Integer>();
		
		for(int i=0; i<copies.size(); i++)
		{
	
			mapNew.put(titles.get(i), copies.get(i));
		}
		System.out.println("====================================");
		for(Map.Entry mp: mapNew.entrySet())
		{
			//System.out.println("Key: " + mp.getKey() + " Value: " + mp.getValue());
			if(mp.getKey().equals("RPA"))
			{
				System.out.println("RPA Copies sold : " + mp.getValue());
			}
			
		}
		
		
		
		
		//Verify if sum of all courses prices matches with purchase amount
		//List<Integer> copies = js.get("courses.copies");
		Map<Integer,Integer> mapNew2= new HashMap<Integer,Integer>();
		
		for(int i=0; i<titles.size(); i++)
		{
	
			mapNew2.put(prices.get(i), copies.get(i));
		}
		System.out.println("====================================");
		int sum=0;
		for(Map.Entry mp: mapNew2.entrySet())
		{
			//System.out.println("Key: " + mp.getKey() + " Value: " + mp.getValue());
			int price= (Integer) mp.getKey();
			int copiess= (Integer) mp.getValue();
			sum= sum+ (price*copiess);
			
		}
		
		System.out.println("Total price is: " + sum);
				
	}
	
	
	

}
