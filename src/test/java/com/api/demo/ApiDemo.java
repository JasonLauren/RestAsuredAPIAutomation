package com.api.demo;

import org.testng.annotations.Test;

//import io.restassured.RestAssured;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.module.jsv.JsonSchemaValidator.*;
public class ApiDemo 
{
	public String uri="https://reqres.in/api/users?page=2";
	//Response res = RestAssured.get(uri);
	/*@Test
	public void getUserDetails()
	{

		String uri="https://reqres.in/api/users/2";
		Response res = RestAssured.get(uri);
		System.out.println(" body: " + res.asString());
		System.out.println("Status Code : " + res.statusCode());
	}*/
	@Test
	public void getUserDetials2()
	{
		given().
		get(uri).
		then().
			contentType("application/json").
			statusCode(200).
			body("data.email[0]", equalTo("michael.lawson@reqres.in")).
			body("data.id[0]",equalTo(7)).
			body("data.first_name[0]",equalTo("Michael")).
			body("data.last_name[0]",equalTo("Lawson")).
		log().body();
	}
	

}
