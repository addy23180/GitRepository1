package fkBandALocatorPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FKLoginPg {
	@FindBy(className="_2IX_2- VJZDxU")
	private WebElement un;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	//button/span[text()='Login']
	@FindBy(linkText="Login")
	private WebElement loginbutton;
	WebDriver driver;
	
	
	public FKLoginPg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUN(String UN) {
		un.sendKeys(UN);
	}
	public void setPWD(String PWD) {
		pwd.sendKeys(PWD);
	}
	public void setLButton() {
		loginbutton.click();
	}
	

}
