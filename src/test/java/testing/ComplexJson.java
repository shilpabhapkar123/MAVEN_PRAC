package testing;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.AbstractDocument.Content;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ComplexJson {

	public static void main(String[] args) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<String, Object> hm_address = new HashMap<String, Object>();
		hm.put("email", "sh@1.com");
		hm.put("firstname", "shil1");
		hm.put("lastName", "bhap2");
		list.add(43243,543543);
		hm.put("mobile", list);
		hm_address.put("flat", "d-342");
		hm_address.put("city", "Pune");
		hm.put("address", hm_address);
	}

}
