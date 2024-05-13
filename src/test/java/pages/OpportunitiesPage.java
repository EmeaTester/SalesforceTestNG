package pages;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Basepage;
public class OpportunitiesPage extends Basepage {

	public OpportunitiesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	 WebDriver driver;
	 
	 @FindBy(id="fcf")
	 WebElement  opportunitiesDropdown;
	 
	 public void OppDropdown() {
		
	 opportunitiesDropdown.click();
}
	 public void OppDropdownpresent() {
		 waitforElement(opportunitiesDropdown);
	 if (opportunitiesDropdown.isDisplayed()) {
         System.out.println("Opportunities dropdown is present.");
     } else {
         System.out.println("Opportunities dropdown is not present.");
     }
}
	 
	 @FindBy(xpath="//input[@name='new']")
	 WebElement newButton;
	 
	 public void newbtn() {
	 newButton.click();
}
	 @FindBy(id="opp3")
	 WebElement OppurtunityName; 
	 
	 public void OppurtunityName() {
	 OppurtunityName.sendKeys("NewOppty");
	 
}
	 @FindBy(id="opp4")
	 WebElement accountNameField;
	 
	 public void accountName() {
	 accountNameField.sendKeys("Raje");
	 
	 }
	 
	 @FindBy(id="opp11")
	 WebElement stageField;
	 
	 public void stage() {
	 stageField.sendKeys("Prospecting");
	  
	 }
	 
	 @FindBy(id="opp12")
	 WebElement  probabilityField;
	 
	 public void probability() {
	 probabilityField.sendKeys("0");  
}
	 @FindBy(id="opp6")
	 WebElement  leadSourceField;
	 
	 public void leadSource() {
		 waitforElement(leadSourceField);
	 leadSourceField.sendKeys("Web");
	 }
	 
	 @FindBy(id="opp9")
	 WebElement  calender;
	 
	 public void oopcalender() {
		 LocalDate today = LocalDate.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        String todayDate = today.format(formatter);
	        calender.sendKeys(todayDate);
	 }
	 
	 @FindBy(xpath="//td[@id='topButtonRow']//input[@name='save']")
	 WebElement  oppsaveButton; 
	 
	 public void oppsave() { 
	 oppsaveButton.click();
	 
	 }
	 @FindBy(linkText="Opportunity Pipeline")
	 WebElement   Pipeline;
	 
	 public void opppipeline()
	 {
		 Pipeline.click();
	 }
	
	 

	 @FindBy(linkText="Stuck Opportunities")
	 WebElement Stuck_Opportunities;
	 
	 public void stuckOpp() {
		 Stuck_Opportunities.click();
	 }
	 
	 @FindBy(id="quarter_q")
	 WebElement quarter;
	 
	 public void selectquarter(String current) {
		 waitforElement(quarter);
			SelectDropdown(quarter, current);
	 }
	 @FindBy(id="open")
	 WebElement  openOp;
	 
	 public void viewdrop(String Opp) {
		 waitforElement(openOp);
			SelectDropdown(openOp, Opp);
	 }
	 
	 @FindBy(xpath="//*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input")
	 WebElement lead_summary;
	 
	 public void lead()
	 {
		 lead_summary.click();
	 }
	 @FindBy(xpath="//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
	 WebElement  EditProfile;
	 
	 public void EditProfile()
	 {
		 EditProfile.click();
	 }
	 @FindBy(xpath="//iframe[contains(@id, 'contactInfoContentId')]")
	 WebElement  editProfilePopup;
	 public void editProfilePopup() {
		 driver.switchTo().frame(editProfilePopup);
	 }
	 @FindBy(xpath="//*[@id=\"aboutTab\"]/a")
	 WebElement Abouttab;
	 
	 public void Abouttab()
	 {
		 Abouttab.click();
	 }
	 @FindBy(id="lastName")
	 WebElement lastNameInput;
	 public void LastName()
	 {
		 lastNameInput.clear();
	        lastNameInput.sendKeys("Sahasra");
	 }
	 @FindBy(xpath="//input[@value='Save All']")
	 WebElement saveAllButton;
	 
	 public void saveall()
	 {
		 saveAllButton.click();
	 }
	 
	 @FindBy(linkText="Rajeshwari Sahasra")
	 WebElement updatedNameElement;
	 
	 public void nameLink() {
		 String accountHolderName = updatedNameElement.getText();
	        System.out.println("Account Holder Name: " + accountHolderName);

	        updatedNameElement.click();
	 }
	 
	 public void updatedName() {
	 String updatedName = updatedNameElement.getText();
     System.out.println("Updated Name: " + updatedName);
     
     String myStr = updatedName;
     System.out.println(myStr.contains("Sahasra"));   // true
     
}
	 @FindBy(className="menuButtonLabel")
	  WebElement userMenuButton;
	  public void updatedLastName() {
		  String userMenuButtonText = userMenuButton.getText();
	        System.out.println("User Menu Button Text: " + userMenuButtonText);

	  }
	  @FindBy(id="tailBreadcrumbNode") 
	  WebElement userProfilePage;
	  
	  public void newname() {
		  String userProfilePageText = userProfilePage.getText();
	        System.out.println("User Profile Page Text: " + userProfilePageText);
	  }
}
	 
	 
	 
