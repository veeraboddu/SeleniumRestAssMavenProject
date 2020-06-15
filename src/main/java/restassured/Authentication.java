package restassured;

import org.junit.Test;

import io.restassured.RestAssured;

public class Authentication {

	@Test
	public void basicauth() {
		
		int code = RestAssured.given()
				   .auth().preemptive()
				   .basic(" ", " ")
				   .when()
				   .get("")
				   .getStatusCode();
		System.out.println("Status code"+ code);
	}
}
