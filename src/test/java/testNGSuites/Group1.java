package testNGSuites;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = {"Sanity"})
	public void g1() {
		System.out.println("g1 Executed");
	}
	@Test(groups = {"Regression"})
	public void g2() {
		System.out.println("g2 Executed");
	}
	@Test(groups = {"Sanity", "Regression"})
	public void g3() {
		System.out.println("g3 Executed");
	}
	@Test(groups = {"Smoke"})
	public void g4() {
		System.out.println("g4 Executed");
	}
	@Test(groups = {"Smoke", "Sanity"})
	public void g5() {
		System.out.println("g5 Executed");
	}
	@Test(groups = {"Smoke", "Regression"})
	public void g6() {
		System.out.println("g6 Executed");
	}
	@Test
	public void g7() {
		System.out.println("g7 Executed");
		Assert.fail();
	}
}
