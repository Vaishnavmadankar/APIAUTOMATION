package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETParticularonetag {
	public static void main(String[] args) {
		
		Response r=
				
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/Testing_Team");
	
		String sector=r.jsonPath().get("[7].Address[0].Type");
		System.out.println("Sector "+sector);
	}

}