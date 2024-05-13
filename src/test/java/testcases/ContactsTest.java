package testcases;
import org.apache.log4j.xml.DOMConfigurator;
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
import utilities.PropertiesFile;
import utilities.ScreenshotUtility;
public class ContactsTest extends Basetest{
 
	Loginpage login;
    Homepage home;
    Basepage base;
    LeadsPage Leads;
    ContactsPage contacts;
    PropertiesFile prop;
    ScreenshotUtility screen = new ScreenshotUtility();
    WebDriver driver;
    @BeforeMethod
   
    	public void beforeMethod() {
    	
    	 Basetest baseTest = new Basetest();
         driver = baseTest.getDriver();
         home = new Homepage(driver);
   		Leads =new LeadsPage(driver);
   		contacts=new ContactsPage(driver);
   		prop = new PropertiesFile();
        String url = prop.getproperties("url");
        driver.get(url);
        login = new Loginpage(driver); 
   	 driver.manage().window().maximize();
     Log.info("Maximize broser");
        DOMConfigurator.configure("log4j.xml");
    }
    
    @Test
    public void contacts() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         home.contacts();
         contacts.newbtn();
         contacts.LNContacts();
         contacts.AccName();
         contacts.save();
}
    @Test
    public void Newview() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         home.contacts();
         contacts.Newview();
         contacts.viewName();
         contacts.viewuniqueName();
         contacts.save();
    } 
    @Test
    public void Recently_created_contact_28() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         home.contacts();
         contacts.viewdrop("Recently Created");
    }
    @Test
    public void Name_29() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         home.contacts();
         contacts.name();
    }
    @Test
    public void Error_30() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         home.contacts();
         contacts.CreateNewView();
         contacts.uniqueNewView();
         contacts.save();
    }
    @Test
    public void cancleview_31() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         home.contacts();
         contacts.CreateNewView();
         contacts.viewName();
         contacts.viewuniqueenterName();
         contacts.cancle();
    }
    @Test
    public void cancleview_32() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         home.contacts();  
}
    @Test
    public void NewContactPageEdit_33() {
    	String username = prop.getproperties("username");
        login.enterintoUsername(username);
        Log.info("Successfully entered the username"+username);
        String password = prop.getproperties("password");
         login.enterintoPassword(password);
         login.clickLogin();
         home.contacts(); 
         contacts.newbtn();
         contacts.LNContacts33();
         contacts.AccName();
         contacts.saveandnew();
         
}
}
