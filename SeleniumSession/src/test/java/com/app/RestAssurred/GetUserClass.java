package com.app.RestAssurred;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class GetUserClass {
	
	
	
	@Test(priority=0)
	public void GetUserInformation()
	{
		RestAssured restAssured= new RestAssured();
		RestAssured.baseURI= "https://reqres.in/api/users?page=2";
		
		RequestSpecification httpRequest=RestAssured.given();
		//httpRequest.request("Method.GET, arg1)
		Response response = httpRequest.request(Method.GET);
		
		System.out.println("My response: " + response.getBody().asString());
		System.out.println("Status code" + response.statusCode());
		System.out.println("Status line" + response.statusLine());
		
		ResponseBody body= response.getBody();
		
		/*
		 * UserInformation lib = mapper.readValue(jsonString, UserInformation.class);
		 * 
		 * 
		 * UserInformation userInformation= body.as(UserInformation.class);
		 * System.out.println("page" + userInformation.page);
		 * System.out.println("per page" + userInformation.per_page);
		 * System.out.println("total_pages" + userInformation.total_pages);
		 * System.out.println("data" + userInformation.data.toString());
		 */
		
		
		
		
	}

	
	//@Test
	public void createUser()
	{
		RestAssured.baseURI= "https://reqres.in/api/users";
		
		RequestSpecification httpPostRequest=RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "morpheus");
		requestParams.put("job", "leader");
		
		httpPostRequest.body(requestParams.toString());
		//httpPostRequest.body(requestParams.toJSONArray(arg0))
		
		Response response =httpPostRequest.request(Method.POST);
		
		System.out.println("User created: " + response.statusCode());
		
		
	}
	
	
	
	//@Test
	public void testMethod()
	{
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();
	 
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "sdimpleuser2dd2011");
		requestParams.put("Password", "password1");
	 
		requestParams.put("Email",  "sample2ee26d9@gmail.com");
		request.body(requestParams.toString());
		Response response = request.post("/register");
	}
	
}
