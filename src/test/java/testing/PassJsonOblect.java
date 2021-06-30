package testing;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassJsonOblect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			User user = new User("a@g.com", "Shil3", "bhap3", "c21105", "Pune", "MAH");
			user.setMobileNumbers(43422,54353,54353);
			Response response = given().contentType(ContentType.JSON).body(user).log().all().post("http://localhost:8080/api/users");
			response.prettyPrint();
					
	}

}
