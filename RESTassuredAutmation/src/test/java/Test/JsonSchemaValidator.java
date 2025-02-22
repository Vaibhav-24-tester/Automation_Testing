package Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchemaValidator {
	@Test
	public void get_test() throws FileNotFoundException {
		

		
		baseURI="https://reqres.in/api";
			
		given().
		    get("/users?page=2").
		then().
		    assertThat().body(matchesJsonSchemaInClasspath("schema.json")).
		    statusCode(200).log().all();
////		    body("data[1].id",equalTo(8)).
////		    body("data[2].first_name",equalTo("Tobias"))./api/users?page=2
////		    body("data.first_name",hasItems("Michael","Lindsay","Byron"));
		
	}

}
