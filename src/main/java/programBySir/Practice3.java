package programBySir;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice3 {
	SoftAssert w = new SoftAssert();
	@Test
	public void test31() {
		System.out.println("Test 31 a Scenario Started");
		String d = "Gang";
		String s = "Tang";
		w.assertTrue(d.equals(s), " Kahich Barubar Yen Zalay");
		System.out.println("Test 31 a Scenario Completed");
		System.out.println("Test 31 b Scenario Started");
		int a = 45;
		int b = 12;
		w.assertTrue(a==b);
		System.out.println("Test 31 b Scenario Completed");
		System.out.println("Test 31 c Scenario Started");
		w.assertNotEquals("Don", "Badshah");
		System.out.println("Test 31 c Scenario Completed");
		w.assertAll();
	}

	@Test
	public void test32() {
		System.out.println("Test 32 a Scenario Started");
		Assert.assertTrue(25==26);
		System.out.println("Test 32 a Scenario Completed");
		System.out.println("Test 32 b Scenario Started");
		Assert.assertNotNull(w);
		System.out.println("Test 32 b Scenario Completed");
	}

}
