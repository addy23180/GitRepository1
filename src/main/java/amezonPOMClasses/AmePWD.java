package amezonPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmePWD {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	public AmePWD(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setPWD() {
		
		pwd.sendKeys("Addy23");
		signin.click();
	}

}
