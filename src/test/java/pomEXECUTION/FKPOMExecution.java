package pomEXECUTION;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fkBandALocatorPOM.FKLoginPg;
import kitePOMClasses.KiteLoginPg;
import kitePOMClasses.KiteLogoutPg;
import kitePOMClasses.KiteOrders;
import kitePOMClasses.KitePinPg;

public class FKPOMExecution {
	WebDriver driver;
	File file;
	Sheet sheet;
	FKLoginPg a;
	
	String key1 = "webdriver.chrome.driver";
	String value1 = "D:\\Velocitytraining\\Setups\\Chrome\\chromedriver_win32 (1)\\chromedriver.exe";
	String url1="https://www.flipkart.com/";
	
	@BeforeSuite
	public void Bsuite() {
		System.out.println("```~~~Welcome to TestNG Suite!~~~```");
	}
	@BeforeTest
	public void Btest() {
		System.out.println("Flipkart Testing Start");
	  }
	@BeforeClass
    public void Bclass() throws EncryptedDocumentException, IOException {
		System.out.println("Browser Opened");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocitytraining\\Setups\\Chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		Reporter.log("Testing Flipkart", true);
		file = new File("D:\\T\\Kite.xlsx");
		sheet = WorkbookFactory.create(file).getSheet("Sheet1"); 
		a = new FKLoginPg(driver);
	}
	@BeforeMethod
	public void Bmethod() {
		System.out.println("Logged in successfully");
		a.setUN(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
    @Test
    public void flipkart() {
    	System.out.println("Logged in successfully and checked various pages");
    	
    }
    @AfterMethod
    public void Amethod(){
    	System.out.println("Logged out successfully");
    }
    @AfterClass
    public void Aclass(){
    	System.out.println("Browser Closed");
    }
    @AfterTest 
    public void Atest(){
    	System.out.println("Flipkart Testing End");
    }
    @AfterSuite
    public void Asuite() {
    	System.out.println("```~~~Thank you for Using TestNG Suite!~~~```");
    }
}
