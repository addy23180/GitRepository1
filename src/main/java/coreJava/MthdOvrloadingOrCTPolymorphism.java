package coreJava;

public class MthdOvrloadingOrCTPolymorphism {
	public void mo(int a) {
		System.out.println("Area of my house: "+a+"sq.ft");
	}
    //public void mo(int b, int c) {
    //	System.out.println("Area of my Future house would be: "+b*c+"sq.ft");
	//}
	public static void main(String [] args) {
		MthdOvrloadingOrCTPolymorphism t = new MthdOvrloadingOrCTPolymorphism();
	    t.mo(1200);
	    //t.mo(50, 70);
	    
	}

}
