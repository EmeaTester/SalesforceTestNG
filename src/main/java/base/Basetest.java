package base;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
    protected WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
public void Takescreenshot(WebDriver driver)
{
	TakesScreenshot screenshot= ((TakesScreenshot) driver);
	File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
	String filepath="C:\\Workspace\\SalesForceTestNGFramework\\Screenshots\\salesforce.jpeg";
	File destfile=new File(filepath);
	try {
		FileUtils.copyFile(srcFile, destfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	public void close() {
		driver.close();
		driver =null;
    }
}

