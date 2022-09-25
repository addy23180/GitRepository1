package testNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations2 {
	//Annotations of TestNG
	
	//@Test
	//@BeforeMethod
	//@AfterMethod
	//@BeforeClass
	//@AfterClass
	//@BeforeSuite
	//@AfterSuite
	//@BeforeTest
	//@AfterTest
	//@BeforeGroups
	//@AfterGroups
	
	@Test
	@BeforeTest
    public void a1() {
    	System.out.println("@BeforeTest");
    }
	@Test
	@BeforeGroups
    public void a2() {
    	System.out.println("@BeforeGroups");
    }
	@Test
	@BeforeMethod
	public void a7() {
		System.out.println("@BeforeMethod");
	}
	@Test
	@AfterMethod
    public void a9() {
    	System.out.println("@AfterMethod");
	}
	@Test
	@BeforeClass
    public void a3() {
    	System.out.println("@BeforeClass");
    }
	@Test
	@AfterClass
    public void a4() {
    	System.out.println("@AfterClass");
    }
	@Test
	@BeforeSuite
	public void a5() {
    	System.out.println("@BeforeSuite");
    }
	@Test
	@AfterSuite
    public void a6() {
    	System.out.println("@AfterSuite");
    }
	
	@Test
	@AfterTest
    public void a8() {
    	System.out.println("@AfterTest");
    }
	
	@Test
	@AfterGroups
    public void a10() {
    	System.out.println("@AfterGroups");
    }
}
