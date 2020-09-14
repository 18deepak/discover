package com.ra.practice;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoJsonPath {
	@Test
	public void checkJsonPath() {
		Response resp=RestAssured.get("http://localhost:3000/posts");
		
		
		
		Object obj1=resp.jsonPath().get("employee.skills.selenium");
		System.out.println("selenium rating is "+obj1);
		
		Object obj2=resp.jsonPath().get("employee.skills.java");
		System.out.println("java rating is "+obj2);
		
		Object obj3=resp.jsonPath().get("employee.skills.manual");
		System.out.println("manual rating is "+obj3);
		
		Object obj4=resp.jsonPath().get("employee.name");
		System.out.println("selenium rating is "+obj4);
		
		Object obj5=resp.jsonPath().get("employee.skills");
		System.out.println("skills are "+obj5);
		

		ArrayList<Object> obj6=resp.jsonPath().get("employee.skills.selenium");
		System.out.println("selenium rating is "+obj6);
		System.out.println("1st javarating is "+obj6.get(0));
		System.out.println("2ndd javarating is "+obj6.get(1));
		System.out.println("3rd javarating is "+obj6.get(2));
		System.out.println("3rd javarating is "+obj6.get(5));
		//if index is invalid we get "null"
		
		
		Object obj7=resp.jsonPath().get("employee.skills.selenium[2]");
		System.out.println(" 3rd selenium rating is "+obj7);
		
		Object obj8=resp.jsonPath().get("employee.skills.selenim[2]");
		System.out.println(" 3rd selenium rating is "+obj8);
		//if json path is invalid we get null
	}

}
