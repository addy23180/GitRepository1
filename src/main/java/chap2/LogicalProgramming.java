package chap2;

public class LogicalProgramming {
	int i;
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	int e=50;
	int k;
	int count=0;
	int l;
	int sum;
	
	public void armstrongNo() {
		//3^3+7^3+1^3=371
		System.out.println("Armstrong no: ");
		int armNO=371;
		int p=0;
		int q;
		while(armNO>0) {
			q=armNO%10;
			p=p+q*q*q;
			armNO=armNO/10;
		}
		System.out.println(p);
	}
	
	public void palindromicNo() {
    	//121=121, 454=454, 363=363...
    	int palindromicNo=424;
    	int c=0;
    	int s=0;
    	int r;
    	System.out.println("\nPalndromic no: ");
    	c=palindromicNo;
    	while(palindromicNo>0) {
    		r=palindromicNo%10;
    		s=s*10+r;
    		palindromicNo=palindromicNo/10;
    	}
    	if(c==s) {
    		System.out.println("\nThis is palndromic no: " +palindromicNo);
    	}
    	else {
    		System.out.println("\nThis is not the palndromic no: " +palindromicNo);
    	}
    	
	}
    public void PositiveNegativeNo() {
		//1, 2, 3, 4, 5.. & -1, -2, -3, -4, -5..
    	System.out.println("\nPositive no from 1 to 15");
    	for(i=1; i<=15; i++) {
    		System.out.println(i);
    	}
    	System.out.println("\nNegative no from 1 to 15");
    	for(i=-15; i<=0; i++) {
    		System.out.println(i);
    	}
	}
    public void naturalNo() {
		//1 To infinity
    	System.out.println("\n\nNatural no from 1 to 15");
    	for(i=1; i<=15; i++) {
    		System.out.println(i);
    	}
	}
    public void EvenOddNo() {
		//2, 4, 6, 8... and 1, 3, 5, 7...
    	int t=0;
    	System.out.println("\nEven no:  Odd no:  from 1 to 15 ");
    	for(i=0; i<=15; i++) {
    		if(i%2==0) {
    			System.out.println(": " +i);
    		}
    		
    		else if(i%2!=0) {
    			System.out.println("\t\t: " +i);
    	}
	}
    }
    
    public void primeNo() {
    	int n=15;
		//2, 3, 5, 7, 11, 13...
    	System.out.println("\nPrime no from 1 to 15: ");
    	for(k=0; k<=n; k++) {
    		for(l=2; l<=k; l++) {
    			if(k%l==0) {
    				break;
    			}
    		}
    		if(k==l) {
    			System.out.println(l);
    			sum=sum+k;
    		}
    	}
    	System.out.println("Sum of prime no= " +sum);
	}
    public void averageNo() {
		//sum/n
    	int sum=a+b+c+d+e;
    	int n=5;
    	int avg=sum/n;
    	System.out.println("\nAverage of given no i.e. :" +a+","+b+","+c+","+d+","+e);
    	System.out.println(avg);
	}
    public void reverseNo() {
		//687 --> 786
    	int n=687;
    	System.out.println("\nReverse no of: "+n);
    	int j, k, l, m, o;
    	
    	j=n/100;
    	k=n - j*100;
    	l=k/10;
    	m=k-l*10;
    	o=m*100 + l*10 + j;
    	System.out.println(o);
	}
    public void fibonacciSeries() {
		//0, 1, 1, 2, 3, 5, 8...
    	int n=13;
    	int a=0;
    	int b=1;
    	int c;
    	
    	System.out.println("\nFibonacci series of no: "+n);
    	for(int i=1; i<=n; i++) {
    		System.out.print(a +" ");
    		c=a+b;
    		a=b;
    		b=c;
    	}
    	}
    public void reverseStringWord() {
    	System.out.println("\nReverse word: ");
    	String org = "ABCD"; 
    	 String rev = ""; 
    	 
    	 for(int i =org.length()-1; i>=0; i--) 
    	 { 
    	 rev = rev + org.charAt(i); 
    	 } 
    	 
    	 System.out.println("Orginal String = "+org); 
    	 System.out.println("Reverse String = "+rev); 
	}
    
    public void reverseStringSentence() {
    	
    		System.out.println("\nReverse Sentence: ");
    		StringBuilder a = new StringBuilder("Don't take revenge. let Karma do all the work");
    		System.out.println(a);
    		 System.out.println(a.reverse());
    		 System.out.println(a);
    		}

    
	public static void main(String [] args) {
		LogicalProgramming b = new LogicalProgramming();
		b.armstrongNo();
		b.averageNo();
		b.EvenOddNo();
		b.fibonacciSeries();
		b.naturalNo();
		b.palindromicNo();
		b.PositiveNegativeNo();
		b.primeNo();
		b.reverseNo();
		b.reverseStringWord();
		b.reverseStringSentence();
		
	}
}
