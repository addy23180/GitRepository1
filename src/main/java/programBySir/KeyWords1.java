package programBySir;

import org.testng.annotations.Test;

public class KeyWords1 {
	// TestNG KeyWords
		// 1. Priority 
		
		@Test(priority = -101)
		public void xyz() {
			System.out.println("XYZ is Running");
		}
		@Test(priority = 233)
		public void abc() {
			System.out.println("ABC is Running");
		}
		@Test (priority = 0)
		public void pqr() {
			System.out.println("PQR is Running");
		}
		@Test (priority = -233)
		public void mno() {
			System.out.println("MNO is Running");
		}
		@Test(priority = -233)
		public void def() {
			System.out.println("Def is Running");
		}
		
		// Total Execution = 5
		// Sequence - 

}
