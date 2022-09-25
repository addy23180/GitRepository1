package programBySir;

public class MultipleCatchBlock {
public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
		    System.out.println(c);
		}
		
		catch(ArithmeticException f) //child
		{
			f.printStackTrace();
			System.out.println("9999");
		}
	
		catch(Exception f)  //parent
		{
			f.printStackTrace();
			System.out.println("1119");
		}
	}
}
