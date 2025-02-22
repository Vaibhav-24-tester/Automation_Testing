package Test;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Soap_XMLRequest {
	@Test
	public void soapXML_Request() throws IOException {
		
		File file=new File("./SoapRequest/soap.xml");
		
		if (file.exists()) {
			System.out.println(" >>> file Exists");
		}
		
		FileInputStream fileinput = new FileInputStream(file);
		
		String request_body = IOUtils.toString(fileinput, "UTF-8");
		
		 baseURI="http://www.dneonline.com";
		 
		 given().
		     contentType("text/xml").
		     accept(ContentType.XML).
		     body(request_body).
		 when().
		     post("/calculator.asmx").
		 then().
		     statusCode(200).log().all();
		 
		
	}

}
