package com.qa.rest.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostCallBDD {
	@Test
	public void assertUser()
	{
		RestAssured.baseURI ="https://reqres.in/api/users/";
		RestAssured.given().body("{\n"+ 
				 "   \"name\": \"Madhur\",\n" +
		         "  \"job\":  \"SDET Professional\"\n" +
				 "}").post().then()
		          .log()
		          .all()
		          .assertThat()
		          .statusCode(201);
		
	}

}
