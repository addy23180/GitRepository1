package collection;

import java.util.ArrayList;

public class PracticeArray {
	public void reapetedString() {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("H");
		a.add("e");
		a.add("l");
		a.add("l");
		a.add("o");
		a.add("W");
		a.add("o");
		a.add("r");
		a.add("l");
		a.add("d");
		
		System.out.println(a.size());
		
		a.remove("l");
		System.out.println(a);
		
		a.remove("o");
		System.out.println(a);
		
		a.remove(4);
		System.out.println(a);
	}
	public static void main(String [] args) {
		PracticeArray t = new PracticeArray();
		t.reapetedString();
	}

}
