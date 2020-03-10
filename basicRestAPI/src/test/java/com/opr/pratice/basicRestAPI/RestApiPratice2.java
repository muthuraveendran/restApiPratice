package com.opr.pratice.basicRestAPI;

import java.io.IOException;
import java.io.InputStream;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class RestApiPratice2 {
	
	//to get the String in the API
//	@Test
	public void GetResponseAsString() {
		String stream =  get("https://jsonplaceholder.typicode.com/posts").asString();
		System.out.println("The Response will be print in the String Format: /n" + stream);
	};
	
	// get the length of characters in String API
//	@Test
	public void GetResponseInputSreamAsString() throws IOException {
		InputStream stream =  get("https://jsonplaceholder.typicode.com/posts").asInputStream();
		System.out.println("The Response will be print in the String Format: /n" + stream.toString().length());
		stream.close();
	};
	
	// To print the byte length of the given text 
//	@Test 
	public void testGetResponseAsByteArray() {
		byte [] ByteArray =  get("https://jsonplaceholder.typicode.com/posts").asByteArray();
		System.out.println("The Response will be print in the String Format: /n" + ByteArray.length);
	};
	
	
	// From an API hit a URL and get another URL passing to it
//	@Test
	public void testExtractDataUsingPath() {
			String href =
				when().
					get("https://jsonplaceholder.typicode.com/photos/1").
				then().
				statusCode(200).
					contentType(ContentType.JSON).
//					body("albumId", equals(1)).
				extract().
				    path("url");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + href);
		// Passing Another URL
		when().get(href).then().statusCode(200);					
	};
	
	//Type2 Another way to achieve the above scenario in one line
//	@Test
	public void testExtractDataUsingOnePath() {
		String href =
			when().
				get("https://jsonplaceholder.typicode.com/photos/1").andReturn().jsonPath().getString("thumbnailUrl");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + href);
		// Passing Another URL
				when().get(href).then().statusCode(200);					
     };
     
     //Extract a details as Response for future use
     @Test
     public void testExtractDetailsUsingResponse() {
    	 Response response =
    	 			when().
    	 				get("https://jsonplaceholder.typicode.com/photos/1").
    	 			then().
    	 				extract().response();
    			System.out.println(">>>>>>>>>>>>>Content Type>>>>>>>>>>>>>>>>>>>>>>" + response.contentType());
    			System.out.println(">>>>>>>>>>>>>>Href >>>>>>>>>>>>>>>>>>>>>" + response.path("url"));
    			System.out.println(">>>>>>>>>>>>>>>Status Code >>>>>>>>>>>>>>>>>>>>" + response.statusCode());
     }   
}
