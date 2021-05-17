package Project;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestCalls {
	
	public static Response GetRequest(String uRI) 
	{
		//I am trying to pass my request
	  RequestSpecification requestspecification = RestAssured.given();
	  //either my content type can be with json/xml
	  requestspecification.contentType(ContentType.JSON);
	  //I am trying to fetch the URL
	  Response response = requestspecification.get(uRI);
	  return response;
	}
	
	public static Response GetRequestwithHeader(String uRI, String accessToken) 
	{
		//I am trying to pass my request
	  RequestSpecification requestspecification = RestAssured.given();
	  //either my content type can be with json/xml
	  requestspecification.contentType(ContentType.JSON);
	  requestspecification.header("Authorization", "bearer "+accessToken);
	  //I am trying to fetch the URL
	  Response response = requestspecification.get(uRI);
	  return response;
	}
	
	public static Response PostRequest(String uRI, String strJSON) 
	{
		//I am trying to pass my request
		  RequestSpecification requestspecification = RestAssured.given().body(strJSON);
		  //either my content type can be with json/xml
		  requestspecification.contentType(ContentType.JSON);
		  
		  //I am trying to fetch the URL
		  Response response = requestspecification.post(uRI);
		  return response;
	}
	public static Response PostRequestwithHeader(String uRI, String strJSON, String accessToken) 
	{
		//I am trying to pass my request
		  RequestSpecification requestspecification = RestAssured.given().body(strJSON);
		  //either my content type can be with json/xml
		  requestspecification.contentType(ContentType.JSON);
		  requestspecification.header("Authorization", "bearer "+accessToken);
		  //I am trying to fetch the URL
		  Response response = requestspecification.post(uRI);
		  return response;
	}
	public static Response PutRequest(String uRI, String strJSON) 
	{
		//I am trying to pass my request
		  RequestSpecification requestspecification = RestAssured.given().body(strJSON);
		  //either my content type can be with json/xml
		  requestspecification.contentType(ContentType.JSON);
		  //I am trying to fetch the URL
		  Response response = requestspecification.put(uRI);
		  return response;
	}
	
	public static Response DeleteRequest(String uRI, String strJSON) 
	{
		//I am trying to pass my request
		  RequestSpecification requestspecification = RestAssured.given().body(strJSON);
		  //either my content type can be with json/xml
		  requestspecification.contentType(ContentType.JSON);
		  //I am trying to fetch the URL
		  Response response = requestspecification.delete(uRI);
		  return response;
	}

	public static Response PostRequestwithTwoHeader(String uRI, String strJSON, String accessToken) 
	{
		//I am trying to pass my request
		  RequestSpecification requestspecification = RestAssured.given().body(strJSON);
		  //either my content type can be with json/xml
		  requestspecification.contentType(ContentType.JSON);
		  requestspecification.header("Authorization", accessToken);
		  requestspecification.header("Authorization", accessToken);
		  //I am trying to fetch the URL
		  Response response = requestspecification.post(uRI);
		  return response;
	}

}
