package com.app.RestAssurred;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class TestToReadResponseData {

	/*
	1. Print no of courses returned by API 
	2. Print purchase Amount
	3. Print title of first course 
	4. Print all course title and their respective price
	5. Print no of copies sold by RPA course
	6. Verify if sum of all courses prices matches with purchase amount
	*/
	
	@Test
	public void testReadJsonResponse()
	{
		
		JsonPath js= new JsonPath(Payload.getPayload());
		System.out.println("Response is : " + js.prettify());
		
		// Print no of courses returned by API 
		List<String> courses=js.get("courses");
		System.out.println("Number of course are: " + courses.size());
		
		//Print purchase Amount
		int purchaseAmount= js.get("dashboard.purchaseAmount");
		System.out.println("Purchase Amount : " + purchaseAmount);
		
		//Print title of first course 
		String firstCourseTitle= js.get("courses[0].title");
		System.out.println("First Course Title: " + firstCourseTitle);
		
		
		//Print all course title and their respective price
		List<String> title=	js.get("courses.title");
		System.out.println("======================");
		System.out.println("Printing course title");
		for(String tl: title)
			System.out.print(tl + " , ");
		System.out.println();
		System.out.println("======================");
		
		List<Integer> price=	js.get("courses.price");
		System.out.println("======================");
		System.out.println("Printing course price");
		for(int pr: price)
			System.out.print(pr + " , ");
		System.out.println();
		System.out.println("======================");
		
		//Storing all the title and their course in Map
		Map<String, Integer> mp= new HashMap<>();
		for(int i=0; i<title.size(); i++)
		{
			mp.put(title.get(i), price.get(i));
		}
		
		//Printing all the title and their course in Map
		System.out.println("Title			Price");
		for(Map.Entry<String, Integer> map: mp.entrySet())
		{
			System.out.println(map.getKey()  + "			" + map.getValue());
		}
	}

}
