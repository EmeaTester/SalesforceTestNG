package testcases;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Basepage;
import base.Basetest;
import log.Log;
import pages.Homepage;
import pages.LeadsPage;
import pages.Loginpage;
import utilities.PropertiesFile;
import utilities.ScreenshotUtility;
public class LeadTest extends Basetest {
	
	      Loginpage login;
	        Homepage home;
	        Basepage base;
	        LeadsPage Leads;
	        PropertiesFile prop;
	        ScreenshotUtility screen = new ScreenshotUtility();
	        WebDriver driver;
	        @BeforeMethod
		   
		    	public void beforeMethod() {
	        	
	        	 Basetest baseTest = new Basetest();
	             driver = baseTest.getDriver();
	             home = new Homepage(driver);
		   		Leads =new LeadsPage(driver);
		   		prop = new PropertiesFile();
		        String url = prop.getproperties("url");
		        driver.get(url);
		        login = new Loginpage(driver); 
		   	 driver.manage().window().maximize();
		   
		        DOMConfigurator.configure("log4j.xml");
		    }
	        
	       @Test
		    public void Leads() {
		    	String username = prop.getproperties("username");
		        login.enterintoUsername(username);
		        Log.info("Successfully entered the username"+username);
		        String password = prop.getproperties("password");
		        login.enterintoPassword(password);
		         login.clickLogin();
		       home.leads();
		        Log.info("Leads Testcase Passed");
	        }
	        @Test
		    public void Leads2() {
		    	String username = prop.getproperties("username");
		        login.enterintoUsername(username);
		        Log.info("Successfully entered the username"+username);
		        String password = prop.getproperties("password");
		         login.enterintoPassword(password);
		         login.clickLogin();
		         home.leads();
	        }
	        @Test
		    public void Defaultview() {
		    	String username = prop.getproperties("username");
		        login.enterintoUsername(username);
		        Log.info("Successfully entered the username"+username);
		        String password = prop.getproperties("password");
		         login.enterintoPassword(password);
		         login.clickLogin();
		         home.leads();
		         Leads.viewDropdown2("Today's Leads");
		         home.ClickonHome();
		         home.logoutofhome();
		         login.enterintoUsername(username); 
		         login.enterintoPassword(password);
		         login.clickLogin();
		         home.leads();
	        }
	        @Test
		    public void TodaysLeads()
		    { 
		    	String username = prop.getproperties("username");
		        login.enterintoUsername(username);
		        Log.info("Successfully entered the username"+username);
		        String password = prop.getproperties("password");
		         login.enterintoPassword(password);
		         login.clickLogin();
		         home.leads();
		         Leads.viewDropdown();	       
}
	        @Test
		    public void goTodayLeads() {
		    	String username = prop.getproperties("username");
		        login.enterintoUsername(username);
		        Log.info("Successfully entered the username"+username);
		        String password = prop.getproperties("password");
		         login.enterintoPassword(password);
		         login.clickLogin();
		         home.leads();
		         Leads.viewDropdown2("Today's Leads");
		         Leads.go();
		         
	        }
	        @Test
		    public void newLeads() {
		    	String username = prop.getproperties("username");
		        login.enterintoUsername(username);
		        Log.info("Successfully entered the username"+username);
		        String password = prop.getproperties("password");
		         login.enterintoPassword(password);
		         login.clickLogin();
		         home.leads();
		         Leads.newlead();
		         Leads.LN();
		         Leads.CN();
		         Leads.saveLead();
}
}
