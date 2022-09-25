package coreJava;

public class UpcastingSub extends UpcastingSuper{
    public void sub1() {
		System.out.println("SUB1");
	}
    public void sub2() {
    	System.out.println("SUB2");
	}
    public static void main(String [] args) {
    	UpcastingSub t = new UpcastingSub();
    	t.sub1();
    	t.sub2();
    	t.super1();
    	t.super2();
    	
    	//Upcasting
    	UpcastingSuper u = new UpcastingSub();
    	u.super1();
    	u.super2();
    	
    	//Downcasting
    	UpcastingSub d = (UpcastingSub) u;
    	d.sub1();
    	d.sub2();
    	d.super1();
    	d.super2();
    	
	}

}

