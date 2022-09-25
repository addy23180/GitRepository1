package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomActiTimeClasses.LogoutClass;
import pomActitimeClassesPF.LoginPgPF;

public class TestNGAnnotations1 {
	//Annotations
	// test
	
	@Test
	
	public void t1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocitytraining\\Setups\\Chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("http://localhost/login.do");
	    
	    LoginPgPF q = new LoginPgPF(driver);
		q.setUsername();
		q.setPwd();
		q.verifyLoginbutton();
		Thread.sleep(3000);
		LogoutClass p = new LogoutClass(driver);
		p.setLogout();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void t2() {
		System.out.println("Hello TestNG it was nice to meet you");
	}

}
