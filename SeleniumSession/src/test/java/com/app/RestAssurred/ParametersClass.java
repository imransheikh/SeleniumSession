package com.app.RestAssurred;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

public class ParametersClass {
	
	
	//@Test
	public void TestParameters()
	{
		RestAssured.baseURI= "http://restcountries.eu/rest/v1/";
		Response response=RestAssured.given().pathParam("country", "Finland")
				.when()
				.get("name/{country}");
		//Reqrequest.pathParameter("country", "Finland")
		//Response response= Reqrequest.request(Method.GET);
		System.out.println("Status code: " + response.statusCode());
		System.out.println("Body: " + response.body().asString());
	}
	
	
	@Test
	public void QueryParameter()
	{
		//RestAssured.baseURI= "";
		Response response= RestAssured.given()
		.queryParam("globalDates", "{\"startMs\":1473672973818,\"endMs\":1481448973817,\"period\":90}")
		.queryParam("startFrom", "0").queryParam("limitTo", "6").queryParam("loadTvData", true)
		.queryParam("startFrom", "0").queryParam("userId", "5834fb36981baacb6a876427")
		.when().get("http://example.com/building");
		System.out.println("Status code: " + response.statusCode());
		System.out.println("Body: " + response.body().asString());
		
		
	}
	

}
