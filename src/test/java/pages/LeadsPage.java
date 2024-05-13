package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import base.Basepage;

public class LeadsPage extends Basepage{
	
	public LeadsPage(WebDriver driver) {
		super(driver);
		 this.driver = driver; 
	}
    WebDriver driver;
		// TODO Auto-generated constructor stub
		@FindBy(id="fcf")
	    WebElement viewDropdown2;
		public void viewDropdown2(String Today) {
			waitforElement(viewDropdown2);
	    	SelectDropdown (viewDropdown2, Today);
	    	
	    	}
		
		@FindBy(id="fcf")
	    WebElement viewDropdown;
		public void viewDropdown() {
			
			viewDropdown.click();
	    	}
		@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[1]/input")
	    WebElement go;
		public void go() {
			go.click();
		}
		@FindBy(name="new")
		WebElement newlead;
		public void newlead() {
			
			waitforElement(newlead);
			newlead.click();
		}
		@FindBy(id="name_lastlea2")
		
		WebElement lastname;
		public void LN() {
			waitforElement(lastname);
			lastname.sendKeys("Raji");
		}
		@FindBy(xpath="//*[@id=\"lea3\"]")
		WebElement companyname ;
		public void CN() {
			companyname.sendKeys("TechM");
		}
		@FindBy(name="save")
		WebElement save ;
		public void saveLead()
		{
			waitforElement(save);
			save.click();
		}
}


	

