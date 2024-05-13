package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import base.Basepage;
public class RandomScenarios<string> extends Basepage{
    public RandomScenarios(WebDriver driver) {
		super(driver);
		 this.driver = driver; 
}

		// TODO Auto-generated constructor stub
	WebDriver driver;
		// TODO Auto-generated constructor stub
		@FindBy(xpath="//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input")
	    WebElement CustomizeMyTabs;
		
		public void CustomizeMyTabs() {
			waitforElement(CustomizeMyTabs);
			CustomizeMyTabs.click();
	    	
	    	}
		@FindBy(xpath="//*[@id=\"ptBody\"]/div/div[2]/span[2]/a")
	    WebElement datelink;
		
		public void date() {
			waitforElement(datelink);
			datelink.click();
		}
		@FindBy(xpath="//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a")
	    WebElement eightpm;
		
		public void eightpm() {
		eightpm.click();
		}
		@FindBy(xpath="//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img")
	    WebElement subjectComboIcon;
		public void getTitle() {
			System.out.println("Title of the new Window :" +driver.getTitle());
		}
		
		public void subjectCombo() {
			waitforElement(subjectComboIcon);
			subjectComboIcon.click();
		}
		
		@FindBy(xpath="//*[@id=\"duel_select_1\"]/option[5]")
	    WebElement availableTab;
		public void availableTab() {
			
		System.out.println(availableTab.getText());
	    	}	
		@FindBy(className="leftArrowIcon")
	    WebElement	leftArrow;
		public void leftarrow() {
			waitforElement(leftArrow);
			leftArrow.click();
		}
		@FindBy(name="save")
	    WebElement	save;
		public void save() {
			waitforElement(save);
			save.click();
		}
		@FindBy(className="allTabsArrow")
	    WebElement	PlusTab1;
		
		public void plustab(){
			waitforElement(PlusTab1);
		PlusTab1.click();
		}
		@FindBy(linkText="Home")
	    WebElement	Home;
		public void home() {
		 Home.click();
		}
		@FindBy(xpath="//*[@id=\"duel_select_0\"]")
	    WebElement	viewDropdown2;
		public void seletviewdrop(String Subscriptions) {
			 waitforElement(viewDropdown2);
				SelectDropdown(viewDropdown2, "Subscriptions");
		}
			
		@FindBy(xpath="/html/body/div[2]/ul/li[5]/a")
	    WebElement	otherOption;
		
		public void scrolldowntoElement() {
			waitforElement(otherOption);
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", otherOption);
		        otherOption.click();
			
		}
		@FindBy(id = "EndDateTime_time")
		WebElement EndTime;
		public void endTime() {
			
		}
		@FindBy(id ="EndDateTime")
	    WebElement	EndcalenderTime;
		public void end() {
			waitforElement(EndTime);
		EndTime.clear();
		EndTime.click();
		}
		@FindBy(xpath="//*[@id=\"timePickerItem_42\"]")
	    WebElement ninepm;
		
		public void ninepm() {
			waitforElement(ninepm);
			ninepm.click();
			
			
		}
		public void endsevenpm() {
			waitforElement(EndTime);
		EndTime.clear();
		EndTime.sendKeys("7:00 PM");
		}
		@FindBy(id="IsRecurrence")
	    WebElement Recurrence;
		
		public void Recurrence() {
			Recurrence.click();
		}
		@FindBy(id="rectypeftw")
	    WebElement Weeklyradiobutton;

		public void Weeklyradiobutton() {
			
			waitforElement( Weeklyradiobutton);
			 Weeklyradiobutton.click();
		}
		
		@FindBy(id="EndDateTime")
	    WebElement RecurrenceEndDate;
		
		public void RecurrenceEndDate() {
			RecurrenceEndDate.clear();
			RecurrenceEndDate.sendKeys("5/15/2024");
			
		}
	
		@FindBy(name="save")
        WebElement saverecurence;

public void saverecurence() {
	saverecurence.click();
	
}
            @FindBy(xpath="//*[@id=\"bCalDiv\"]/div/div[2]/span[2]/a[3]/img")
            WebElement MonthView;
            public void  MonthView() {
            	MonthView.click();
            }

		@FindBy(xpath="//*[@id=\"topButtonRow\"]/input[1]")
        WebElement save1;

public void saveelement() {
	waitforElement(save);
	
	save1.click();
}
public void scrolldown() {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,650)", "");
	}

}
