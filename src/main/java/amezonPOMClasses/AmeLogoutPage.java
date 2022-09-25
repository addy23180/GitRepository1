package amezonPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmeLogoutPage {
	
	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
	private WebElement all;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logout;
	
	WebDriver driver;
	
	public AmeLogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    //public void setSignin() {
	//	signin.click();
	//}

	public void setAll() {
		all.click();
	}
	
    public void setLogout() {
		logout.click();
	}  
	//input[@id='continue']
    public void setPWD() {
		
	}
}
