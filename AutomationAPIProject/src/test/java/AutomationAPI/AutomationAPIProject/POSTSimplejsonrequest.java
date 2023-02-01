package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POSTSimplejsonrequest {
	public static void main(String[] args) {
		JSONObject ob=new JSONObject();
		ob.put("First_name", "Salman");
		ob.put("Last_name", "Khan");
		ob.put("Designation", "Senior Actor");
		ob.put("City", "bandra");
		ob.put("Employee_code", "007");
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(ob.toString())
		.when()
		.post("http://localhost:3000/Testing_Team");

		System.out.println("Status code is "+res.statusCode());
		
		System.out.println("Response data is");
		
		System.out.println(res.asString());
		
		
	

	}


}
