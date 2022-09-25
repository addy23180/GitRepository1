package amezonPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBCreateStory {
	@FindBy(xpath="//div[@class='datstx6m ni8dbmo4 stjgntxs fi2e5rcv ebpj63zs flx89l3n sgqwj88q']")
	//@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement cs;
	
	
	WebDriver driver;
	
	public FBCreateStory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setCS() {
		cs.click();
		
	}

}
