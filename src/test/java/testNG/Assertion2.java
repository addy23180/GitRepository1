package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	@Test
	public void assertionA() {
		System.out.println("Test scenario 1 Started");//true
		Assert.assertNull(null);
		System.out.println("Test scenario 1 Ended");//true
		System.out.println("Test scenario 2 Started");//true.
		
		Assert.assertNotNull(null);
		System.out.println("Test scenario 2 Ended");//false
	}
	
	@Test
    public void assertionB() {
    	System.out.println("Test scenario 3 Started");//true
    	String a ="Good";
    	String b ="G00d";
    	Assert.assertTrue(a.equals(b));
		System.out.println("Test scenario 3 Ended");//false
		System.out.println("Test scenario 4 Started");//false
		
		String c ="Root";
    	String d ="Route";
		Assert.assertFalse(c.equals(d));
		System.out.println("Test scenario 4 Ended");//true, but will not print as the above one is false
	}

}
