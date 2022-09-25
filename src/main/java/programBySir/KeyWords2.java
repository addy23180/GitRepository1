package programBySir;

import org.testng.annotations.Test;

public class KeyWords2 {
	@Test(priority = 5)
	public void pu1() {
		System.out.println("PU1 is Running");
	}
	
	@Test(priority = 6, invocationCount= 5)
	public void pu2() {
		System.out.println("pu2 is Running");
	}	
	
	@Test (priority = 1, enabled =false)
	public void pu3() {
		System.out.println("pu3 is Running");
	}
	
	@Test (priority = 2)
	public void pu4() {
		System.out.println("pu4 is Running");
	}
	
	@Test(priority = 3, timeOut = 60000)
	public void pu5() {
		System.out.println("pu5 is Running");
	}
	
	@Test(priority = 4)
	public void pu6() {
		System.out.println("pu6 is Running");
	}

}
