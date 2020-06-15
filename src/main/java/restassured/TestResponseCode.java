package restassured;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestResponseCode {
	
	@Test
	public void testrespCode() {
		
		Response resp = RestAssured.get("https://www.google.com/");
		
		int code = resp.getStatusCode();
		System.out.println("Response code :"+code);
		Assert.assertEquals(code, 200);
	}

}
