package testNG;

import org.testng.annotations.Test;

public class TestNGRegularExpression {
	@Test(groups= {"chrome.Sanity"})
	public void c1() {
		System.out.println("c1 is Running");
	}
	
	@Test(groups= {"chrome.Smoke"})
    public void c2() {
		System.out.println("c2 is Running");
	}
	
	@Test(groups= {"chrome.Regression"})
    public void c3() {
		System.out.println("c3 is Running");
    }
	
	@Test(groups= {"firefox.Sanity"})
    public void f1() {
		System.out.println("f1 is Running");
	}
	
	@Test(groups= {"firefox.Smoke"})
    public void f2() {
		System.out.println("f1 is Running");
    }
	
	@Test(groups= {"firefox.Regression"})
    public void f3() {
		System.out.println("f1 is Running");
    }

}
