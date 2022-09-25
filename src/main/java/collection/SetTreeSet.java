package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSet {
	public void treeSet() {
		TreeSet tc = new TreeSet();
		
	   // tc.add(777); //integer can not be cast in treeset
	   // tc.add('$'); //Character can not be cast in treeset
	   // tc.add(null); //null can not be cast in treeset it will throw NullPointerException
	   //  tc.add(true); //boolean can not be cast in treeset
	   // tc.add(false); //boolean can not be cast in treeset
	   // tc.add(22.22); //double can not be cast in treeset
		
		tc.add("tree set");
		tc.add("linked hashset");
		tc.add("hash set");
		tc.add("array list");
		tc.add("linked list");
		tc.add("vector");
	    
		System.out.println(tc);
		
		System.out.println(tc.size());
		
		//System.out.println(tc.add(tc));
		
		System.out.println(tc.isEmpty());
		
		System.out.println(tc.pollFirst());
		
		System.out.println(tc.pollLast());
		
		System.out.println("\nFor loop starts");
		System.out.println("\nFor loop -1");
		for(Object o : tc) {
			System.out.println(tc);
		}
		System.out.println("\nFor loop -2");
		for(Object o : tc) {
			System.out.println(o);
		}
		/*	System.out.println("\nFor loop -3");
		for(int i=0; i<=3; i++) {
			System.out.println(tc.get(i));
		}
		*/
		System.out.println("\nIterator starts");
		Iterator it = tc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		tc.clear();
		System.out.println(tc);
	}
	public static void main(String [] args) {
		SetTreeSet t = new SetTreeSet();
		t.treeSet();
	}

}
