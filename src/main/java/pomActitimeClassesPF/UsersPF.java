package pomActitimeClassesPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPF {
	@FindBy(xpath="//div[text()='Users']")
	private WebElement users;
	
	private WebElement newUser;
	 WebDriver driver;
	//table[@class='navTable']
    public UsersPF(WebDriver driver) {//div[@id='container_users']
    	PageFactory.initElements(driver, this);
    	
    }
  
    public void setUsers() {
    	users.click();
    }
    public void setNewUser() {
    	newUser=driver.findElement(By.xpath("//span[text()='User']"));
    	newUser.click();
    }

}
