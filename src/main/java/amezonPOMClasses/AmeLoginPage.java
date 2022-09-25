package amezonPOMClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmeLoginPage {
	//@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement un;
	
	//@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	@FindBy(xpath="//input[@aria-labelledby='continue-announce']")
	private WebElement cont;
	
	
	WebDriver driver;
	
	public AmeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUN() {
		un.sendKeys("9420391796");
		cont.click();
		
	}
	
}
