package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {
	public void priority() {
		PriorityQueue pq = new PriorityQueue();
		
		pq.add("abc");
		pq.add("ijk");
		pq.add("lmn");
		pq.add("abcd");
		pq.add("abcef");
		pq.add("pqr");
		pq.add("xyz");
		
		System.out.println("\nWhole list");
		System.out.println(pq);
		
		System.out.println("\nSize of list");
		System.out.println(pq.size());
		
		System.out.println("\nIs list Empty?");
		System.out.println(pq.isEmpty());
		
		System.out.println("\nPoll method");
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println("\nremove abcdef from the list: ");
		pq.remove("abcdef");
		System.out.println(pq);
		
		System.out.println("\nPeek method");
		System.out.println(pq.peek());
		System.out.println(pq);
		
		System.out.println("\nElement method"); //peek and element are same methods
		System.out.println(pq.element());
		System.out.println(pq);
		
		System.out.println("\nFor loop starts");
		for(Object o:pq) {
			System.out.println(o);
		}
		
		System.out.println("\nIterator starts");
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		pq.clear();
		System.out.println(pq);
	}
	public static void main(String [] args) {
		Priority t = new Priority();
		t.priority();
	}

}
