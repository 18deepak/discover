package com.api;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJsonJava {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		JsonJavaParser parser=new JsonJavaParser();
		Person pobj=parser.unmarshaling("Person.json", Person.class);
		System.out.println("Person data is ");
		System.out.println(pobj);
		

	}

}
