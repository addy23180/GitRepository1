package chap2;

import java.util.Scanner;

public class ScannerClass {
	public void s1() {
		System.out.println("~~~Personel details~~~");
		System.out.println("Enter your name: ");
		
		Scanner s = new Scanner(System.in);
		String n=s.nextLine();
		System.out.println("Your name is: " +n);
		
		System.out.println("Enter your Qualification: ");
		String o=s.nextLine();
		System.out.println("Your Qualification is: " +o);
		
		System.out.println("Enter your age: ");
		int p=s.nextInt();
		System.out.println("Your age is: " +p);
		
		System.out.println("Enter your Expected salary : ");
		int r=s.nextInt();
		System.out.println("Your Expected salary is: " +r);
	}
 
	public static void main(String [] argd) {
		ScannerClass t = new ScannerClass();
		t.s1();
	}

}
