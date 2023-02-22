package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Parsinggetparticularwithsetkey {
	public static void main(String[] args) {
		
		Response r=
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/Testing_Team");
				
		
		JSONArray array=new JSONArray(r.asString());
		JSONObject Obj=array.getJSONObject(2);
		
		Set<String> allKeys=Obj.keySet(); // to give all keys from JSONObject two
		
		for(String Dc : allKeys) {
			
			System.out.println("The Keys Name is "+ Dc);
			System.out.println("The Keys Values is "+Obj.get(Dc));
			
			
		}		
		
	}
}