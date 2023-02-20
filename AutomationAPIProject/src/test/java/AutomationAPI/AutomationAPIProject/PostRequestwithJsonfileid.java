package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestwithJsonfileid 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f=new File("../AutomationAPIProject/Input_Request.Json"); // to establish communication
		FileReader RE=new FileReader(f);     // Reader file class input steam
		JSONTokener Js=new JSONTokener(RE); // Json file reader
		JSONObject Obj=new JSONObject(Js);
		
		System.out.println("Please enter the id value");
		Scanner S= new Scanner(System.in);
		Integer idvalues=S.nextInt();
		
		String bodydata=Obj.toString();
		bodydata=bodydata.replaceAll(Pattern.quote("{{id}}"), idvalues.toString());
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.post("http://localhost:3000/Testing_Team");
		
		System.out.println("Status code is "+res.statusCode());
		
		System.out.println("Response data is");
		
		System.out.println(res.asString());
		
	}

}
