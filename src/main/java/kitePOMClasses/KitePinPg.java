package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPg {
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement cont;
	
	WebDriver driver;
	
	public KitePinPg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setPIN(String PIN){
	    pin.sendKeys(PIN);
	    //Thread.sleep(3000);
    }
	public void setCont(){
	    cont.click();
	    //Thread.sleep(3000);
    }

}
