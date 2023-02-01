package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETParticularRequest {
	public static void main(String[] args) {
		
		Response res=
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/Testing_Team/4");
		
		System.out.println("Status code response "+res.getStatusCode());
		
		System.out.println("Response data is");
		
		System.out.println(res.asString());
		
	}

}
