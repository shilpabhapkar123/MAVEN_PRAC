package testing;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIJson {

	public static void main(String[] args) {
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("email", "sh@1.com");
		jsonobj.put("firstname", "shil1");
		jsonobj.put("lastName", "bhap2");
		
		JSONArray jsonarray = new JSONArray();
		jsonarray.put(87868,78687);
		jsonobj.put("mobile", jsonarray);
		
		JSONObject address = new JSONObject();
		address.put("flat", "d-342");
		address.put("city", "Pune");
		jsonobj.put("address", address);
		
		Response response = given().contentType(ContentType.JSON).body(jsonobj.toString()).log().all().post("http://localhost:8080/api/users");
		response.prettyPrint();
				
		
	}

}
