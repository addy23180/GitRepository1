package pomEXECUTION;
import org.openqa.selenium.SearchContext;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomActitimeClassesPF.HomePgPF;
import pomActitimeClassesPF.LoginPgPF;
import pomActitimeClassesPF.LogoutPF;
import pomActitimeClassesPF.ReportsPF;
import pomActitimeClassesPF.TasksPF;
import pomActitimeClassesPF.UsersPF;
import pomActitimeClassesPF.WorkSchedulePF;

public class ActitimeExecution {
	WebDriver driver;
	LoginPgPF a;
	HomePgPF b;
	TasksPF c;
	ReportsPF d;
	UsersPF e;
	WorkSchedulePF f;
	LogoutPF g;
	
	    //@Test
		//@BeforeMethod
		//@AfterMethod
		//@BeforeClass
		//@AfterClass
		//@BeforeSuite
		//@AfterSuite
		//@BeforeTest
		//@AfterTest
		//@BeforeGroups
		//@AfterGroups
	
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("Browser Opened");
	
	System.setProperty("webdriver.chrome.driver", "D:\\Velocitytraining\\Setups\\Chrome\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to("http://localhost/login.do");
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebDriverWait m = new WebDriverWait(driver, Duration.ofSeconds(7));
	//WebElement ex = m.until(ExpectedConditions.visibilityOfElementLocated).click();
	a = new LoginPgPF(driver);
	b = new HomePgPF(driver);
	c = new TasksPF(driver);
	d = new ReportsPF(driver);
	e = new UsersPF(driver);
	f = new WorkSchedulePF(driver);
	g = new LogoutPF(driver);
	}
	
	//login page
	@BeforeMethod
	public void login() throws InterruptedException {
		System.out.println("Logged in Succefully");
	a.setUsername();
	a.setPwd();
	a.verifyLoginbutton();
	//Thread.sleep(1000);
	}
	
	@Test
	public void T1() throws InterruptedException {
		System.out.println("On Home page, verify logo, timrtrack page and Add task textbox checked successfully");
	b.setLogo();
	b.setTimetrack();
	b.setAddTask();
	Thread.sleep(3000);
	}
	
	@Test(timeOut=30000)
	public void T2() throws InterruptedException {
		System.out.println("On Home page, clicked on tasks successfully");
	c.setVerifyTasks();
	//l.setVerifyCreateTask();
	Thread.sleep(3000);
	}
	
	@Test
	public void T3() throws InterruptedException {
		System.out.println("On Home page, clicked on Reports successfully");
	d.setVerifyReports();
	//m.setVerifyNewreport();
	Thread.sleep(3000);
	}
	
	@Test
	public void T4() throws InterruptedException {
		System.out.println("On Home page, clicked on Users successfully");
	e.setUsers();
	//n.setNewUser();
	Thread.sleep(3000);
	}
	
	@Test
	public void T5() throws InterruptedException {
		System.out.println("On Home page, clicked on Workschedules successfully");
	f.setWorkschedule();
	//o.setSelect();
	//o.setLogout();
	Thread.sleep(3000);
	}
	
	//@Test
	@AfterMethod
	public void logout() throws InterruptedException {
		System.out.println("Logged out Succefully");
	g.setLogout();
	Thread.sleep(3000);
	
	}
	
	@AfterClass
	public void browserClosed() {
		System.out.println("Browser Closed");
		driver.quit();
	}
}
