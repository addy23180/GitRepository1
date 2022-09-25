package programBySir;

import org.testng.annotations.Test;

public class Group1BySir {
	@Test(groups = {"Sanity"})
	public void test1() {
		System.out.println("Test 1 is Running");
	}
	@Test(groups = {"Sanity", "Smoke"})
	public void test2() {
		System.out.println("Test 2 is Running");
	}
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("Test 3 is Running");
	}
	@Test(groups = {"Smoke"})
	public void test4() {
		System.out.println("Test 4 is Running");
	}
	@Test(groups = {"Sanity", "regression"})
	public void test5() {
		System.out.println("Test 5 is Running");
	}
	@Test(groups = {"regression"})
	public void test6() {
		System.out.println("Test 6 is Running");
	}
	@Test(groups = {"Smoke", "regression"})
	public void test7() {
		System.out.println("Test 7 is Running");
	}

}
