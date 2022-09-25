package amezonPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogoutPage {
	@FindBy(xpath="//div/div[@class='i09qtzwb n7fi1qx3 b5wmifdl hzruof5a pmk7jnqg j9ispegn kr520xx4 c5ndavph art1omkt ot9fgl3s rnr61an3 s45kfl79 emlxlaya bkmhp75w spb7xbtv']")
	private WebElement all;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	WebDriver driver;
	
	public FBLogoutPage(WebDriver driver) {
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
   

}
