package pomActitimeClassesPF;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPgPF {
	//Declaration
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement un;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginbutton;
	
	WebDriver driver;
	
	//Initialization
	//using @finBy annotation of java
	public LoginPgPF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUsername() {
		un.sendKeys("admin");
	}
    public void setPwd() {
		pwd.sendKeys("manager");
	}
    public void verifyLoginbutton() throws InterruptedException {
	    loginbutton.click();
	    //Thread.sleep(3000);
    }
	
}

