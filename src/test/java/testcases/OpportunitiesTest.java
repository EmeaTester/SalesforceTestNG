package testcases;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Basepage;
import base.Basetest;
import log.Log;
import pages.Accountpage;
import pages.Homepage;
import pages.Loginpage;
import pages.OpportunitiesPage;
import utilities.PropertiesFile;
import utilities.ScreenshotUtility;

public class OpportunitiesTest extends Basetest {
	    Loginpage login;
        Homepage home;
        Basepage base;
        Accountpage Account;
        OpportunitiesPage Opp;
        PropertiesFile prop;
        ScreenshotUtility screen = new ScreenshotUtility();
        WebDriver driver;
        @BeforeMethod
	   
	    	public void beforeMethod() {
        	
        	 Basetest baseTest = new Basetest();
             driver = baseTest.getDriver();
             home = new Homepage(driver);
	   		Account = new Accountpage(driver);
	   		base=new Basepage(driver);
	   		prop = new PropertiesFile();
	        String url = prop.getproperties("url");
	        driver.get(url);
	        login = new Loginpage(driver); 
	        Opp =new  OpportunitiesPage(driver);
	        DOMConfigurator.configure("log4j.xml");
	    }

        @Test
	    public void Oppurtunities() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.account();
	        home.Opportunities();
	        Opp.OppDropdown();
	        Opp.OppDropdownpresent();
        }


        @Test
	    public void createnewOppurtunities() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.account();
	        home.Opportunities();
	        Opp.newbtn();
	        Opp.OppurtunityName();
	        Opp.accountName();
	        Opp.stage();
	        Opp.probability();
	        Opp.leadSource();
	        Opp.oopcalender();
	        Opp.oppsave();
	        
        }   
        
        @Test
	    public void Oppurtunitiespipeline() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.account();
	        home.Opportunities();  
	        Opp.opppipeline();
        }
        @Test
	    public void stuck_Oppurtunities() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.account();
	        home.Opportunities();  
	        Opp.stuckOpp();
        }
        @Test
	    public void OppurtunitiesReport() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.Opportunities();   
	        Opp.selectquarter("Current and Next FQ");
	        Opp.viewdrop("Open Opportunities");
	        Opp.lead();
        }
        @Test
	    public void Loginuser_34() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.ClickonHome();
	        Opp.nameLink();
        }
       @Test
	    public void verifyFNLN() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.ClickonHome();
	        home.MyProfile();
	        Opp.EditProfile();
	       Opp.editProfilePopup();
	       Opp.Abouttab();
	       Opp.LastName();
	       Opp.saveall();
	       base.switchdefaultFrame();
	       Opp.updatedName();
	       Opp.updatedLastName();
	       Opp.newname();
        }
}
