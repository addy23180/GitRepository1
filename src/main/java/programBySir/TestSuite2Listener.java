package programBySir;

import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite2Listener {
	@Test
	public void w6() {
		System.out.println("w6 is running");
	}
	@Test
	public void w7() {
		System.out.println("w7 is running");
		//Assert.fail();
	}
	@Test
	public void w8() {
		System.out.println("w8 is running");
		Assert.fail();
	}
	@Test
	public void w9() {
		System.out.println("w9 is running");
	}
	@Test
	public void w10() {
		System.out.println("w10 is running");
	}

}
