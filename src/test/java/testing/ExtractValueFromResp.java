package testing;

import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.core.JsonpCharacterEscapes;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class ExtractValueFromResp {

	public static void main(String[] args) {
		Response response = given().auth().basic("sk_test_51IyttiSHo1T0gh5oVKSC8Sexlqtn1YfModoleuGIzQJSh0vribJym7b7VPr808iyJQ41l16Mfew4BsHVC16NDHi900gPEZab3M", "").formParam("name", "Rahul").formParam("email", "Rahul@d.com").post("https://api.stripe.com/v1/customers");
		response.prettyPrint();
		JsonPath json = response.jsonPath();
		System.out.println(json.get("id"));
		//System.out.println(json.getList("preffered_locales").size());
	}

}
