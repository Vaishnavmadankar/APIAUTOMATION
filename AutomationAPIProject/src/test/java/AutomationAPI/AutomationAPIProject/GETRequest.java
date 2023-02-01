package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETRequest {
	public static void main(String[] args) {
		
		Response r=
				
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/Testing_Team");
		
		System.out.println("status code is "+r.getStatusCode());
		
		System.out.println("Response data is ");
		
		System.out.println(r.asString());
		
		
		
		
	}

}
