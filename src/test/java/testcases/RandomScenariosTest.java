package testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Basepage;
import base.Basetest;
import log.Log;
import pages.ContactsPage;
import pages.Homepage;
import pages.LeadsPage;
import pages.Loginpage;
import pages.RandomScenarios;
import utilities.PropertiesFile;
import utilities.ScreenshotUtility;

public class RandomScenariosTest {
	Loginpage login;
    Homepage home;
    Basepage base;
    LeadsPage Leads;
    ContactsPage contacts;
    RandomScenarios random;
    PropertiesFile prop;
    ScreenshotUtility screen = new ScreenshotUtility();
    WebDriver driver;
    @BeforeMethod
   
    	public void beforeMethod() {
    	
    	 Basetest baseTest = new Basetest();
         driver = baseTest.getDriver();
         home = new Homepage(driver);
   		Leads =new LeadsPage(driver);
   		base=new Basepage(driver);
   		contacts=new ContactsPage(driver);
   		random =new RandomScenarios(driver);
   		prop = new PropertiesFile();
        String url = prop.getproperties("url");
        driver.get(url);
        login = new Loginpage(driver); 
   	 driver.manage().window().maximize();
     Log.info("Maximize broser");
        DOMConfigurator.configure("log4j.xml");
    }
    
    @Test
    public void randomscenarios() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         random.plustab();
         random.CustomizeMyTabs();
         random.availableTab();
         random.leftarrow();
         random.save();
         home.ClickonHome();
         home.logoutofhome();
         login.enterintoUsername(username);
         login.enterintoPassword(password);
         login.clickLogin();
         random.plustab();
         random.CustomizeMyTabs();
         random.seletviewdrop("Subscriptions");
    }
    @Test
    public void event_calender()  {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         random.home();
         random.date();
         random.scrolldown();
         random.eightpm();
         random.subjectCombo();
        random.switchingToNewwindow();
         random.scrolldowntoElement();
         base.switchingToParentWindow();
         random.end();
         random.ninepm();
         random.saveelement();
         
     }
    @Test
    public void weekly_recurrance()  {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         random.home();
         random.date();
         random.scrolldown();
         random.eightpm();
         random.subjectCombo();
         // Switch to the new window
         String mainWindowHandle = base.getParentWindowHandle();
         base.switchingToNewwindow();
         random.scrolldowntoElement();
         // Perform actions in the new window
         base.switchToWindow(mainWindowHandle); // Switch back to the main window
         random.endsevenpm();
         random.Recurrence();
         random.Weeklyradiobutton();
         random.RecurrenceEndDate();
         random.saverecurence();
         random.MonthView();
         
     }
         
    }        

