package testNG;

import org.testng.annotations.Test;

public class KeyWords2 {
	//1.invocationCount=3 means you can provide no for how much time one wants to print the Scenario
	//2.enabled=true the scenario will print, its not compulsory
	//3.enabled=false the scenario will not get print so the scenario one doesn't want print in that 
	//case we can use this keyword
	//4.timeOut=1000 means suppose any scenario taking more time to print, in that case it will not print 
	//at regular time so we can provide the time it take to load in mili.sec with timeOut keyword
	
	@Test(priority=1, invocationCount=3)
	public void ab1() {//8, 3 times will print
		System.out.println("AB1");
	}
	
	@Test(enabled=true)
    public void ab2() {//2, will print
    	System.out.println("AB2");
	}
	
	@Test(enabled=false)
    public void ab3() {//, will not print
    	System.out.println("AB3");
    }
	
	@Test(timeOut=1000)
    public void ab4() {//3
    	System.out.println("AB4");
    }
	
	@Test()
    public void ab5() {//4
    	System.out.println("AB5");
    }
	
	@Test()
    public void ab6() {//5
    	System.out.println("AB6");
    }
	
	@Test()
    public void ab7() {//6
    	System.out.println("AB7");
    }
	
	@Test()
    public void ab() {//1
    	System.out.println("AB");
    }
}
