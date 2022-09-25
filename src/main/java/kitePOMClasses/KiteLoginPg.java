package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLoginPg {
	//Declaration
	/*	//input[@placeholder='Email address or phone number']
	
	//input[@placeholder='User ID (eg: AB0001)']
		@FindBy(xpath="//input[@id='userid']")
		private WebElement un;
		
		
		@FindBy(xpath="//input[@placeholder='Password']")
		private WebElement pwd;
		
		@FindBy(xpath="//button[@class='button-orange wide']")
		private WebElement loginbutton;
		
		*/
		
		@FindBy(id="userid")
		private WebElement un;
		@FindBy(id="password")
		private WebElement pwd;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement loginbutton;
		
		WebDriver driver;
		
		//Initialization
		//using @finBy annotation of java
		public KiteLoginPg(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//public String getUserName() {
			//String actucalUserName = un.getText();
			//return actucalUserName;
		//}
		public void setUsername(String UN) {
			//String un = null;
			un.sendKeys(UN);
		}
	    public void setPwd(String PWD) {
			pwd.sendKeys(PWD);
		}
	    public void verifyLoginbutton()  {
		    loginbutton.click();
		    //Thread.sleep(3000);
	    }
	    
}
