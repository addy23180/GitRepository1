package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Assertion3 {
	 SoftAssert w = new SoftAssert();
	@Test
	public  void A1() {
		System.out.println("Testcase 1 is started");//TRUE
		String exp = "Velocity";
		String act = "Other classes";
		w.assertTrue(exp.equals(act), "Level doesn't match");
		System.out.println("Testcase 1 is Ended");//FALSE
		
		System.out.println("Testcase 2 is started");//FALSE
		
		int c = 27;
		int d = 17;
		w.assertTrue(c == d);
		System.out.println("Testcase 2 is Ended");//FALSE
		System.out.println("Testcase 3 is started");//FALSE
		
		w.assertNotEquals("Civil Engineer", "Contractor");
		System.out.println("Testcase 3 is Ended");//TRUE
		//w.assertAll();
	}
	@Test
	public  void A2() {
		System.out.println("Testcase 4 is started");//TRUE
		
		w.assertTrue(71==61);
		System.out.println("Testcase 4 is Ended");//FALSE
		System.out.println("Testcase 5 is started");//FALSE
		w.assertNotNull(w);
		System.out.println("Testcase 5 is Ended");//TRUE
		//w.assertAll();
	}

}
