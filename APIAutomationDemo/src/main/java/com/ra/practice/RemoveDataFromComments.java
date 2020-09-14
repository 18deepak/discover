package com.ra.practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class RemoveDataFromComments {
	@Test
	public void deleteData() {
		Response resp=RestAssured.delete("http://localhost:3000/posts/3");
		resp.then().log().all();
		
		
		
	}
	

}
