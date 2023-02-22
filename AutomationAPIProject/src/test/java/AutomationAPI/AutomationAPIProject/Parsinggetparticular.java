package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Parsinggetparticular {
	public static void main(String[] args) {
		
		Response r=
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/Testing_Team");
				
		
		JSONArray array=new JSONArray(r.asString());
		JSONObject Obj=array.getJSONObject(2);
		System.out.println(Obj);
		

		
		
		
	}

}
