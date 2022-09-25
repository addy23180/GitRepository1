package coreJava;

public class MthdOvrridingOrRTPolymorphism extends MthdOvrloadingOrCTPolymorphism{
	//public void mo(int d) {
	//	System.out.println("Age of the Independent India: "+d+"yrs");
	//}
  public void mo(int e, int f) {
	System.out.println("Age of the Independent Maharashtra and Java language: "+e+"yrs and "+f+"yrs respectively");
}
	public static void main(String [] args) {
		MthdOvrridingOrRTPolymorphism z = new MthdOvrridingOrRTPolymorphism();
	    //z.mo(75);
	    z.mo(62, 27);
	    z.mo(1250);
	    //z.mo(40, 60);
	    
	}
//We can have only 2 methods for overriding
}
