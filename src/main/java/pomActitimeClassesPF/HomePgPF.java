package pomActitimeClassesPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePgPF {
	//Declaration
	@FindBy(xpath="//img[@height='61']")
	private WebElement logo;
	
	@FindBy(xpath="//div/img[@height='93']")
	private WebElement timetrack;
	
	@FindBy(xpath="//input[@placeholder='Add task by name']")
	private WebElement addTask;
	
	WebDriver driver;
	
	//Initialization
	
	public HomePgPF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogo(){
		boolean result = logo.isDisplayed();
		if(result==true) {
			System.out.println("Test Scenario is Passed: " +result);
		}
		else {
			System.out.println("Test Scenario is Failed: " +result);
		}
	}
	public void setTimetrack() throws InterruptedException {
		timetrack.click();
	}
		public void setAddTask() throws InterruptedException {
		addTask.click();
		//Thread.sleep(3000);
	}

}
