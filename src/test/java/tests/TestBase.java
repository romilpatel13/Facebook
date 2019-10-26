package tests;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	 WebDriver driver = null;
	 
	 @BeforeSuite
	 public void initialize() throws IOException{
	 
		 
		 	ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications ");
			opt.addArguments("--disable-popup-blocking");
			opt.addArguments("--disable-save-password-bubble");
			
			opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			opt.setExperimentalOption("useAutomationExtension", false);
			//opt.addArguments("--disable-save-password-bubble");
			
		 
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver(opt); 
			
			
	 //To maximize browser
	        driver.manage().window().maximize();
	        
	        
	         //Implicit wait
	        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        	
	        	
	 //To open facebook
	                driver.get("https://www.facebook.com");
	                //driver.manage().deleteAllCookies();
	 
	 }
	 
	 @AfterSuite
	 //Test cleanup
	 public void TeardownTest()
	    {
	       driver.quit();
	    }
	
}
