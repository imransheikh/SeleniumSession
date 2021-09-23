package com.app.RestAssurred;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.*;

public class GetCityInformation {
	
	
	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI= "https://reqres.in/api/users?page=2";
		
		RequestSpecification httpRequest= RestAssured.given();
		
		Response response= httpRequest.request(Method.GET);
		
		System.out.println("User Response is: " + response.body().asString());
		
		System.out.println("Status code of the response: " +response.getStatusCode() );
		
		System.out.println("Content Type: " +response.getContentType() );
		System.out.println("Status line Type: " +response.getStatusLine() );
		System.out.println("Session Id Type: " +response.getSessionId() );
		
		String responseString= response.body().asString();
		System.out.println("Contains: " +responseString.contains("George"));
		
		
		System.out.println("=========Reading perticular node by using JsonPath==========");
		
		JsonPath jsonPathEvaluator= response.jsonPath();
		
		System.out.println("Nodes: " + jsonPathEvaluator.get("per_page"));
		System.out.println("Nodes: " + jsonPathEvaluator.get("total"));
		System.out.println("Nodes: " + jsonPathEvaluator.get("total_pages"));
		System.out.println("Nodes names: " + jsonPathEvaluator.get("data.first_name"));
		
		List<String> name= jsonPathEvaluator.get("data.first_name");
		System.out.println("Names: " + name);
		for(String n: name)
		{
			System.out.println("Names are: " + n);
		}
		
		List<Map<Object, Object>> data= jsonPathEvaluator.get("data");
		//data.get(1).
		for(Map<Object, Object> str: data)
		{

            // get entrySet() into Set
            Set<Object> setOfIndianStates = str.keySet();
 
            // Collection Iterator
            Iterator<Object> iterator = 
            		setOfIndianStates.iterator();
 
            // iterate using while-loop after getting Iterator
            while(iterator.hasNext()) {
 
              //System.out.println("Test data: " + iterator.next());
            Object obj=   iterator.next();
            System.out.println("All object values: " + str.get(obj));
            
                
            }
			
		}
		
		
		
		String url= jsonPathEvaluator.get("support.url");
		System.out.println("URL is : " + url);
		
		
		
		
		
		Headers headers= response.getHeaders();
		for(Header hd : headers)
		{
			System.out.println("headers: " + hd);
		}
		
	}

}
