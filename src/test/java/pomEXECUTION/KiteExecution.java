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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amezonPOMClasses.KiteLogin111;
import kitePOMClasses.KiteLoginPg;
import kitePOMClasses.KiteLogoutPg;
import kitePOMClasses.KiteOrders;
import kitePOMClasses.KitePinPg;


public class KiteExecution {
	WebDriver driver;
	KitePinPg w;
	KiteLoginPg x;
	KiteLogoutPg z;
	KiteOrders a;
	
	File F;
	Sheet ex;
	@BeforeSuite
	public void bs() {
		System.out.println("~~~```Welcome to TestNG Suite```~~~");
	}
	@BeforeTest
	public void bt() {
		System.out.println("~~~Testing of KITE application~~~");
	}
	@BeforeClass
	public void a1() throws EncryptedDocumentException, IOException {
		System.out.println("Start");
		System.setProperty("webdriver.chrome.driver", "D:\\Velocitytraining\\Setups\\Chrome\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://kite.zerodha.com/");
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	    
	    Reporter.log("Testing of Kite Application");
	    F = new File("D:\\T\\Kite.xlsx");
	    ex = WorkbookFactory.create(F).getSheet("Sheet1");
	    w = new KitePinPg(driver);
	    x = new KiteLoginPg(driver);
	    z = new KiteLogoutPg(driver);
	    a = new KiteOrders(driver);
	
	}
	//login.sendUserID(mySheet.getRow(0).getCell(1).getStringCellValue());
	@BeforeMethod
	public void a2() throws InterruptedException{
		x.setUsername(ex.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering user id");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		x.setPwd(ex.getRow(1).getCell(1).getStringCellValue());
		Reporter.log("Entering password");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		x.verifyLoginbutton();
		Reporter.log("Clicking on Login button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		
		w.setPIN(ex.getRow(2).getCell(1).getStringCellValue());
		Reporter.log("Entering PIN");
		w.setCont();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		Thread.sleep(3000);
		
	}
	@Test
	public void a5() throws InterruptedException {
		System.out.println("Article");
		a.setOrders();
		Thread.sleep(3000);
		a.setHoldings();
		Thread.sleep(3000);
		a.setPositions();
		Thread.sleep(3000);
		a.setFunds();
		Thread.sleep(3000);
		a.setApps();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void a3() throws InterruptedException {
		System.out.println("Logout Details");
		z.setOptions();
		z.setLogout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterClass
    public void a4() {
		System.out.println("End");
	}
	public void a7() {
		System.out.println("End of the Testing");
	}
    @AfterSuite
	public void a6() {
		System.out.println("End Suite");
	}
}

