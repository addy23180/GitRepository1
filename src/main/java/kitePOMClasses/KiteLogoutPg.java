package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogoutPg {
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='user-id']")
	private WebElement opt;
	
	@FindBy(xpath="//a[@href='/logout']")
	private WebElement logout;
	
	public KiteLogoutPg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setOptions() {
		opt.click();
	}
	public void setLogout() {
		logout.click();
	}

}
