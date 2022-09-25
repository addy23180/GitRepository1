package chap1;

public class RegularOrBusinessMethod {
	public static void main(String [] args) {
		System.out.println("There are two types of Regular/Business Method: 1.Static Method 2.Non-Static Method");
		RegularOrBusinessMethod t = new RegularOrBusinessMethod();
		StaticMethod();
		t.NonStaticMethod();
	}
	public static void StaticMethod() {
		System.out.println("Static method is static in nature \nThe std way to call static "
				+ "method in main method is: methodname(); \nIt is also called early binding or "
				+ "compile time polymorphism as it's declaration gets binded with defination at "
				+ "the time of Compilation.");
	}
	public void NonStaticMethod() {
		System.out.println("Non-static method is dynamic in nature. \nThe std way to call "
				+ "Non-static method in main method is: objrefvariable.methodname(); "
				+ "\nIt is also called late binding or run time polymorphism as it's "
				+ "declaration gets binded with defination at the time of Run.");
	}
	

}
