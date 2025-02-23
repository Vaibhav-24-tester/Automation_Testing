package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;



public class Logintest extends BaseTest {
	
	    @Test(dataProvider= "testdata")
        public void Login(String username , String password) {
	    	
	    	
	    	driver.findElement(By.id(loc.getProperty("sign_button"))).click();
        	driver.findElement(By.id(loc.getProperty("login_id"))).sendKeys(username);
        	driver.findElement(By.id(loc.getProperty("continue_button"))).click();
        	driver.findElement(By.id(loc.getProperty("login_password"))).sendKeys(password);
        	driver.findElement(By.id(loc.getProperty("login_button"))).click();
        }
	    
	    @DataProvider(name= "testdata")
	    public Object [][] tdata()
	    {
	    	return new Object [][]
	        {
	    		{"pawarvaibhav2424@gmail.com", "Kbd@24082000"},
	    		{"pawarvaibhav24@gmail.com", "Kbd@240820"},
	    		{"pawarvaibhav2424@gmail.com", "Kbd@242000"},
	    
	    		
	    	
	        };
	    	
	    }
	
	

}

