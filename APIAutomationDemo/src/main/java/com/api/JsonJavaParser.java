package com.api;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonJavaParser {
public Person unmarshaling(String filename,Class<Person> pobj) throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper mapper=new ObjectMapper();
	Person personData=mapper.readValue(new File(filename), pobj);
	return personData;
}
}
