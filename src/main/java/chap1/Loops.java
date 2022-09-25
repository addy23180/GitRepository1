package chap1;

public class Loops {
	int i;
	int n=10;
	int j=35;
	public void forLoop() {
		System.out.println("For Loop");
		for(i=0; i<n; i++) {
			System.out.println(i);
		}
	}
    public void whileLoop() {
    	System.out.println("While Loop");
		while(n<50) {
			System.out.println(n);
			n++;
		}
		
	}
    public void doWhileLoop() {
    	System.out.println("Do While Loop");
    	do {
    		System.out.println(i);
    		i++;
    	}
    	while(i<j);
    }
	public static void main(String [] args) {
		Loops j = new Loops();
		j.forLoop();
		j.whileLoop();
		j.doWhileLoop();
		
	}

}
