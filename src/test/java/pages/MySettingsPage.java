package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.Basepage;
public class MySettingsPage extends Basepage  {

	public MySettingsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		    @FindBy(id = "PersonalInfo_font")
		    WebElement personalLink;
		    
		    public void personalLink() {
				// TODO Auto-generated method stub
				
		    	 personalLink.click();    	
			}


		    @FindBy(id = "LoginHistory_font")
		    WebElement loginHistoryLink;
		    
		    public void     loginHistoryLink() {
				// TODO Auto-generated method stub
		        loginHistoryLink.click();	
			}
		    
		    @FindBy(xpath="//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")
		    WebElement downloadLoginHistoryLink;
		    
		    public void      downloadLoginHistory() {
				// TODO Auto-generated method stub
		    	 downloadLoginHistoryLink.click();
			}
		    
		    @FindBy(xpath="//a[contains(@title, 'Download login history for last six months')]")
		    WebElement lastsixmonths;

		    public void   waitlastsixmonths() {
				// TODO Auto-generated method stub
		    	waitforElement(lastsixmonths);
			}
		    
		    
		    @FindBy(id="DisplayAndLayout_font")
		    WebElement  displayAndLayoutLink;
		    
		    public void   displayAndLayoutLink() {
				// TODO Auto-generated method stub
		    	displayAndLayoutLink.click();
			}
		    

		    @FindBy(id="CustomizeTabs_font")
		    WebElement customizeMyTabsLink;
		   
		    public void customizeMyTabsLink() { 
		    customizeMyTabsLink.click();
		    
	}
		    @FindBy(id="p4")
		    WebElement customAppDropDown;   
		    
		    public void selectcustomAppDropDown(String Salesforce)
		    {
		    	waitforElement(customAppDropDown);
		    	SelectDropdown(customAppDropDown, Salesforce );
		    }

		    @FindBy(xpath="//*[@id=\"duel_select_0\"]")
		    WebElement  availableTabsList ;
		   
		    public void  availableTabsList()
		    {
		    
		    availableTabsList.click();
}
		    @FindBy(xpath="//option[contains(text(),'Reports')]")
		    WebElement reports;
		    
		    public void  reports()
		    {
		    
		    	reports.click();
} 
		    
		    @FindBy(xpath="//*[@id=\"duel_select_0_right\"]/img")
		    WebElement  addButton;  
		    
		    public void  addButton()
		    {
		    	 addButton.click();
		    
} 
		    @FindBy(id="EmailSetup_font")
		    WebElement emailLink;	 
		    
		    public void  emailLink()
		    {
		    
		    emailLink.click(); 
}
		    @FindBy(id="EmailSettings_font")
		    WebElement myEmailSettingsLink;
		    
		    public void  myEmailSettingsLink()
		    {
		    
		    	myEmailSettingsLink.click();
}
		    
		    @FindBy(id="sender_name")
		    WebElement  emailNameField;
		    
		    public void  emailNameField()
		    {
		    
		    	 emailNameField.clear();
			     emailNameField.sendKeys("Raje");

}
		    @FindBy(id="sender_email")
		    WebElement  emailAddressField;	
		    
		    public void  emailAddress()
		    { 
		    emailAddressField.clear();
	        emailAddressField.sendKeys("rajeshwarivish12@gmail.com");
 
		    }
		    

		    @FindBy(id="auto_bcc1")
		    WebElement automaticBccRadioButton;
		    
		    public void  automaticBccRadioButton()
		    { 
		      
		    automaticBccRadioButton.click();
		    }
		    
		    @FindBy(xpath="//input[@title='Save']")
		    WebElement saveButton;
		   
		    public void  saveButton()
		    {  
		    saveButton.click();
		    
		    }
		    
		    @FindBy(linkText="Calendar & Reminders")
		    WebElement calendarAndRemindersLink; 
		  
		    public void  calendarAndReminders()
		    {  
		    calendarAndRemindersLink.click(); 
		    }
		    @FindBy(id="Reminders_font")
		    WebElement activityRemindersLink;
		    
		    public void  Remindersfont()
		    {  
		    	activityRemindersLink.click();
		    }
		    
		    @FindBy(id="testbtn")
		    WebElement  openTestReminderButton;
		    
		    public void openTestReminderButton()
		    {  
		    openTestReminderButton.click();
		    
}
}


