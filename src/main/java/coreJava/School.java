package coreJava;

public interface School {
	default void wc() {
		System.out.println("Welcome to Shri Shivaji vidyalaya");
	}
	void divA();
	void divB();
	void divC();
	void divD();
	void divE();
	
	static void thanq() {
		System.out.println("Thank you for coming in Shri Shivaji vidyalaya");
	}
}
