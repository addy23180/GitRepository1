package pomActitimeClassesPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPF {
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasks;
	
	
	private WebElement createTask ;
    WebDriver driver;//a[@class='content tasks']
    
    public TasksPF(WebDriver driver) {//div/img[@height='93']
    	
    	PageFactory.initElements(driver, this);
    }
    //span[text()='Create Tasks']
  //html/body/div/div/table/tbody/tr/td/a/div/img[@height='93']
  //div/div/div/span[text()='Create Tasks']
  //span[text()='All active projects of all active customers']
    public void setVerifyTasks() {
    	tasks.click();
    	//createTask.click();
    }
    public void setVerifyCreateTask() throws InterruptedException {
        createTask=driver.findElement(By.xpath("//div/div/div/span[text()='Create Tasks']"));
    	createTask.click();
    	Thread.sleep(3000);
    }

}
