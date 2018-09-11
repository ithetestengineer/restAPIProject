package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

public class GetData {

	@Test
	public void testResponcecode() {
		Response resp = RestAssured.get("https://www.google.com/");
		int code = resp.getStatusCode(); //int code = get("").getStatusCode();
		System.out.println("Status code is" +code);
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testresponseBody() {
		
	
		Response resp = RestAssured.get("https://www.google.com/");
		String data = resp.asString();
		System.out.println(data);
		System.out.println("Response time" +resp.getTime());
	}
	
	/*@Test
	public void testResponseEdit() {
		int code = get("https://www.google.com/").getStatusCode();
		System.out.println("Status code is" +code);
		
	}*/
}
