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
	@Test()
	public void get_test() {
		
		
		
		baseURI = "https://www.amazon.com/NUU-T-Mobile-Teenagers-Octa-Core-Unlocked/dp/B0DLG4WKKG/ref=sr_1_1_sspa?dib=eyJ2IjoiMSJ9.qCekqtwqmD9aMXp-8qyrLeAxpPjxE-IFoJf1JRrPPl3b2BjwcL39HYDwQ1lCwAIXDQECuq9za39LcamwDwCTbaKa1cRUtzADedEWCj1DXMd0l9VyOP7OsS7R702ASn6U0J7gpfvLFwKJQPeNvsuiAqPWvii1dnh2YZ8pZcU-rS3cIGInaqfw-eo3UprZTteaSjQo3y3Zr3h0O9ZqZuvGaNEpUjeDrbBquNEzGDXP2MMnbavyMGNqg1PF-3h2GTTuAUuOQPbGulyCZ-__VfbunQsjj46g8aL6adqGnBt5pXM.HcEQvuu5_XUOltpO1rvvFTtU_Z7dVbaLnAVe7zshHfc&dib_tag=se&keywords=mobile&qid=1740286358&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1";
   
		given().
		    get("/NUU-T-Mobile-Teenagers-Octa-Core-Unlocked/dp/B0DLG4WKKG/ref=sr_1_1_sspa?dib=eyJ2IjoiMSJ9.qCekqtwqmD9aMXp-8qyrLeAxpPjxE-IFoJf1JRrPPl3b2BjwcL39HYDwQ1lCwAIXDQECuq9za39LcamwDwCTbaKa1cRUtzADedEWCj1DXMd0l9VyOP7OsS7R702ASn6U0J7gpfvLFwKJQPeNvsuiAqPWvii1dnh2YZ8pZcU-rS3cIGInaqfw-eo3UprZTteaSjQo3y3Zr3h0O9ZqZuvGaNEpUjeDrbBquNEzGDXP2MMnbavyMGNqg1PF-3h2GTTuAUuOQPbGulyCZ-__VfbunQsjj46g8aL6adqGnBt5pXM.HcEQvuu5_XUOltpO1rvvFTtU_Z7dVbaLnAVe7zshHfc&dib_tag=se&keywords=mobile&qid=1740286358&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1").
		then().
		    statusCode(200).log().all();
		
		
		
		
		
//		baseURI="https://reqres.in/api";
//			
//		given().
//		    get("/users?page=2").
//		then().
//		    statusCode(200).
//		    body("data[1].id",equalTo(8)).
//		    body("data[2].first_name",equalTo("Tobias")).
//		    body("data.first_name",hasItems("Michael","Lindsay","Byron"));
		

		

		
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
