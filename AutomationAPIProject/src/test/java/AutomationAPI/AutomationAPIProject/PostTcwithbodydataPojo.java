package AutomationAPI.AutomationAPIProject;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostTcwithbodydataPojo {
	
	public static void main(String[] args) {
		
		AddressInformation[] add=new AddressInformation[2];
		
		add[0]=new AddressInformation();
		add[0].setLandmark("LANDMARK1");
		add[0].setFlatno("L23");
		add[0].setStreetno("90");
		add[0].setLocation("Nagpur");
		add[0].setAddressType("Primary address");
		
		add[1]=new AddressInformation();
		add[1].setLandmark("LANDMARK2");
		add[1].setFlatno("L24");
		add[1].setStreetno("92");
		add[1].setLocation("Mumbai");
		add[1].setAddressType("secondary");
		
		
	
		Basicinformation Obj=new Basicinformation ();
		Obj.setFirstname("Vaishnav");
		Obj.setLastname("Madankar");
	    Obj.setDesignation("Manager");
	    Obj.setId("V010");
	    Obj.setAddress(add);
	    
	    Response res=
				given()
				.contentType(ContentType.JSON)
				.body(Obj)
				.when()
				.post("http://localhost:3000/Testing_Team");
	    
             System.out.println("Status code is "+res.statusCode());
		
		     System.out.println("Response data is");
		
		System.out.println(res.asString());
		
	}
	

}
