package com.api;

import javax.xml.bind.JAXBException;

public class TestXmlToJava {

	
		public static void main(String[] args) throws JAXBException {
			XmlJavaParser prsr=new XmlJavaParser();
			prsr.unmarshalling("Employee.xml");

	}

}
