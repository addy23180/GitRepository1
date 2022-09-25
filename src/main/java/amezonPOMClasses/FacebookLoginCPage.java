package amezonPOMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginCPage {
	//Declaration
	//input[@placeholder='Email address or phone number']
	
	@FindBy(xpath="html/body/div/div/div/div/div/div/form/div/div/input")
	private WebElement un;
	//input[@placeholder='Password']
	@FindBy(xpath="html/body/div/div/div/div/div/div/form/div/div/div/div/input")
	private WebElement pwd;
	//button[@data-testid='royal_login_button']
	@FindBy(xpath="html/body/div/div/div/div/div/div/form/div/div/button")
	private WebElement loginbutton;
	
	WebDriver driver;
	
	//Initialization
	//using @finBy annotation of java
	public FacebookLoginCPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUsername() {
		un.sendKeys("9420391796");
	}
    public void setPwd() {
		pwd.sendKeys("advita2");
	}
    public void verifyLoginbutton() throws InterruptedException {
	    loginbutton.click();
	    //Thread.sleep(3000);
    }
	
}

