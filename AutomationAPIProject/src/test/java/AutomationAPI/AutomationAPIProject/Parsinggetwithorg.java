package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.*;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Parsinggetwithorg {
	
	public static void main(String[] args) {
		

		Response r=
				
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/Testing_Team");
		
		JSONArray array=new JSONArray(r.asString());
		int L=array.length();                                // to Extract multiple values from array we used this 
	     for (int i = 0; i < L; i=i+1)                        // to Extract multiple values from array we used this 
	     {
	    	JSONObject Obj=array.getJSONObject(i);
	 		System.out.println(Obj.get("id"));
	 		
			
		}
	    
		
     
		
	}

}
