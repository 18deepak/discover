package com.ra.practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class InsertDataToposts {
	
	@Test
	public void postData() {
		RequestSpecification reqsp= RestAssured.given();
		JSONObject jobj=new JSONObject();
		jobj.put("id",19);
		jobj.put("title", "Mahadev");
		jobj.put("author", "Automation");
		String jsonData=jobj.toJSONString();
		reqsp.body(jsonData);
		reqsp.contentType(ContentType.JSON);
		RequestSender sender=reqsp.when();
		Response resp=sender.post("http://localhost:3000/posts");
		ValidatableResponse vr=resp.then();
		vr.log().all();
		}
	
	@Test
	public void putData() {
		RequestSpecification reqsp= RestAssured.given();
		JSONObject jobj=new JSONObject();
		jobj.put("title", "devloper");
		jobj.put("author", "manash");
		String jsonData=jobj.toJSONString();
		reqsp.body(jsonData);
		reqsp.contentType(ContentType.JSON);
		RequestSender sender=reqsp.when();
		Response resp=sender.put("http://localhost:3000/posts/3");
		ValidatableResponse vr=resp.then();
		vr.log().all();
		}
	
	@Test
	public void patchData() {
		RequestSpecification reqsp= RestAssured.given();
		JSONObject jobj=new JSONObject();
		
		jobj.put("author", "deepak");
		String jsonData=jobj.toJSONString();
		reqsp.body(jsonData);
		reqsp.contentType(ContentType.JSON);
		RequestSender sender=reqsp.when();
		Response resp=sender.patch("http://localhost:3000/posts/4");
		ValidatableResponse vr=resp.then();
		vr.log().all();
		
		}

}
