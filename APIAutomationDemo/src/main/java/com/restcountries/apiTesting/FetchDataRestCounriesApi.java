package com.restcountries.apiTesting;
import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class FetchDataRestCounriesApi {
	@Test
	public void fetchData() throws InterruptedException {
		
		Response resp=RestAssured.get("http://restcountries.eu/rest/v2/all");
		Thread.sleep(3000);
		ArrayList<String> currencyCode=new ArrayList<String>();
		currencyCode.add("ALL");
		ArrayList<Object> allCurreciesCode=resp.jsonPath().get("currencies.code");
		
		
		
		if(allCurreciesCode.contains(currencyCode)) {
			int index=allCurreciesCode.indexOf(currencyCode);
			Object reqCapital=resp.jsonPath().get("capital["+ index +"]");
			Object reqPopulation=resp.jsonPath().get("population["+ index +"]");
			Object reqCallingCode=resp.jsonPath().get("callingCodes["+ index +"]");
			System.out.println("calling code of the country is : "+reqCallingCode);
			System.out.println("capital of the country is : "+reqCapital);
			System.out.println("population of the country is : "+reqPopulation);
		}
		else {
			throw new IllegalArgumentException("No such currency found");
		}
	}

}
