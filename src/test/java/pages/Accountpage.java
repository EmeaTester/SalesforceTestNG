package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.Basepage;

public class Accountpage extends Basepage{

	public Accountpage(WebDriver driver) {
		super(driver);
		
		 this.driver = driver;
	}
	 WebDriver driver;
	 
	 @FindBy(linkText="Create New View")
			 WebElement NewView;
	 
	 public void NewView(){ 
		 NewView.click();
		    }
	 
	 @FindBy(id="fname")
	 WebElement viewname;
	 
	 public void viewName(){ 
		 viewname.sendKeys("Shauryaa");
		    }
	 
	 
	 @FindBy(id="devname")
	 WebElement viewuniquename;
	 
	 public void ViewUniqueName() { 
	 viewuniquename.click();
	 }
	 
	 @FindBy(name="save")
	 WebElement savebtnview;
	 
	 public void SaveView() { 
		 savebtnview.click();
		 }
		 
	 
	 @FindBy(css="input[name='new']")
	    WebElement newButton;
	  
	 public void newbtn(){ 
		 newButton.click();
		    }
	 @FindBy(id="acc2")
	    WebElement accountNameInput;
	 
	 public void AccountName(){
	 accountNameInput.sendKeys("Raje");
}
	 @FindBy(id="acc6")
	    WebElement typeDropdown;
	 
	 public void typeDropdown(){
	 typeDropdown.sendKeys("Technology Partner");
}
	 
	 @FindBy(id="00Nbm0000004vjX")
	    WebElement priorityDropdown;
	
	 public void priorityDropdown(){
	 
	 priorityDropdown.sendKeys("High");
}
	 
	 @FindBy(className="btn")
	    WebElement saveButton;
public void savebtn() {

saveButton.click();
}
@FindBy(xpath="//a[contains(text(),'Merge Accounts')]")
WebElement  mergeAccountsLink;

public void mergeAccountsLink() {

	mergeAccountsLink.click();
	
}
@FindBy(xpath="//*[@id=\"srch\"]")
WebElement accountNameInputfield;

public void accountName() {
	waitforElement(accountNameInputfield);

	accountNameInputfield.sendKeys("Raj");
}
  
@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]")

WebElement findAccountsButton;

public void  findAccounts(){

	  findAccountsButton.click();
}

@FindBy(name="goNext")
WebElement nextButton;
          
public void next() { 
	waitforElement(nextButton);
nextButton.click();

}
        
@FindBy(xpath="//input[@name=\"save\"]")
WebElement mergeButton;

public void merge() {
		
mergeButton.click();

}
@FindBy(xpath="//select[@id='fcf']")
WebElement  viewDropdown;

public void selectviewdrop(String Rajesh) 
{
	
	waitforElement(viewDropdown);
	SelectDropdown(viewDropdown, Rajesh);

}
@FindBy(linkText="Edit")
WebElement editViewLink;

public void editlink(){
editViewLink.click();
}
@FindBy(id="fname")
WebElement nameField;

public void name() {
	nameField.clear();
	 nameField.sendKeys("Rajesh");
}
@FindBy(xpath="//select[@id='fcol1']")
WebElement fieldDropdown;

public void selectfielddrop(String Account) {
	
	waitforElement(fieldDropdown);
	SelectDropdown(fieldDropdown, Account);

}
@FindBy(xpath="//select[@id='fop1']")
WebElement operatorDropdown;

public void operatorDrop(String contains) {
	
	waitforElement(operatorDropdown);
	SelectDropdown(operatorDropdown, contains);

}


@FindBy(id="fval1")
WebElement valueInput1;

public void value1() {
valueInput1.sendKeys("raj");
}

@FindBy(xpath="//select[@id='colselector_select_0']")
WebElement availableField;

public void availableFieldDrop(String Last) {
	
	waitforElement(availableField);
	
        Select selectAvailableField = new Select(availableField);
        selectAvailableField.selectByVisibleText("Last Activity");

}
@FindBy(xpath="//img[@title='Add']")
WebElement addButton;

public void add(){
	waitforElement(addButton);
	addButton.click();

}
@FindBy(className="btn")
WebElement  saveButton1;

public void saveview() {
saveButton1.click();
}
@FindBy(xpath="//h3[contains(text(),'Reports')]/..//a[contains(text(),'Accounts with last activity > 30 days')]")
WebElement reportsTab;

public void report() {
reportsTab.click();
}
@FindBy(id="ext-gen20")
WebElement dateFieldDropdown;


public void selectDateField(String fieldName) {
    
    dateFieldDropdown.click();
    List<WebElement> options = driver.findElements(By.xpath("//*[@id='ext-gen265']//div"));

    for (WebElement option : options) {
        if (option.getText().equals(fieldName)) {
            option.click();
            break;
        }
    }
}
@FindBy(id="ext-comp-1042")
WebElement fromDateInput;

public void fromDate() {
fromDateInput.sendKeys("4/28/2024");
}
@FindBy(id="ext-comp-1045")
WebElement toDateInput;

public void dateclear() {
toDateInput.clear();
}
@FindBy(id="ext-gen154")
WebElement toDateInput1;

public void toDateInput1() {
toDateInput1.click();
}

@FindBy(id="ext-comp-1045")
WebElement calender;

public void toDate() {
LocalDate today = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
String todayDate = today.format(formatter);
calender.sendKeys(todayDate);

}
@FindBy(id="ext-gen49")
WebElement calsaveButton;

public void Datesave() {
	waitforElement(calsaveButton);
	calsaveButton.click();
}
@FindBy(id="saveReportDlg_reportNameField")
WebElement reportNameInput;

public void reportNameInput() {
reportNameInput.sendKeys("Todayreport23");
}
@FindBy(id="saveReportDlg_DeveloperName")
WebElement uniqueNameInput;

public void uniqueNameInput() {
	waitforElement(uniqueNameInput);
uniqueNameInput.click();
}
@FindBy(xpath="//table[@id='dlgSaveAndRun']/tbody/tr[2]/td[2]")
WebElement saveAndRunButton;

public void saveAndRun() {
	
saveAndRunButton.click();

}

}

