package chap1;

public class AllConditionalStmntTogether {
	int a=5;
	int b =7;
	int c = 9;
	int marks = 30;
	int rainbow=3;
	public void conditional() {
		System.out.println("Checking statement for git");
		//1.If statement
		if(a<b) {
			System.out.println("1.Provided If condition is true");
		}
		//2.Nested if
		if(a<b) {
			if(c>b) {
				System.out.println("2.Provided If condition of outer block is true");
			}
			System.out.println("2.Provided If condition of inner block is true");
		}
		//3.if else
		if(c<b) {
			System.out.println("3.Provided If condition of outer block is true");
		}
		else {
			System.out.println("3.Provided If condition is false therefore else block get Executed");
		}
		//4. if else if
		if(c<b) {
			System.out.println("4.If block condition is true therefore else if block wil get automatically skipped");
		}
		else if(marks>=40 || marks<=50) {
			System.out.println("4.if block condition is false therefore else block is get Excuted");
		}
		//5.switch statement
		switch (rainbow) {
		
		case 1 : System.out.println("5.Red");break;
		case 2 : System.out.println("5.Orange");break;
		case 3 : System.out.println("5.Yellow");break;
		case 4 : System.out.println("5.Green");break;
		case 5 : System.out.println("5.Blue");break;
		case 6 : System.out.println("5.White");break;
		case 7 : System.out.println("5.Lavender");break;
		}
		
	}
	public static void main(String [] args) {
		AllConditionalStmntTogether t = new AllConditionalStmntTogether();
		t.conditional();
	}

}
