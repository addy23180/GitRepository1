package programBySir;

import org.testng.annotations.Test;

public class Group2BySir {
	@Test(groups = {"Sanity"})
	public void test11() {
		System.out.println("Test 11 is Running");
	}
	@Test(groups = {"Sanity", "Smoke"})
	public void test12() {
		System.out.println("Test 12 is Running");
	}
	@Test(groups = {"regression"})
	public void test13() {
		System.out.println("Test 13 is Running");
	}
	@Test(groups = {"Smoke"})
	public void test14() {
		System.out.println("Test 14 is Running");
	}
	@Test(groups = {"Sanity", "regression"})
	public void test15() {
		System.out.println("Test 15 is Running");
	}
	@Test(groups = {"regression"})
	public void test16() {
		System.out.println("Test 16 is Running");
	}
	@Test(groups = {"Smoke", "regression"})
	public void test17() {
		System.out.println("Test 17 is Running");
	}

}
