package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	@Test
	public void asser1() {//false, the method/scenario will get aborted
		String respect = "Esteem";
		String anger = "Dander";
		Assert.assertEquals(respect, anger);
		System.out.println("Scenario 1");
	}
	@Test(groups = {"True.Equals/not Equals"})
	public void asser11() {//true the method/scenario will Execute
		String respect = "Esteem";
		String anger = "Dander";
		Assert.assertNotEquals(respect, anger);
		System.out.println("Scenario 2");
	}
	@Test(groups = {"True.Equals/not Equals"})
	public void asser111() {//true
		Assert.assertEquals(11, 11);
		System.out.println("Scenario 3");
	}
	@Test(groups= {"False.Equals/not Equals"})
	public void asser1111() {//false
		Assert.assertNotEquals(11, 11);
		System.out.println("Scenario 4");
	}
	@Test(groups= {"False.Equals/not Equals"})
	public void asser2() {//false
		String exp = "Everything will be Okay";
		String act = "All iz Well";
		Assert.assertEquals(exp, act);
		System.out.println("Scenario 5");
	}
	
	@Test(groups = {"True.Equals/not Equals"})
	public void asser22() {//true
		String exp = "Everything will be Okay";
		String act = "All iz Well";
		Assert.assertNotEquals(exp, act);
		System.out.println("Scenario 6");
	}
	@Test(groups= {"False.Equals/not Equals"})
	public void asser222() {//false
		Assert.assertNotEquals(22, 22);
		System.out.println("Scenario 7");
	}
	@Test(groups = {"True.Equals/not Equals"})
	public void asser2222() {//true
		Assert.assertEquals(22, 22);
		System.out.println("Scenario 8");
	}
	@Test(groups = {"True.True/False"})
	public void asser3() {//true
		String myname = "coffee";
		Assert.assertTrue(true, (myname.equals("copy"))+"Not matched");
		System.out.println("Scenario 9");
	}
	@Test(groups = {"True.True/False"})
	public void asser33() {//true
		Assert.assertTrue(7>5, "Seven is greater than five");
		System.out.println("Scenario 10");
	}
	@Test(groups = {"True.True/False"})
	public void asser4() {//true
		String myname = "Coffee";
		Assert.assertFalse(false, (myname.equals("copy")+ "Not Matched"));
		System.out.println("Scenario 11");
	}
	
	@Test(groups = {"True.True/False"})
	public void asser44() {//true
		Assert.assertFalse(5>7, "Five never can be equals to Seven ");
		System.out.println("Scenario 12");
	}
	@Test(groups= {"False.True/False"})
	public void asser5() {//false
		String d = "Disco";
		String e = "Disc0";
		Assert.assertTrue(d.equals(e));
		System.out.println("Scenario 13");
	}
	@Test(groups = {"True.True/False"})
	public void asser55() {//true
		String d ="Disco";
		String e = "Disc0";
		Assert.assertFalse(d.equals(e));
		System.out.println("Scenario 14");
	}
	@Test(groups = {"True.Null/notNull"})
	public void asser9() {//true
		Assert.assertNull(null);
		System.out.println("Scenario 15");
	}
	@Test(groups= {"False.Null/notNull"})
	public void asser99() {//false
		Assert.assertNull("abc");
		System.out.println("Scenario 16");
	}
	@Test(groups= {"False.Null/notNull"})
	public void asser999() {//false
		Assert.assertNotNull(null);
		System.out.println("Scenario 17");
	}
	@Test(groups = {"True.Null/notNull"})
	public void asser9999() {//true
		Assert.assertNotNull("abc");
		System.out.println("Scenario 18");
	}

}
