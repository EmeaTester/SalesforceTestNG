package base;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	WebDriver driver;
	public Basepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
}
	public void scroll() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,800)");
	}
	public void frames(WebElement element)
	{
	driver.switchTo().frame(element);
	}
	public void switchdefaultFrame()
	{ 
		driver.switchTo().defaultContent();
	}
	
	public void Acceptalert()
	{
		driver.switchTo().alert().accept();
	}
	
	public void mousehover(WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void SelectDropdown(WebElement element, String visibleText)
	{
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		System.out.println("selected"+visibleText);
	}
	
	
	public void switchingToParentWindow() {
	    String parentWindow = driver.getWindowHandle();
	    Set<String> handles = driver.getWindowHandles();
	    for (String windowHandle : handles) {
	        if (!windowHandle.equals(parentWindow)) {
	            driver.switchTo().window(windowHandle);
	            break;
	        }
	    }
	}
	
	 public void closeWindow()
	 
	{
		 String parentWindow = driver.getWindowHandle();
	        Set<String> Handles = driver.getWindowHandles();
	        for (String Windowhandles : Handles) {
	            if (!parentWindow.equals(Windowhandles)) {
	                driver.switchTo().window(Windowhandles).close();
	               
	            }
	            
	        }
	        driver.switchTo().window(parentWindow);
	}

	 public void switchingToNewwindow()
	 {
		 String mainWindow = driver.getWindowHandle();
	         for (String Window :  driver.getWindowHandles()) {
	            if (!Window.equals(mainWindow)) {
	                driver.switchTo().window(Window);
	                break;
	            }
	        }
	 }
	 public void switchToWindow(String windowHandle) {
	        driver.switchTo().window(windowHandle);
	    }

	
	 public String getParentWindowHandle() {
	        return driver.getWindowHandle();
	    }
	 
	
	
	 }
	 
	