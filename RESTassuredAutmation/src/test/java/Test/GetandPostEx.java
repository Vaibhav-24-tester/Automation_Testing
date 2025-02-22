package Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class GetandPostEx {
	@Test(enabled = false)
	public void get_test() {
		baseURI="https://reqres.in/api";
			
		given().
		    get("/users?page=2").
		then().
		    statusCode(200).
		    body("data[1].id",equalTo(8)).
		    body("data[2].first_name",equalTo("Tobias")).
		    body("data.first_name",hasItems("Michael","Lindsay","Byron"));
		

		

		
	}
	@Test(enabled = false )
	public void post_test() {
		
		//Map<String, Object> map=new HashMap<String , Object >();
		
//		map.put("name", "vaibhav");
//		map.put("job", "Techer");
//		
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("name", "vaibhav");
		request.put("job", "Techer");
		
		
		System.out.println(request);
		
		baseURI ="https://reqres.in/api";
		
		given().
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		    body(request.toJSONString()).
		when().
		    post("/api/users").
		then().
		    statusCode(201);
		   
		
		
		
		
	}
	@Test
	public void Put() {
		
        JSONObject request = new JSONObject();
		
		request.put("name", "vaibhav");
		request.put("job", "Techer");
		
		
		System.out.println(request);
		
		baseURI ="https://reqres.in/api";
		
		given().
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		    body(request.toJSONString()).
		when().
		    put("/api/users/2").
		then().
		    statusCode(200);
		
		
	}
	@Test
	public void patch() {
		
        JSONObject request = new JSONObject();
		
		request.put("name", "vaibhav");
		request.put("job", "Techer");
		
		
		System.out.println(request);
		
		baseURI ="https://reqres.in/api";
		
		given().
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		    body(request.toJSONString()).
		when().
		    put("/api/users/2").
		then().
		    statusCode(200);
		
		
	}
	@Test
	public void Delete() {
    baseURI ="https://reqres.in/api";
		
		given().
		    delete("/api/users/2").
		then().
		    statusCode(204);
		
	}
	
	
	
}
