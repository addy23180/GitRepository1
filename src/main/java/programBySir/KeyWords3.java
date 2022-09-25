package programBySir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyWords3 {
	@Test
	public void mu1() {
		System.out.println("MU1 is Running");
	}
	@Test(timeOut = 40000)
	public void mu2() {
		System.out.println("MU2 is Running");
		System.setProperty("webdriver.gecko.driver", "D:\\VelocityTraining\\SetUps\\FireFoxGeckoDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver  d = new FirefoxDriver();
		d.navigate().to("https://in.bookmyshow.com/");
		String expURL = "https://in.bookmyshow.com";
		String actURL = d.getCurrentUrl();
		if (expURL.equals(actURL)) {
			System.out.println("Test Scenario is Passed");
		} else {
			System.out.println("Test Scenario is Failed");

		}
		d.quit();
		Assert.fail(); 
	}
	@Test(dependsOnMethods = {"mu2"})
	public void mu3() {
		System.out.println("MU3 is Running");
		System.out.println("Ye MU2 Bai tu aalis tarch mi yete nahitr nako");
		// Assert.fail();
	}
	@Test
	public void mu4() {
		System.out.println("MU4 is Running");
	}
	@Test
	public void mu5() {
		System.out.println("MU5 is Running");
	}

}
