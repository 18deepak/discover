package com.ra.practice;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchDataFromPosts {
	@Test
	public void getData() {
		Response resp=RestAssured.get("http://localhost:3000/posts");
		int statusCode=resp.statusCode();
		System.out.println("Status code is : "+statusCode);
		System.out.println("-----------------------------------");
		String contentType=resp.contentType();
		System.out.println("content type is : "+contentType);
		System.out.println("-----------------------------------");
		long responseTime=resp.getTime();
		System.out.println("-----------------------------------");
		System.out.println("Response time is : "+responseTime);
		System.out.println("-----------------------------------");
		String actualContent=resp.asString();
		System.out.println("Actual content is : \n"+actualContent);
	}

}
