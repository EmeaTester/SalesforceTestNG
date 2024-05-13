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
import utilities.PropertiesFile;
import utilities.ScreenshotUtility;

public class AccountTest extends Basetest {
	    Loginpage login;
        Homepage home;
        Basepage base;
        Accountpage Account;
        PropertiesFile prop;
        ScreenshotUtility screen = new ScreenshotUtility();
        WebDriver driver;
        @BeforeMethod
	   
	    	public void beforeMethod() {
        	
        	 Basetest baseTest = new Basetest();
             driver = baseTest.getDriver();
             home = new Homepage(driver);
	   		Account = new Accountpage(driver);
	   		prop = new PropertiesFile();
	        String url = prop.getproperties("url");
	        driver.get(url);
	        login = new Loginpage(driver); 
	        DOMConfigurator.configure("log4j.xml");
	    }

       @Test
	    public void Account() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        Log.info("Log in to Home");
	        home.account();
	        Thread.sleep(1000);
	        Account.newbtn();
	        Account.AccountName();
	        Account.typeDropdown();
	        Account.priorityDropdown();
	        Account.savebtn();
	        Log.endTestCase("Testcase 11:Account passed");
	    
        }

        @Test
	    public void AccountView() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        Log.info("Log in to Home");
	        home.account();
	        Thread.sleep(1000);
	        Account.NewView();
	        Account.viewName();
	        Account.ViewUniqueName();
	        Account.SaveView();
        }
        
        @Test
	    public void AccountMerge() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        Log.info("Log in to Home");
	        home.account();
	        Account.mergeAccountsLink();
	        Account.accountName();
	        Account.findAccounts();
	        Account.next();
	        Account.merge();
	        Account.Acceptalert();
        
}
        @Test
	    public void AccountViewEdit() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.account();
	        Account.selectviewdrop("Rajesh");
	        Account.editlink();
	        Account.name();
	        Account.scroll();
	        Account.selectfielddrop("Account Name");
	        Account.operatorDrop("contains");
	        Account.value1();
	      
	        Account.availableFieldDrop("Last Activity");
	        Account.add();
	       
	        Account.scroll();
	        Account.saveview();
        
}
      
        @Test
	    public void Accountreport() throws InterruptedException {
	    	String username = prop.getproperties("username");
	        login.enterintoUsername(username);
	        Log.info("Successfully entered the username"+username);
	        String password = prop.getproperties("password");
	        login.enterintoPassword(password);
	        login.clickLogin();
	        driver.manage().window().maximize();
	        Log.info("Log in to Home");
	        home.account();
            Account.report();
            Account.selectDateField("Created Date");
            Account.fromDate();
            Account.dateclear();
            Account.toDateInput1();
            Account.Datesave();
            Account.reportNameInput();
            Account.uniqueNameInput();
            Thread.sleep(2000);
            Account.saveAndRun();
            Log.info("Accountreport testcase passed");
        }
              
        
}