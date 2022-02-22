package com.qa.rest.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GETCallBDD {
	@Test

	public void test_userfirstname()
	{
given().
when().
  get("https://reqres.in/api/users/").
then().
assertThat().
statusCode(200).
and().
body("data.id", hasSize(6)).
body("data.first_name",hasItems("George","Janet","Emma","Eve","Charles","Tracey"));





	
	
	}
}
