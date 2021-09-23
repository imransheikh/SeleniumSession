package com.app.RestAssurred;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateUser {

	
	
	@Test
	public void createUser()
	{
		JSONObject para= new JSONObject();
		para.put("name", "morpheus");
		para.put("job", "leader");
		
		// Creating a File instance 
		 File jsonDataInFile = new File("C://Imran_data//BackUp//BackUp//SeleniumJava//SeleniumJava//SeleniumReporting//JsonFiles//Payload1.json");
		 C://Imran_data//BackUp//BackUp//SeleniumJava//SeleniumJava//SeleniumReporting//JsonFiles
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpRequest= RestAssured.given().log().all().body(jsonDataInFile)
						.queryParam("test", "test");
		
		//httpRequest.body(para.toJSONString());
		Response response= httpRequest.request(Method.POST);
		//System.out.println(response.log().body());
				
		System.out.println("Status code: " + response.getStatusCode());
		System.out.println("Body: " + response.body().asString());
		
		ResponseBody body = response.getBody();
		/*
		 * CreateUserResponse createUserResponse= body.as(CreateUserResponse.class);
		 * System.out.println("Response ID: " + createUserResponse.id);
		 * System.out.println("Created By: " + createUserResponse.createdAt);
		 */
		
		
		
	}
	
}
