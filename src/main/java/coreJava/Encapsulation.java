package coreJava;

public class Encapsulation {
	private double balance;
	public double getBalance() {//as we want return from method we can not use void return type 
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>500) {
			this.balance=balance;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	

}
