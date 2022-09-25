package coreJava;

public class ExecutionOfEncapsulation {
	public static void main(String [] args) {
		Encapsulation e = new Encapsulation();
		e.setBalance(35000);
		
		double blnc = e.getBalance();
		System.out.println("Your account balance is: " +blnc);
	}

}
