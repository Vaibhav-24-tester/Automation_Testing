package Test;





import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class TestExample {
	@Test
	public void RestApi() {
		
		Response response=get("https://reqres.in/api/users/2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.body().asString());
		System.out.println(response.statusLine());
		System.out.println(response.header("content-type"));
		
		int Status_code =response.getStatusCode();
		
		Assert.assertEquals(Status_code, 200);
		
		
		
	}
	@Test
	public void Test2() {
		
		baseURI = "https://reqres.in/api";
		
		given()
		   .get("users/2")
		.then()
		   .statusCode(200)
		   .body("data[0]",equalTo(1));

		   
		  
		
		
		
	}

}
