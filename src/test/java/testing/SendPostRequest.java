package testing;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

import javax.swing.text.AbstractDocument.Content;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPostRequest {

//	public static void main(String[] args) {
//		Response response = given().auth().basic("sk_test_51IyttiSHo1T0gh5oVKSC8Sexlqtn1YfModoleuGIzQJSh0vribJym7b7VPr808iyJQ41l16Mfew4BsHVC16NDHi900gPEZab3M", "").formParam("name", "shilpaaaa").formParam("email", "shilp@x.com").post("https://api.stripe.com/v1/customers");
//		response.prettyPrint();
//		String jsonresponse = response.asString();
//		System.out.println("jsonresponse ----->"+jsonresponse);
////		System.out.println("Satatus code ---> "+response.statusCode());
//	}
	public static void main(String[] args) {
		//String bodyJson = "{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}";
//		HashMap<String, String> hm = new HashMap<String, String>();
//		hm.put("email", "eve.holt@reqres.in");
//		hm.put("password", "pistol");
		System.out.println("./");
		Response response = given().contentType(ContentType.JSON).body(new File("F:\\javaSelenium1\\RestAssuredAPI\\src\\test\\java\\testing\\CreateUser.json")).post("http://localhost:8080/api/users");
		response.prettyPeek();
	}
}
