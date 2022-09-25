package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteOrders {
	WebDriver driver;
	
	@FindBy(xpath="//div/div/div/div/div/a//span[text()='Orders']")
	private WebElement orders;
	
	@FindBy(xpath="//a/span[text()='Holdings']")
	private WebElement holdings;
	
	@FindBy(xpath="//a/span[text()='Positions']")
	private WebElement positions;
	
	@FindBy(xpath="//a/span[text()='Funds']")
	private WebElement funds;
	
	@FindBy(xpath="//a/span[text()='Apps']")
	private WebElement apps;
	
	public KiteOrders(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setOrders() {
		orders.click();
	}
	public void setHoldings() {
		holdings.click();
	}
	public void setPositions() {
		positions.click();
	}
	public void setFunds() {
		funds.click();
	}
	public void setApps() {
		apps.click();
	}

}
