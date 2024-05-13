package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.Basepage;

public class Loginpage extends Basepage {
    public Loginpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "Login")
    WebElement loginButton;
    
    @FindBy(id = "rememberUn")
    WebElement rememberUsernameCheckbox;
    
    @FindBy(linkText = "Forgot Your Password?")
    WebElement Forgotlink;
    
    @FindBy(xpath = "//input[@id='un']")
    WebElement userNameField;
   
    @FindBy(id = "continue")
    WebElement continueButton;
    
    
    public void enterintoUsername(String strusername) {
    	waitforElement(userName);
       
            userName.sendKeys(strusername);
        
    }

    public void enterintoPassword(String strpassword) {
       
            password.sendKeys(strpassword);
       
        
    }
    public void clear()
    {
    	password.clear();
    }

    public void clickLogin() {
        
            loginButton.click();
        
    }
    public void clickremembercheckbox() {
        
    	rememberUsernameCheckbox.click();
    
}

public void ForgotPassword() {
        
    	
	Forgotlink.click();
}
    

public void resetPassword(String username) {
	userNameField.sendKeys("raje@vish.com");
  
}
public void clickcontinue() {
    
	 continueButton.click();

}


}