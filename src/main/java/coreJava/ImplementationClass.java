package coreJava;

public class ImplementationClass implements Bank{

	@Override
	public void divA() {
		// TODO Auto-generated method stub
		System.out.println("No of students in Div A=60");
	}

	@Override
	public void divB() {
		// TODO Auto-generated method stub
		System.out.println("No of students in Div B=65");
	}

	@Override
	public void divC() {
		// TODO Auto-generated method stub
		System.out.println("No of students in Div C=70");
	}

	@Override
	public void divD() {
		// TODO Auto-generated method stub
		System.out.println("No of students in Div D=75");
	}

	@Override
	public void divE() {
		// TODO Auto-generated method stub
		System.out.println("No of students in Div E=72");
	}

	@Override
	public void customerDetailsOfA() {
		// TODO Auto-generated method stub
		System.out.println("Account created successfully of students of Div A=50 ");
	}

	@Override
	public void customerDetailsOfB() {
		// TODO Auto-generated method stub
		System.out.println("Account created successfully of students of Div B=58 ");
	}

	@Override
	public void customerDetailsOfC() {
		// TODO Auto-generated method stub
		System.out.println("Account created successfully of students of Div C=68 ");
	}

	@Override
	public void customerDetailsOfD() {
		// TODO Auto-generated method stub
		System.out.println("Account created successfully of students of Div D=70 ");
	}

	@Override
	public void customerDetailsOfE() {
		// TODO Auto-generated method stub
		System.out.println("Account created successfully of students of Div E=65 ");
	}
	public static void main(String [] args) {
		ImplementationClass t = new ImplementationClass();
		t.wc();
		t.welcome();
		t.divA();
		t.divB();
		t.divC();
		t.divD();
		t.divE();
		t.customerDetailsOfA();
		t.customerDetailsOfB();
		t.customerDetailsOfC();
		t.customerDetailsOfD();
		t.customerDetailsOfE();
		School.thanq();
		Bank.thankYou();
	}

}
