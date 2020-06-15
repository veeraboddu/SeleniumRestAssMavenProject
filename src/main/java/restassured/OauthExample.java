package restassured;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OauthExample {

	@Test
	public void Oauth() {

		Response resp = (Response) RestAssured.given().auth().oauth(" ", " ", " ", " ").post();
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody().jsonPath());
	}
}
