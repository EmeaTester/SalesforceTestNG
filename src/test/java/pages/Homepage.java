package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.Basepage;

public class Homepage extends Basepage {
	

	    public Homepage(WebDriver driver) {
		super(driver);
		 this.driver = driver; 
		// TODO Auto-generated constructor stub
	}
	    
	
		@FindBy(linkText="Leads")
	    WebElement Leads;	
		public void leads() {
			Leads.click();
			
			
		}
		@FindBy(className="allTabsArrow")
	    WebElement PlusTab;
		
		public void PlusTab() {
			PlusTab.click();
			
			
		}
		
		@FindBy(linkText="Contacts")
	    WebElement Contacts;
		
		public void contacts() {
	      Contacts.click();
		}
	    @FindBy(id = "userNavLabel")
	    WebElement userDropdown;
	    
	    @FindBy(linkText = "Logout")
	    WebElement logoutLink;
	    
	    
	    @FindBy(xpath="//a[contains(text(),'My Profile')]")
	    WebElement myProfileOption;
	    
	    @FindBy(xpath="//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
	    WebElement editProfileButton;
	    
	    @FindBy(linkText="About")
	    WebElement aboutTab;
	

	    @FindBy(id="contactInfoContentId")
	    WebElement Frame;
	    
	    @FindBy(id="lastName")
	    WebElement lastNameField;
	    
	    @FindBy(xpath="//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")
	    WebElement saveAllButton;
	    
	    @FindBy(linkText="Post")
	    WebElement postLink; 
	    
	    @FindBy(xpath="//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	    WebElement postIframe;
	    
	    @FindBy(xpath="/html/body")
	    WebElement postTextArea;
	    
	    @FindBy(id="publishersharebutton")
	    WebElement shareButton;
	    
	    @FindBy(xpath="//span[text()='File']")
	    WebElement fileLink;
	    
	    @FindBy(xpath="//a[text()='Upload a file from your computer']")
	    WebElement uploadButton;
	    
	    @FindBy(xpath="//input[@id='chatterFile']")
	    WebElement chooseFileButton;
	    
	    @FindBy(xpath="//input[@id='publishersharebutton']")
	    WebElement openButton;

	    @FindBy(id="displayBadge")
	    WebElement Moderator;
	   
	    @FindBy(id="uploadLink")
	    WebElement Update;
	    
	    @FindBy(id="uploadPhotoContentId")
	    WebElement postIframe1;
	    
	    @FindBy(xpath="//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]")
	    WebElement chooseFileButton1;
	    
	    @FindBy(id="j_id0:uploadFileForm:uploadBtn")
	    WebElement save;
	    
	    
	    @FindBy(id="j_id0:j_id7:save")
	    WebElement save2;
	    
	    @FindBy(linkText="My Settings")
	    WebElement mySettingsOption;
	    
	    @FindBy(xpath="//a[contains(text(),'Developer Console')]")
	    WebElement developerConsoleLink;
	    
	    public void developerConsoleLink() {
	    developerConsoleLink.click();
	    }
	   
	    @FindBy(linkText="Logout")
	    WebElement logoutofHome;
	    

	    @FindBy(linkText="Accounts")
	    WebElement Account;
	 
	    @FindBy(linkText="Opportunities")
	    WebElement opportunitiesLink;
	    
	    
	    public void Opportunities() {
	    	opportunitiesLink.click();
	    }
	    
	    public void account(){
	    	waitforElement(Account);
	    Account.click();
	    }
	    public void logoutofhome(){ 
	    logoutLink.click();
	    }
	    WebDriver driver;
	    
	    public void actiononDC()
	    {
	    	String Title = driver.getTitle();
	    	System.out.println("Title of new Window is " +Title);
	    	driver.close();
	    }
	    
	    public void mySettings() {
			// TODO Auto-generated method stub
	    	mySettingsOption.click();
	    	
		}
	    
	    public void ClickonHome() {
		// TODO Auto-generated method stub
		
		userDropdown.click();
    	
	}
	   
	public void MyProfile() {
		// TODO Auto-generated method stub
		
		myProfileOption.click();
    	
	}
	public void EditProfile() {
		// TODO Auto-generated method stub
		
		 editProfileButton.click();
		 
    	
	}
	public void SwitchtoFrame() {
	
		driver.switchTo().frame(Frame);
    	
	}
	

	public void About() {
		// TODO Auto-generated method stub
		
		aboutTab.click();
    	
	}
	 public void lastName() {
			// TODO Auto-generated method stub
		 lastNameField.clear();
		  lastNameField.sendKeys("Sahasra");
	    	
	}
	 
	    public void Saveall() {
		// TODO Auto-generated method stub
		
	    	saveAllButton.click();
	    	
 	
	}
	  //  public void switchToDefaultContent() {
	        
		//	driver.switchTo().defaultContent();
	  //  }
	    
 public void Post() {
	        
	 postLink.click();
	    }
	   
 
 public void SwitchtoiFrame() {
		
	 driver.switchTo().frame(postIframe); 
		
	}
 public void  postTextArea() {
	 postTextArea.sendKeys("Hello");
	    }
	   
 public void share() {
     
	 shareButton.click();
	    }
 
 public void file() {
     
	 fileLink.click();
	    }
 
public void upload() {
	
	uploadButton.click();
	
	    }
public void chooseFile() {
	
	  chooseFileButton.sendKeys("C:\\input.txt.txt");
	
	    }

public void open() {
	
	openButton.click();
	    }
public void Moderator() {
	
	Actions action = new Actions(driver);
    action.moveToElement(Moderator).perform();
    
	    }

public void update() {
	// TODO Auto-generated method stub
	
	Update.click(); 
	
}
public void postIframe1() {

	driver.switchTo().frame(postIframe1);
}

public void  chooseFile1() {
	 chooseFileButton1.sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\flower.jpg");
	    }

public void save() {
	// TODO Auto-generated method stub
	
	save.click();
	
}

public void save2() {
	// TODO Auto-generated method stub
	
	save2.click();
	
}


	public void ClickonLogout() {
		// TODO Auto-generated method stub
		
		logoutLink.click();
    	
	}
	
	
	}
	

