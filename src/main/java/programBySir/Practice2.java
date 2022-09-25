package programBySir;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice2 {
	@Test
	public void test21() {
		System.out.println("Test 21 a Scenario Started");
		String d = "Disco";
		String s = "Disc0";
		Assert.assertTrue(d.equals(s));
		System.out.println("Test 21 a Scenario Completed");
		System.out.println("Test 21 b Scenario Started");
		
		String a = "Morning";
		String b = "Evening";
		Assert.assertTrue(a.equals(b));
		System.out.println("Test 21 b Scenario Completed");
	}
	
	@Test
	public void test22() {
		System.out.println("Test 22 a Scenario Started");
		Assert.assertNull(null);
		System.out.println("Test 22 a Scenario Completed");
		System.out.println("Test 22 b Scenario Started");
		
		Assert.assertFalse(25>35);
		System.out.println("Test 22 b Scenario Completed");
	}

}
