package testNGSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite2 {
	@Test
	public void b1() throws InterruptedException {//2
		System.out.println("ABC");
		System.setProperty("webdriver.chrome.driver", "D:\\Velocitytraining\\Setups\\Chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().deleteAllCookies();
	    d.navigate().to("https://www.facebook.com/");
	    Thread.sleep(4000);
	    d.quit();
	
	}
	
	@Test(priority=0)//4
    public void pqrs() throws InterruptedException { 
		System.out.println("PQRS");
		System.setProperty("webdriver.gecko.driver", "D:\\Velocitytraining\\Setups\\FireFox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		String expUrl = "https://www.instagram.com/accounts/login/";
		String actUrl = "https://www.instagram.com/accounts/login/";
		if(expUrl.equals(actUrl)) {
			System.out.println("Test Result passed");
		}
		else {
			System.out.println("Test Result Failed");
		}
		Thread.sleep(4000);
		driver.quit();
    }
	
	@Test(priority=0, timeOut=20000)//3
    public void jklm() {  
		System.out.println("jklm");
    }
	
	@Test(priority=-1, enabled=true)//1
    public void WXWZ() {  
		System.out.println("WXWZ");
    }
	
	@Test(priority=5, invocationCount=3)//6
    public void Mno() {  
		System.out.println("Mno");
    }
	
	@Test
    public void xyz() {   //5
		System.out.println("xyz");
		Assert.fail();
    }

}
