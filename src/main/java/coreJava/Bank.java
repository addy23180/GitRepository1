package coreJava;

public interface Bank extends School{
	default void welcome() {
		System.out.println("Welcome to SBI Bank");
	}
	void customerDetailsOfA();
	void customerDetailsOfB();
	void customerDetailsOfC();
	void customerDetailsOfD();
	void customerDetailsOfE();
	
	static void thankYou() {
		System.out.println("Thank you for coming in SBI Bank");
	}

}
