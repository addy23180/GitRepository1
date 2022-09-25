package pomActitimeClassesPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkSchedulePF {
	@FindBy(xpath="//div[text()='Work Schedule']")
	 private WebElement workschedule;
	 
		 private WebElement select;
		 
		     WebDriver driver;
		    
		    public WorkSchedulePF(WebDriver driver) {//div[@id='container_users']
		    	PageFactory.initElements(driver, this);
		    	
		    	
		    }//a[@class='logout']
		  
		    public void setWorkschedule() {
		    	workschedule.click();
		    }
		    public void setSelect() {
		    	select=driver.findElement(By.xpath("//span[text()='Select the Number of Months to View']"));
		    	select.click();
		    }
		   
}
