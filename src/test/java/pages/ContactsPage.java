package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import base.Basepage;
public class ContactsPage  extends Basepage{
    public ContactsPage(WebDriver driver) {
		super(driver);
		 this.driver = driver; 
}

		// TODO Auto-generated constructor stub
	WebDriver driver;
		// TODO Auto-generated constructor stub
		@FindBy(name="new")
	    WebElement newbtn;
		public void newbtn() {
			newbtn.click();
	    	
	    	}
		@FindBy(id="name_lastcon2")
	    WebElement LastName;
		
		
		public void LNContacts() {
			waitforElement(LastName);
			LastName.sendKeys("Shaurya");
	    	
	    	}	
		public void LNContacts33() {
			waitforElement(LastName);
			LastName.sendKeys("Indian");
	    	
	    	}	
		@FindBy(id="con4")
	    WebElement AccountName;
		
		public void AccName() {
			AccountName.sendKeys("Raje");
	    	
	    	}
		@FindBy(name="save")
		WebElement save ;
		public void save()
		{
			waitforElement(save);
			save.click();
		}
		@FindBy(name="save_new")
		WebElement SaveAndNew;
		public void saveandnew()
		{
			waitforElement(save);
			SaveAndNew.click();
		}
		
		@FindBy(linkText="Create New View")
	    WebElement NewView;
		
		public void Newview() {
			 NewView.click();
		}
		
		@FindBy(id="fname")
	    WebElement ViewName;
		
         public void viewName() {
        	 ViewName.sendKeys("ABCD");
}

         @FindBy(id="devname")
 	    WebElement ViewUniqueName;
         
         public void viewuniqueName() {
        	 ViewUniqueName.click();
         }
         public void viewuniqueenterName() {
        	 ViewUniqueName.clear();
        	 ViewUniqueName.sendKeys("EFGH");
         }
         @FindBy(id="hotlist_mode")
  	    WebElement viewDropdown2;
          
         public void viewdrop(String recent) {
    		 waitforElement(viewDropdown2);
    			SelectDropdown(viewDropdown2, recent);
    	 }
         @FindBy(linkText="Vish")
   	    WebElement Name;
          public void name() {
         	 Name.click();
          }
          @FindBy(linkText="Create New View")
     	    WebElement  CreateNewView;
         
          public void CreateNewView() {
        	  CreateNewView.click();
           }
          @FindBy(id="devname")
   	    WebElement ViewUniqueName1;
          
          public void uniqueNewView() { 
        	 waitforElement(ViewUniqueName1);
        	
        	  ViewUniqueName1.clear();
        	  ViewUniqueName1.sendKeys("Efg");
          }
          @FindBy(className="btn")
     	    WebElement cancle;
            
            public void cancle() { 
          	  cancle.click();
            }
          
          
}
