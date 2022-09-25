package pomActitimeClassesPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPF {
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;
	
	WebDriver driver;
	
	public LogoutPF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogout() {
	    	logout.click();
	    }

}
