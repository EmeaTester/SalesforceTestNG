package testcases;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Basepage;
import base.Basetest;
import log.Log;
import pages.Homepage;
import pages.Loginpage;
import utilities.PropertiesFile;
import utilities.ScreenshotUtility;

	public class Hometest extends Basetest {
	    Loginpage login;
        Homepage home;
        Basepage base;
        PropertiesFile prop;
        ScreenshotUtility screen = new ScreenshotUtility();
        WebDriver driver;
        @BeforeMethod
	   
	    	public void beforeMethod() {
        	
        	 Basetest baseTest = new Basetest();
             driver = baseTest.getDriver();
             home = new Homepage(driver);
	   		
	   		prop = new PropertiesFile();
	        String url = prop.getproperties("url");
	        driver.get(url);
	        login = new Loginpage(driver); 
	   
	        DOMConfigurator.configure("log4j.xml");
	    }

	   @Test
	    public void Login() {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickremembercheckbox();
	        login.clickLogin();
	        home.ClickonHome();
	        home.ClickonLogout();
	        Log.info("Successfully logout of the profile"+username);
	    
	   
	}
	    @Test
	    public void HomepageMenu() {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        home.ClickonHome();
	}
	    @Test
	    public void MyProfile() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	         login.clickLogin();
	        home.ClickonHome();
	        Thread.sleep(1000);	
	        home.MyProfile();
	        home.EditProfile();
	        home.SwitchtoFrame();
	        home.About();
	        home.lastName();
	        home.Saveall();
	        home.switchdefaultFrame();
	        home.Post();
	        Thread.sleep(2000);
	        home.SwitchtoiFrame();
	        home.postTextArea();
	       // home.switchToDefaultContent();
	        home.switchdefaultFrame();
	        home.share();
	        home.file();
	        home.upload();
	        home.chooseFile();
	        home.open();
	        home.Moderator();
	        home.update();
	        Thread.sleep(1000);
	        home.postIframe1();
	        home.chooseFile1();
	        home.save();
	        Thread.sleep(2000);
	        home.save2();
	        
	        
	            
	}
	    
	    @Test
	    public void Developerconsole() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	         login.clickLogin();
	        home.ClickonHome();
	        Thread.sleep(1000);	
	        home.developerConsoleLink();
	        home.switchingToNewwindow();
	        Thread.sleep(1000);
	        home.actiononDC();
	      
	    }
	      
	    @Test
	    public void Logout() {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	         login.clickLogin();
	        home.ClickonHome();
	        home.logoutofhome();
}
	}
	
	