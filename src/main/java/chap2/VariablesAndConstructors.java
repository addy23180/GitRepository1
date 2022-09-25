package chap2;

public class VariablesAndConstructors {
	//Variables: there are 3 types of Variables:
	//1. Local variable: Declared within method body and can be accessible only in that method 
	//and can not be called outside the method body
	
	//2. Instance variable: it is also called as Static variable, Declared within class body 
	//and accessible through out the class, can be called in both static and non-static method
	//
	
	//3.Non-static variable:  Declared within class body and 
	//accessible through out the class, but can be called in only within non-static method 
	  
	int a = 123; // instance variable or non static variable
	static short b = 321; //static variable
	static String f;
	
	public static void m1() {
		int c = 789; //Local variable
		System.out.println(c);
		System.out.println(b);
		//System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
		System.out.println(a);
		
	}
	public VariablesAndConstructors() { //Zero argument constructor
		System.out.println("This is Zero argument constructor");
		System.out.println(b);
		System.out.println(a);
	}
	public VariablesAndConstructors(String f1) {
		f=f1;
		System.out.println("This is" +f);
	}
	//public void m3() {
	//	System.out.println("This is" +f);
	//}
	public static void main(String [] args) {
		VariablesAndConstructors t = new VariablesAndConstructors();
		m1(); //static method calling/invoking within same class
		t.m2(); //non-static method calling/invoking within same class
		VariablesAndConstructors t1 = new VariablesAndConstructors(" Parameterized Constructor");
	   // t1.m3();
	}
}
