package com.opr.pratice.basicRestAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import service.Service;

public class BasiceOne {//extends Service {
	
	//@Test
//	public void JiraAPIUpdate(){
		
		
//		RestAssured.baseURI= "https://reqres.in";
//		RestAssured.baseURI= "http://localhost:3000";
//		
//		
//		Header header = new Header("Content-Type", "application/json");
//  Response  res = given().				
//		body("{\"email\": \"ev232ss44e.holt@reqres.in\",\"password\":\"Password@123\"}").header(header).
//		when().
//		post("/posts").
//		then().assertThat().statusCode(201).extract().response();
//  
//                           System.out.println("cccccccccccccccccccccccccccccccc"+res);			
//		
                           
//   Task2
                           
//                           String respon = res.asString();
//                           System.out.println(respon+"vcccccccccccccccccc");
//                           
//                           JsonPath js = new JsonPath(respon);
//                           
//                           String getAnId = js.get("id");
//                           
//                           System.out.println(">>>>>>>>>>>>>>"+getAnId);
//		
		
		
	
		
		
		
		
		
		
		
		
		  
//	}
		
	@Test
	public void ExtractData() {
	
				given().
					get("https://jsonplaceholder.typicode.com/photos/1").
				then().
				statusCode(200).
					contentType(ContentType.JSON);
		
		
					
	}

}
