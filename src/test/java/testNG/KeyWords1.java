package testNG;

import org.testng.annotations.Test;

public class KeyWords1 {
	//TestNG Keywords
	//Priority
	//1. Firstly -ve Priority will print in ascending order
	//2. The one will print which doesn't have provided any kind of Priority 
	//3. The 0 Priority will print 
	//4. +ve Priority will print in ascending order
	
	@Test(priority=-786)
    public void xyz() {  //2
		System.out.println("XYZ");
    }
	@Test(priority=-101)
    public void wxyz() { //3
		System.out.println("WXYZ");
    }
	@Test(priority=0)
    public void pqrs() {  //5
		System.out.println("PQRS");
    }
	@Test
    public void pqr() {  //4
		System.out.println("PQR");
    }
	@Test(priority=786)
    public void jkl() {  //9
		System.out.println("JKL");
    }
	@Test(priority=101)
    public void def() {  //6
		System.out.println("DEF");
	}
	@Test(priority=-786)
	public void abc() {  //1
		System.out.println("ABC");
	}
	@Test(priority=786)
	public void Abc() {  //8
		System.out.println("Abc");
	}
	@Test(priority=111)
	public void Pqr() {  //7
		System.out.println("Pqr");
	}
	@Test(priority=1111)
	public void Xyz() {  //10
		System.out.println("Xyz");
	}
}
