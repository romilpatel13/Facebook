package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FBHomePage;
import pages.FBLoginPage;

public class FbLoginTest extends TestBase{
  
	
	@Test
	 public void init() throws Exception{
	 
	//Login Page
	 FBLoginPage loginpage = PageFactory.initElements(driver, FBLoginPage.class);
	 loginpage.setEmail("romil.patel1@gmail.com");
	 loginpage.setPassword("Rvpb2107+-*");
	 loginpage.clickOnLoginButton();
	 
	 FBHomePage homepage = PageFactory.initElements(driver, FBHomePage.class);
	 homepage.verifyLoggedInUserNameText();
	 homepage.clickOnProfileDropdown();
	 homepage.clickOnLogoutLink(); 
	 }
	
}
