package com.api;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJavaJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Person pobj=new Person("deepak","testengineer",245,2300);
		JavaJsonParser parser=new JavaJsonParser();
		parser.marshalling(pobj);
		System.out.println("pass");
		
	}

}
