package com.google.apiTesting;
import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class FetchGoogleApi {
	@Test
	public void fatchBookInfo() {
		Response resp=RestAssured.get("https://www.googleapis.com/books/v1/volumes?q=turning");
		String book="The Turning";
		ArrayList<Object> allBooks=resp.jsonPath().get("items.volumeInfo.title");
		
		if(allBooks.contains(book)) {
			int index=allBooks.indexOf(book);
			Object pageCount=resp.jsonPath().get("items.volumeInfo.pageCount["+index+"]");
			System.out.println("No of pages in the book is : "+pageCount);
			Object publishedDate=resp.jsonPath().get("items.volumeInfo.publishedDate["+index+"]");
			System.out.println("Published date is : "+publishedDate);
			Object authors=resp.jsonPath().get("items.saleInfo.retailPrice.amount["+index+"]");
			System.out.println("Author of the book is : "+authors);
		}
		else {
			throw new IllegalArgumentException("No such book found");
		}
	}

}
