package commonUtils;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredWebServices {

	String uri="";
	RequestSpecification httpRequest;
	Response response;
	String responseBody;
	Headers headerList;

	//Constructor to set the base URi
	RestAssuredWebServices(String uri){
		this.uri=uri;
		RestAssured.baseURI=uri;
	}
	
	//Get method for the given name
	public void get(String name) {
	 httpRequest=RestAssured.given();
	 response = httpRequest.request(Method.GET, name);
	}
	
	//getting the response body
	public String getRequestBody() {
		responseBody=response.getBody().asString();
		return responseBody;
	}
	
	public int getStatus() {
		return response.getStatusCode();
	}
	
	public void getHeaders() {
		  headerList=response.getHeaders();
	}
	
	
}
