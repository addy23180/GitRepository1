package programBySir;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1 {
	@Test
	public void test11() {
		String kiss = "Puppy"; // Expected 
		String slap = "Thappad";// Actual 
		Assert.assertEquals(slap, kiss);
	}
	@Test
	public void test12() {
		String exp = "Ye Samay chala Jayega"; // Expected 
		String act = "Ye Samay Bad me nahi aayega";// Actual 
		Assert.assertNotEquals(act, exp);
	}

	@Test
	public void test13() {
		Assert.assertEquals(12, 12);
	}
	
	@Test
	public void test14() {
		String myName = "Gyanba";
		Assert.assertTrue(true, (myName.equals("Gyanuba")) +" Not Matched");
	}
	
	@Test
	public void test15() {
		Assert.assertTrue(11>13, "Number bada nahi hai");
	}
	
	@Test
	public void test16() {
		String d = "Disco";
		String s = "Disc0";
		Assert.assertFalse(d.equals(s));
	}
	
	@Test
	public void test17() {
		Assert.assertNull(null);
	}
	@Test
	public void test18() {
		Assert.assertNotNull("Aata Bas Karav Watayal");
	} 

}
