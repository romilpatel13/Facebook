package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;

public class FBHomePage {

	WebDriver driver;

    public void FbHomePage(WebDriver driver){ 
            this.driver=driver; 
    }

    //Using FindBy for locating elements
    @FindBy(xpath="//div[contains(text(),'Romil Patel')]")
    WebElement loggedInUserNameText;

    
    @FindBy(xpath="//div[text()='Account Settings']")
    WebElement profileDropdown;
    
    @FindBy(xpath="//span[contains(text(),'Log Out')]")
    WebElement logoutLink;
    
   
    

    
 // This method to verify LoggedIn Username Text
    public String verifyLoggedInUserNameText(){
    	String userName = loggedInUserNameText.getText();
    	System.out.println("Name of person: "+ loggedInUserNameText.getText());
    	return userName;
    	
    }

    // This method to click on Profile Dropdown
	public void clickOnProfileDropdown(){
		profileDropdown.click();
	}
	
	// This method to click on Logout link
	public void clickOnLogoutLink(){
		logoutLink.click();
	}


}
