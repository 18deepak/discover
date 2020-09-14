package com.ra.practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchAllCountry {
	@Test
	public void getData() {
	Response resp=RestAssured.get("https://restcountries.eu/rest/v2/all");
	resp.prettyPrint();
	

}
}