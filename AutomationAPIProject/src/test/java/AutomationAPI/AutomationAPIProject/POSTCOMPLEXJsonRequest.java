package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POSTCOMPLEXJsonRequest {
	public static void main(String[] args) {
		
	
	JSONObject inner=new JSONObject();
	inner.put("Pincode", "441221");
	inner.put("Dist", "Chandrapur");
	inner.put("Tahsil", "Nagbhid");
	
	JSONObject Outer=new JSONObject();
	Outer.put("First_name", "Sohel");
	Outer.put("Last_name", "Khan");
	Outer.put("Designation", "Senior Actor brother");
	Outer.put("City", "bandra");
	Outer.put("Employee_code", "008");
	Outer.put("Address",inner);
	
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(Outer.toString())
			.when()
			.post("http://localhost:3000/Testing_Team");

			System.out.println("Status code is "+res.statusCode());
			
			System.out.println("Response data is");
			
			System.out.println(res.asString());
	
	}
	
	}

