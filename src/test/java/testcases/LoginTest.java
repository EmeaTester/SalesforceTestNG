package testcases;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Basetest;

import log.Log;
import pages.Homepage;
import pages.Loginpage;
import utilities.PropertiesFile;
import utilities.ScreenshotUtility;

public class LoginTest extends Basetest {
    Loginpage login;
 Homepage home;
 WebDriver driver;
 PropertiesFile prop;
 ScreenshotUtility screen = new ScreenshotUtility();
 
    @BeforeMethod
    public void BeforeMethod() {
    	driver = getDriver();
    	prop = new PropertiesFile();
        String url = prop.getproperties("url");
		 driver.get(url);
        login = new Loginpage(driver); 
        DOMConfigurator.configure("log4j.xml");
    }

   @Test
    public void Login() {
	   Log.startTestCase("start Login Testcase");
	   String username = prop.getproperties("username");
	   Log.info("Successfully entered the username"+username);
	   login.enterintoUsername(username);
        login.clear();
        login.clickLogin();
        
    }
    @Test
    public void Login2() {
    	Log.startTestCase("start Login Testcase");
    	  String username = prop.getproperties("username");
    	  Log.info("Successfully entered the username"+username);
    	 login.enterintoUsername(username);
    	 String password = prop.getproperties("password");
    	 Log.warn("Please enter the correct password");
        login.enterintoPassword(password);
        login.clickLogin();
        driver.manage().window().maximize();
}
    @Test
    public void Testforgotpassword() {
        login.ForgotPassword();
        String username = prop.getproperties("username");
        login.resetPassword(username);
        login.clickcontinue();
}

@Test
public void WrongLogin() {
    login.enterintoUsername("123");
    login.enterintoPassword("22131");
    Log.warn("Please enter the correct password");
    login.clickLogin();
    Log.endTestCase("Invalid Testcases");
}
@AfterMethod
public void teardown() {
	screen.takescreenshot(driver);
	close();
	
}

  
}

