package com.restcountries.apiTesting;
import java.util.ArrayList;
import java.util.Iterator;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class FetchDataFromRestCountries {
	@Test
	public void getInfo() throws InterruptedException{
		Response resp=RestAssured.get("http://restcountries.eu/rest/v2/all");
		Thread.sleep(3000);
		ArrayList<String> currencyCode=new ArrayList<String>();
		currencyCode.add("ALL");
		boolean flag=false;
		ArrayList<Object> allCurrencyCode=resp.jsonPath().get("currencies.code");
		Iterator<Object> itr=allCurrencyCode.iterator();
		int count=0;
		while (itr.hasNext()) {
			Object obj =itr.next();
			if(obj.equals(currencyCode)) {
				System.out.println(currencyCode+"  is present in the list");
				Object requiredCapital=resp.jsonPath().get("capital["+count+"]");
				Object requiredPopulation=resp.jsonPath().get("population["+count+"]");
				Object requiredCalling=resp.jsonPath().get("callingCodes["+count+"]");
				System.out.println(requiredCapital+" is the capital of the country having currencyCode : "+currencyCode);
				System.out.println(requiredCalling+" is the calling  code of the country having currencyCode : "+currencyCode);
				System.out.println(requiredPopulation+" is the population of the country having currencyCode : "+currencyCode);
				flag=true;
				break;
			}
			count++;
			
		}
		if(!flag) {
			throw new IllegalArgumentException("No such currency found");
			
		}
		
	}
		
		
	

}
