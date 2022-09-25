package collection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class SetHashSet {
	public void hashset() {
		HashSet h = new HashSet();
		
		h.add("hashset");
		h.add(17);
		h.add('?');
		h.add(null);
		h.add(true);
		h.add(false);
		h.add(17);
		
		System.out.println("Hashset using different Methods of hashset: ");
		
		System.out.println(h);
		
		System.out.println(h.size());
		
		System.out.println(h.isEmpty());
		
		System.out.println(h.remove('?'));
		System.out.println(h);
		
		System.out.println(h.contains("hashset"));
		
		System.out.println("\nFor loop starts");
		for(Object o:h) {
			System.out.println(o);
		}
		/* for(int j=0; j>=5; j++) {
			System.out.println(h.get(j));
		}
		*/
		System.out.println("\nIterator starts");
		Iterator it = h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		System.out.println("\nList Iterator starts");
		ListIterator li = (ListIterator) h.iterator();
		while(li.hasNext()) {
			System.out.println(li);
		}
		
		System.out.println("\nEnumeration starts");
		Enumeration en = (Enumeration) h.parallelStream();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		*/	
	}
	public static void main(String [] args) {
		SetHashSet t = new SetHashSet();
		t.hashset();
	}
}
