package pomEXECUTION;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amezonPOMClasses.FacebookLoginCPage;
import amezonPOMClasses.KiteLogin111;
import kitePOMClasses.KiteLoginPg;
import amezonPOMClasses.AmeLoginPage;
import amezonPOMClasses.AmeLogoutPage;
import amezonPOMClasses.AmePWD;
import amezonPOMClasses.FBCreateStory;

public class AmezonExecution {
	//All Annotations of TestNG
	//All Keywords of TestNG
	String key1 = "webdriver.chrome.driver";
	String key2 = "webdriver.gecko.driver";
	String value1 = "D:\\Velocitytraining\\Setups\\\\Chrome\\chromedriver_win32 (1)\\chromedriver.exe";
	String value2 = "D:\\Velocitytraining\\Setups\\FireFox\\geckodriver-v0.31.0-win64\\geckodriver.exe";
	String url1 = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fhelp%2Fcustomer%2Faccount-issues%2Fref%3Dnav_ya_signin%3Fie%3DUTF8&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
	String url2 = "https://www.flipkart.com/account/login?ret=%2Faccount%2Forders%3Flink%3Dhome_orders&fromMyOrdersPage=true";
	String url3 = "https://www.facebook.com/login/";
	String url4 = "https://kite.zerodha.com/";
	
	WebDriver driver;
	AmeLoginPage j;
	FacebookLoginCPage o;
	AmeLogoutPage k;
	FBCreateStory m;
	AmePWD l;
	KiteLoginPg n;
	
	@BeforeSuite
	public void Bsuite() {
		System.out.println("```~~~Welcome to TestNG Suite!~~~```");
	}
	
	@BeforeTest
    public void Btest() {
		System.out.println("Amezon Testing Start");
	}
	
	@BeforeClass
	//@Test
    public void Bclass() throws InterruptedException {
		System.out.println("Browser Opened");
		
		System.setProperty(key1, value1);
		//
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(url1);
		String actUrl = url1;
		String expUrl = url1;
		if(expUrl.equals(actUrl)) {
			System.out.println("Test scenario is Passed");
		}
		else {
			System.out.println("Test scenario is Failed");
		}
		j = new AmeLoginPage(driver);
		l = new AmePWD(driver);
		k = new AmeLogoutPage(driver);
		
		Thread.sleep(3000);
	}
	
	@BeforeMethod
    public void Bmethod() throws InterruptedException {
		//Login details
		System.out.println("Logged in successfully");
		j.setUN(); 
		Thread.sleep(3000);
		
	}
	
	@Test
	public void CSTest() throws InterruptedException {
		System.out.println("Logged in successfully and checked Create Story");
		l.setPWD();
		Thread.sleep(3000);
    }
	
	@AfterMethod
    public void Amethod() throws InterruptedException {
		//Logout details
		System.out.println("Logged out successfully");
		k.setAll();
		Thread.sleep(500);
		k.setLogout();
		Thread.sleep(3000);
		driver.quit();
    }
	
	@AfterClass
    public void Aclass() {
		System.out.println("Browser Closed");
    }
	
	@AfterTest
    public void Atest() {
		System.out.println("Amezon Testing End");
	}
	
	@AfterSuite
    public void Asuite() {
		System.out.println("```~~~Thank you for Using TestNG Suite!~~~```");
	}
}
