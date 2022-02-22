package com.qa.rest.test;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class DeleteCallBDD {
	@Test
	
	public void DeleteUser()
	{
		JSONObject request = new JSONObject();
		request.put("name", "Madhur");
		request.put("job", "SDET Professional");
		System.out.println(request);
		System.out.println(request.toJSONString());
		RestAssured.given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).
		
		when().
		delete("https://reqres.in/api/users/2").then().
		statusCode(204).log().all();
	}
}
