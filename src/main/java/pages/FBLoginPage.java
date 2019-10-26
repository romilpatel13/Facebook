package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;

public class FBLoginPage {

	 WebDriver driver;
	 
     public void FbLoginPage(WebDriver driver){ 
              this.driver=driver; 
     }

	//Using FindBy for locating elements
	@FindBy(xpath="//input[@id='email']")
	WebElement emailTextBox;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	WebElement signinButton;

     

     // This method is to set Email in the email text box
		public void setEmail(String strEmail){
		emailTextBox.sendKeys(strEmail);
		}
		// This method is to set Password in the password text box
		public void setPassword(String strPassword){
		passwordTextBox.sendKeys(strPassword);
		}
		// This method is to click on Login Button
		public void clickOnLoginButton(){
		signinButton.click();
} 
}
