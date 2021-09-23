package com.app.RestAssurred;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CheckPostCodesAreValid {

	@DataProvider(name = "PostCode-provider")
	public Object[][] dataProvideMethod() {
		 return new Object[][] {{"EN1 2RE"}, {"OX49 5NU"}, {"M32 0JG"}, {"OX495NU"},
			 {"NE30 1DP"},{"AB8 1RA"},{"DL8 1RA"},{"AB42 3FB"},{"EX2M 2PF"} };
		
	}

	@Test(dataProvider = "PostCode-provider")
	public void TestPostCodes(String postCode) {

		RestAssured.baseURI = "https://api.postcodes.io/postcodes";

		JsonPath js = new JsonPath(Payload.getPostCodePayload(postCode));
		System.out.println("paylaod is: " + js.prettify());
		RequestSpecification httpPostRequest = RestAssured.given().contentType(ContentType.JSON).body(js.prettify());

		Response response = httpPostRequest.request(Method.POST);

		System.out.println("Response as String " + response.asString());

		JsonPath jsPath = response.jsonPath();
		String postcode = jsPath.get("result[0].result.postcode");
		System.out.println("Post code is: " + postcode);
		Assert.assertNotNull(postcode, "Postcode should not be returned Null for valid postal code");
	}

}
