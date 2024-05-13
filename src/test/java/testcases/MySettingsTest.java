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
import pages.MySettingsPage;
import utilities.PropertiesFile;
import utilities.ScreenshotUtility;

public class MySettingsTest extends Basetest {
	Loginpage login;
    Homepage home;
    MySettingsPage MS;
    Basepage base;
    PropertiesFile prop;
    ScreenshotUtility screen = new ScreenshotUtility();
    WebDriver driver;
    @BeforeMethod
 
    	public void beforeMethod() { 	
    	 Basetest baseTest = new Basetest();
         driver = baseTest.getDriver();
         MS = new MySettingsPage(driver);
         home = new Homepage(driver);	
   		prop = new PropertiesFile();
        String url = prop.getproperties("url");
        driver.get(url);
        login = new Loginpage(driver); 
        DOMConfigurator.configure("log4j.xml");
    }
    @Test
    public void Mysettings() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
        login.enterintoPassword(password);
        login.clickLogin();
        home.ClickonHome();
        home.mySettings();
        //MS.displayAndLayoutLink();
        MS.personalLink();
        MS.loginHistoryLink();
        MS.downloadLoginHistory(); 
        MS.displayAndLayoutLink();
        MS.customizeMyTabsLink();
        String Salesforce = prop.getproperties("Salesforce");
        MS.selectcustomAppDropDown(Salesforce);
        MS.availableTabsList();
        MS.reports();
        MS.addButton();
        MS.emailLink();
        MS.myEmailSettingsLink();
        MS.emailNameField();
        MS.emailAddress();
        MS.automaticBccRadioButton();
        MS.saveButton();
        MS.calendarAndReminders();
        MS.Remindersfont();
        MS.openTestReminderButton();
        
    }
}

