package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.*;

import java.util.Collection;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POSTARRAYJsonRequest {
	public static void main(String[] args) {
		
		JSONObject innerobject1=new JSONObject();
		innerobject1.put("Pincode", "440001");
		innerobject1.put("Dist", "Nagpur");
		innerobject1.put("Tahsil", "Umred");
		innerobject1.put("Type", "primary");
		
		JSONObject innerobject2=new JSONObject();
		innerobject2.put("Pincode", "441221");
		innerobject2.put("Dist", "Chandrapur");
		innerobject2.put("Tahsil", "Nagbhid");
		innerobject2.put("Type", "secondary");
		
		JSONArray jsonarray=new JSONArray();
		jsonarray.put(0,innerobject1);
		jsonarray.put(1,innerobject2);
		
		JSONObject Outer=new JSONObject();
		Outer.put("First_name", "Arbaj");
		Outer.put("Last_name", "Khan");
		Outer.put("Designation", "Legendary Actor");
		Outer.put("City", "bandara");
		Outer.put("Employee_code", "009");
		Outer.put("Address",jsonarray);
		
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
