package programBySir;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite2BySir {
	@Test
	public void r11() {
		System.out.println("R1 is Running");
	}

	@Test
	public void r12() {
		System.out.println("R12 is Running");
		Assert.fail();
	}
	@Test
	public void r13() {
		System.out.println("R13 is Running");
		
	}
	@Test
	public void r14() {
		System.out.println("R14 is Running");
	}
	@Test
	public void r15() {
		System.out.println("R15 is Running");
	}

	@Test
	public void r16() {
		System.out.println("R16 is Running");
	}

	@Test
	public void r17() {
		System.out.println("R17 is Running");
		Assert.fail();
	}
	@Test
	public void r18() {
		System.out.println("R18 is Running");
	}
	@Test
	public void r19() {
		System.out.println("R19 is Running");
	}

}
