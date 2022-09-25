package pomEXECUTION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomActiTimeClasses.LogoutClass;
import pomActitimeClassesPF.HomePgPF;
import pomActitimeClassesPF.LoginPgPF;
import pomActitimeClassesPF.ReportsPF;
import pomActitimeClassesPF.TasksPF;
import pomActitimeClassesPF.UsersPF;
import pomActitimeClassesPF.WorkSchedulePF;

public class ActitimePFExecution {
	public static void main(String [] args) throws InterruptedException {
		System.out.println("Test Scenarios passed Successfully to Actitime");
		System.setProperty("webdriver.chrome.driver", "D:\\Velocitytraining\\Setups\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		
		//login page
		LoginPgPF j = new LoginPgPF(driver);
		j.setUsername();
		j.setPwd();
		j.verifyLoginbutton();
		Thread.sleep(3000);
		
		HomePgPF k = new HomePgPF(driver);
		k.setLogo();
		k.setTimetrack();
		k.setAddTask();
		//Thread.sleep(3000);
		
		TasksPF l = new TasksPF(driver);
		l.setVerifyTasks();
		l.setVerifyCreateTask();
		Thread.sleep(3000);
		
		ReportsPF m = new ReportsPF(driver);
		m.setVerifyReports();
		m.setVerifyNewreport();
		Thread.sleep(3000);
		
		UsersPF n = new UsersPF(driver);
		n.setUsers();
		n.setNewUser();
		Thread.sleep(3000);
		
		WorkSchedulePF o = new WorkSchedulePF(driver);
		o.setWorkschedule();
		o.setSelect();
		//o.setLogout();
		Thread.sleep(3000);
		
		LogoutClass p = new LogoutClass(driver);
		p.setLogout();
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
