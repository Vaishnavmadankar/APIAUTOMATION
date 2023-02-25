package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class DeleteRequest {

	public static void main(String[] args) {
	
		Response r=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete("http://localhost:3000/Testing_Team/7");
		
		System.out.println("Status code "+r.statusCode());
		
	}

}
