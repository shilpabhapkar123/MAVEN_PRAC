package testing;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
//io.restassured.matcher.RestAssuredMatchers.*
//org.hamcrest.Matchers.*
public class SendGetRequest {
/*
 * Set auth: Basic auth and bearer tokrn auth
 * send req-> resp-> validate
 * req-> 
 * 
 */
//	public static void main(String[] args) {
//	
//	Response response = given().param("limit", 2).auth().basic("sk_test_51IyttiSHo1T0gh5oVKSC8Sexlqtn1YfModoleuGIzQJSh0vribJym7b7VPr808iyJQ41l16Mfew4BsHVC16NDHi900gPEZab3M", "").get("https://api.stripe.com/v1/customers");
//	//response.prettyPrint();
//	String jsonresponse = response.asString();
//	System.out.println("jsonresponse ----->"+jsonresponse);
//	System.out.println("Satatus code ---> "+response.statusCode());
//	
//				
//	}
	public static void main(String[] args) {
		Response response =	given().headers("Authorization", "Bearer sk_test_51IyttiSHo1T0gh5oVKSC8Sexlqtn1YfModoleuGIzQJSh0vribJym7b7VPr808iyJQ41l16Mfew4BsHVC16NDHi900gPEZab3M").get("https://api.stripe.com/v1/customers/cus_JcgJoxdTz1nWQ7");
		response.prettyPrint();
	}

}
