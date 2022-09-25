package collection;

public class PracticeArray1 {
	public void secondLast() {
		int num[] = {1,2,3,4,5,6,7,8,9};
		int n = num.length;
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			if(num[i]>highest) {
				highest=secondHighest;
				secondHighest=num[i];
			}
		}
	}
	public static void main(String [] args) {
		PracticeArray1 t = new PracticeArray1();
		t.secondLast();
	}

}
