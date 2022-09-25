package programBySir;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			int c = a/b;
		    System.out.println(c);
		}
		
		catch(ArithmeticException f) 
		{
			f.printStackTrace();
			
		}
		
		finally
		{
			System.out.println("Program execution completed");
		}
	}
}
