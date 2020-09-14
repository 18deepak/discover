package com.restcountries.apiTesting;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchCurrencies {
	@Test
	public void fetchAllCurrencies() throws InterruptedException {
		Response resp=RestAssured.get("http://restcountries.eu/rest/v2/all");
		Thread.sleep(2000);
		ArrayList<Object> allCurrencyCode=resp.jsonPath().get("currencies.code");
		System.out.println("All countries currency code are \n"+allCurrencyCode);
		System.out.println("==========================================================================================================");
		
		}
	
	@Test
	public void fetchCurrencyByIndex() throws InterruptedException {
		Response resp=RestAssured.get("http://restcountries.eu/rest/v2/all");
		Thread.sleep(2000);
		ArrayList<Object> FirststCurrency=resp.jsonPath().get("currencies.code[0]");
		System.out.println("First currency is: "+FirststCurrency);
		
		ArrayList<Object> secondCurrency=resp.jsonPath().get("currencies.code[1]");
		System.out.println("Second currency is: "+secondCurrency);
		
		ArrayList<Object> eighteenthCurrency=resp.jsonPath().get("currencies.code[17]");
		System.out.println("Eighteenth currency is: "+eighteenthCurrency);
		System.out.println("=========================================================================================================");
		
		}
	

	@Test
	public void fetchCurrenyByNationName() throws InterruptedException {
		Response resp=RestAssured.get("http://restcountries.eu/rest/v2/all");
		Thread.sleep(2000);
		String reqCountry="Sri Lanka";
		boolean flag=false;
		ArrayList<Object> allNationName=resp.jsonPath().get("name");
		Iterator<Object> itr=allNationName.iterator();
		int count=0;
		while (itr.hasNext()) {
			Object obj =itr.next();
			if(obj.equals(reqCountry)) {
				System.out.println(reqCountry+"  is present in the list");
				Object curencyCode=resp.jsonPath().get("currencies.code["+count+"]");
				System.out.println(reqCountry+" is having currency code as : "+curencyCode);
				flag=true;
				break;
			}
			count++;
			
		}
		if(!flag) {
			System.out.println(reqCountry+" is not present");
			
		}
		System.out.println("=================================================================================================");
	}
	
	@Test
	public void fetchCurrenyByTheCountryName() {
		Response resp=RestAssured.get("http://restcountries.eu/rest/v2/all");
		ArrayList<String> country=new ArrayList<String>();
		country.add("India");
		ArrayList<Object> allCountriesName=resp.jsonPath().get("name");
		System.out.println("all country names are \n "+allCountriesName);
		
		
		if(allCountriesName.contains(country)) {
			int index=allCountriesName.indexOf(country);
			Object currencyCode=resp.jsonPath().get("currencies.code["+ index +"]");
			System.out.println(country+"having currency code as : "+currencyCode);
		}
		else {
			System.out.println("country not found");
		}
		System.out.println("==============================================");
	}
	

}
