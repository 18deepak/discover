package com.api;

import javax.xml.bind.JAXBException;

public class TestJavaToXml {

	public static void main(String[] args) throws JAXBException {
		Employee eobj=new Employee(007,20000,"deepak","tester");
		JavaXmlParser prsr=new JavaXmlParser();
		prsr.marshalling(eobj);

	}

}
