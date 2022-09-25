package chap2;

public class AllOperators {
	//Unary Operator
	//Shift Operator
	//Arithmetical Operator
	//And Or Operator
	//Relational Operator
	public void UnaryOperator() {
		int a = 1;
		int b = 10;
		System.out.println("Unary operators: ");
		System.out.println(a++); //1
		System.out.println(b--); //10
		System.out.println(++a); //2, 3
		System.out.println(--b); //9, 8
		
		int c = 5;
		int d = 15;
		
		boolean p =c<d;
		boolean q =c>d;
		System.out.println(~c); // -(n+1)=-6
		System.out.println(~d); // -(n+1)=-16
		System.out.println(!p); //  false
		System.out.println(!q); //  true
	}
    public void ShiftOperator() {
    	short e = 120;
    	short f = 16;
    	
    	System.out.println("\nShift Operators: ");
    	System.out.println(e>>3); // v/2^n=120/2^3=15
    	System.out.println(f<<2); // v*2^n=16*2^2=64
	}
    public void ArithmeticalOperator() {
	    byte g =22;
	    byte h =28;
	    System.out.println("\nArithmetical Operators: ");
	    System.out.println(g+h); // 50
	    System.out.println(h-g); // 6
	    System.out.println(g*h); // 616
	    System.out.println(h/g); // 1
	    System.out.println(h%g); // 6
    }
    public void AndOrOperator() {
    	int i = 40;
    	int j = 20;
    	int k = 30;
    	int l = 60;
    	System.out.println("\nAnd Or Operators: ");
    	System.out.println(i>=j | k<=l); //true (betwise or)
    	System.out.println(i>=j | k>=l); //true (1 condition true=true)
    	System.out.println(i>=j || k<=l); //true (logical or)
    	System.out.println(i<=j || k<=l); //true (1 condition true=true)
    	//Betwise and : 1st cond true/false , 2nd will print
    	//Betwise or :  1st cond true/false , 2nd will print
    	//Logical and :  1st cond true then only 2nd will print
    	//Logical or :  1st cond false then only 2nd will print
    	
    	System.out.println(i>=j & k<=l); //true (betwise and)
    	System.out.println(i>=j & k>=l); //false (1 condition false=false)
    	System.out.println(i>=j && k<=l); //true (logical and)
    	System.out.println(i<=j && k<=l); //false (1 condition false=false)
	
    }
    public void RelationalOperator() {
    	short m = 30;
    	short n = 70;
    	System.out.println("\nRelational Operators: ");
    	System.out.println(m>n); //false
    	System.out.println(m<n); //true
    	System.out.println(m=n); //70
    	System.out.println(30!=70); //true
    	System.out.println(30>70); //false
    	System.out.println(30<=70); //true
    	System.out.println(30==70); //false
	
    }
	public static void main(String [] args) {
		AllOperators t = new AllOperators();
		t.AndOrOperator();
		t.ArithmeticalOperator();
		t.RelationalOperator();
		t.ShiftOperator();
		t.UnaryOperator();
	}

}
