package coreJava;

public class ConcreteClassForSim extends AbsAirtel{
	public static void main(String [] args) {
		AbsAirtel t = new ConcreteClassForSim();
		t.welcome();
		t.Airtel();
		t.name();
		t.mobNo();
		t.adharNo();
		t.adress();
		
		AbsJio t1 = new AbsJio();
		t1.jio();
		t1.name();
		t1.mobNo();
		t1.adharNo();
		t1.adress();
		AbsSim.thankq();
	}

}
