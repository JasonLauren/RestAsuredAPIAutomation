package com.api.demo;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.equalTo;
public class putDemo
{
	
	String uri = "https://reqres.in/api/users/2";
	public void putUserDetails()
	{
//		Map<String ,Object> mp = new HashMap<String,Object>();
//		mp.put("first_name", "Bagila");
//		mp.put("id", "22");
//		mp.put("last_name","hamini");
//		System.out.println("user data to be posted in general format :"  + mp );
		JSONObject request = new JSONObject();
		//js.put(mp, js)
		//System.out.println("user data to be posted in Json format :"  + js );
		
		request.put("last_name","logo");
		request.put("first_name", "Mono");
		request.put("id", "500");
		
		given().
			body(request.toJSONString()).
		when().
			put(uri).
		then().
		statusCode(200).
		and().
			contentType("application/json").
			and().
			log().all();
		
//		given().
//			body(request.toJSONString()).
//		when().
//			post(uri).
//		then().
//			statusCode(201).
//		and().
//			contentType("application/json").
//		log().all();
	}


}
