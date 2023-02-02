package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestwithJsonfile 
{
  public static void main(String[] args) throws FileNotFoundException {
	File f=new File("../AutomationAPIProject/Input_Request.Json");
	FileReader RE=new FileReader(f);
	JSONTokener Js=new JSONTokener(RE);
	JSONObject Obj=new JSONObject(Js);
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(Obj.toString())
			.when()
			.post("http://localhost:3000/Testing_Team");

			System.out.println("Status code is "+res.statusCode());
			
			System.out.println("Response data is");
			
			System.out.println(res.asString());
	
	
	
  }
}
