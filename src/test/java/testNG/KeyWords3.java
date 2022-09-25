package testNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeyWords3 {
	//The Method on which the other method is depends on, will execute at First
	//The Method which is dependent on another will execute at Last
	//Remaining Methods will execute as usual according to priority provided or alphabetical order
	
	@Test(timeOut=30000)
	//@Test
	public void au1() {
		System.out.println("AU1");
	}
	@Test
    public void au2() throws InterruptedException {//Depends on
		System.setProperty("webdriver.chrome.driver", "D:\\Velocitytraining\\Setups\\Chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().deleteAllCookies();
	    d.navigate().to("https://in.bookmyshow.com/");
	    String expUrl="https://in.bookmyshow.com/";
	    String actUrl=d.getCurrentUrl();
	    
	    if(expUrl.equals(actUrl)) {
	    	System.out.println("AU2 Test Scenario is Passed");
	    }
	    else {
	    	System.out.println("AU2 Test Scenario is Failed");
	    }
	    Thread.sleep(2000);
	    d.quit();
	   //Assert.fail();
	    
    }
    @Test(dependsOnMethods = {"au2"})
    public void au3() {//Dependent
    	System.out.println("AU3");
    //	Assert.fail();
    }
    
    @Test
    public void au4() {
    	System.out.println("AU4");
    }
    @Test
    public void au5() {
    	System.out.println("AU5");
    }
}
