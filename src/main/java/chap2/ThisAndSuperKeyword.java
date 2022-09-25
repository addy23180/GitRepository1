package chap2;

public class ThisAndSuperKeyword extends VariablesAndConstructors{
	String a = "Instance variable";
	public void t1() {
		String a = "Local variable";
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void t3() {
		ThisAndSuperKeyword v = new ThisAndSuperKeyword();
		System.out.println("Non-static variable of the same class called in static method for that "
				+ "we need to create an object of the same class in this(static method): " +v.a);
		
		VariablesAndConstructors t = new VariablesAndConstructors();
		System.out.println("Non-static variable of the super class called in static method for that "
				+ "we need to create an object of the super class in this(static method): " +t.a);
	}
     
	public void t2() {
		super.m1(); //Method calling from super/another class using super keyword
		System.out.println(super.a); //Calling instance variable from another(super) class
		System.out.println(super.f);
	}
	public ThisAndSuperKeyword() {
		//super(); //Constructor/Zero argument Constructor calling from another class using super keyword, 
		           //even if you don't use super keyword to call Constructor/Zero argument Constructor 
		           //it will by default call the Constructor/Zero argument Constructor as the first space in constructor of 
		           //subclass is reserved for the Constructor/Zero argument Constructor
		super(" Parameterized Constructor"); //Parameterized Constructor calling from another 
		           //class using super keyword
	}
	
	public static void main(String [] args) {
		ThisAndSuperKeyword t = new ThisAndSuperKeyword();
		t.t1();
		t.t2();
		t.t3();
	}

}
