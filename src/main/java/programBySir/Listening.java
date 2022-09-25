package programBySir;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listening  implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println("[Hureyy.... Test case Started] " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("[Aaila.... Test case Pass Zali ki] " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("[Ohh Shit !!! Test Case Fail Zali na] " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("[Arrrr.... Test case Skip Marli Ki] " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

	public void onStart(ITestContext context) {
		System.out.println("[Wajav Testing Start Zali US chi] " + context.getName());	
	}

	public void onFinish(ITestContext context) {
		System.out.println("[band Kar be Testing Sampli US chi] " + context.getName());	
	}

}
