package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties pro = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr; 
	public static FileReader fr1; 
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		if(driver== null) {
			FileReader fr= new FileReader("D:\\selenium\\workspace\\Framework\\src\\test\\resources\\configerFiles\\configer.properties");
			FileReader fr1= new FileReader("D:\\selenium\\workspace\\Framework\\src\\test\\resources\\configerFiles\\locator.properties");
			
			pro.load(fr);
		    loc.load(fr1);
		    
		}
		if (pro.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get(pro.getProperty("testURL"));
		}
		
		if (pro.getProperty("browser").equalsIgnoreCase("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(pro.getProperty("testURL"));
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}

}
