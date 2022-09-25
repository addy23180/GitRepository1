package pomActitimeClassesPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPF {
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement reports;
	
	
	private WebElement newreport;
	WebDriver driver;
	
	public ReportsPF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//div[@id='container_reports']
	//button[@class='components-Buttons-button--2ZtATn8v components-Buttons-default--2AuE4tKC components-NewReportPanel-newReportButton--1z95G-e3 components-Buttons-container--3-Mphkma']
	public void setVerifyReports() {//span[text()='Create Report']
		reports.click();
	}
    public void setVerifyNewreport() throws InterruptedException {
    	newreport=driver.findElement(By.xpath("//span[text()='Create Report']"));
    	newreport.click();
    	Thread.sleep(3000);
	}

}
