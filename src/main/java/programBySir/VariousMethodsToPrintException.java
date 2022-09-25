package programBySir;

public class VariousMethodsToPrintException {
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
		    System.out.println(c);
		}
		
		catch(ArithmeticException e) 
		{
			e.printStackTrace(); //best or most preferred way to print exception
			//ExceptionName
			//description
			//stackTrace
			
			System.out.println("==========");
			
			
			System.out.println(e);
			//ExceptionName
			//description
			
           System.out.println("==========");
			
			
           System.out.println(e.getMessage());
			//description
			
		}
	}
}
