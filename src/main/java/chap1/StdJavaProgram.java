package chap1;

public class StdJavaProgram {
	//Declaration
	//Using all data types
	static String name;  //needs to provide with ""
	int a;               //range of int = -2147483648 to +2147483647
	short b;             //range of short = -32768 to +32767
	static byte c;              //range of byte = -128 to +127
	long d;              //range of long = used store value grater than int, needs to provide with suffix l or L
	double e;            //range of = unlimited and used to store value in decimal or point, doesn't affect whether suffix is provided or not. Requires more memory
	static char f;              //can store only one character, which needs to provide with ''
	boolean g;           //can store only true or false
	float h;             //range of = unlimited and used to store value in decimal or point, needs to provide suffix as f, requires less memory
	
	//Initialization
	public static  void m1() {
		name="Games Gosling";
		System.out.println("Java language is Invented by: " +name);
		c=23;
		System.out.println("and it's first version released on : " +c +"rd Jan");
		char f = 'a';
		System.out.println("The initial of alphabate: " +f);
	}
	public void m2() {
		int a = 1996;
		System.out.println("The first version of java language is released in: " +a);
		long d = 741236985248l;
		System.out.println("We can use long data type to describe adhar no like: " +d);
		boolean g = 11<21;
		System.out.println("11<21: " +g);
	}
	public StdJavaProgram() {
		short b = 1991;
		System.out.println("Firstly Games gosling and his team start working on the Project of Java Language in: " +b);
	    double e = 18.1;
	    System.out.println("The latest version of java: " +e);
	    float h = 62.63f;
	    System.out.println(h);
	}
	//Usage
    public static void main(String [] args) {
    	StdJavaProgram t = new StdJavaProgram();
    	m1();
    	t.m2();
    }
}
