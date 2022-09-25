package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListLinkedList {
	LinkedList listA = new LinkedList();
	public void LL() {
		System.out.println("LinkedList: ");
		//LinkedList listA = new LinkedList();
		
		listA.add("Makad");
		listA.add(71);
		listA.add('A');
		listA.add('7');
		listA.add("Adu");
		listA.add(null);
		listA.add(36);
		
		
		System.out.println("\nWhole LinkedList: ");
		System.out.println(listA);
		
		System.out.println("\nSize of LinkedList: ");
		System.out.println(listA.size());
		
		System.out.println("\nRemove the value specified at index 3 i.e. Adu: ");
		listA.remove(3);
		System.out.println(listA);
		
		//by using peek method we can fetch the value and it will remain there in LINKEDLIST
		System.out.println("\nFetch the value from given LinkedList: ");
		System.out.println(listA.peek());//this method will fetch by default First value
		System.out.println(listA);
		
		System.out.println("\nFetch the 1st value from given LinkedList:");
		System.out.println(listA.peekFirst());
		System.out.println(listA);
		
		System.out.println("\nFetch the last value from given LinkedList:");
		System.out.println(listA.peekLast());
		System.out.println(listA);
		
		//by using poll method we can fetch the value but it will get removed from LINKEDLIST
		System.out.println("\nFetch the value from given LinkedList:");
		System.out.println(listA.poll());//this(POLL) method will fetch by default First value and removes from LINKEDLIST 
		System.out.println(listA);
		
		System.out.println("\nFetch the 1st value from given LinkedList: ");
		System.out.println(listA.pollFirst());
		System.out.println(listA);
		
		System.out.println("\nFetch the last value from given LinkedList: ");
		System.out.println(listA.pollLast());
		System.out.println(listA);
		
		System.out.println("\n Poll LinkedList: ");
		System.out.println(listA.pop());//this(POp) method will fetch by default First value and removes from LINKEDLIST
		System.out.println(listA);
		
		System.out.println("\nClear LinkedList: ");
		listA.clear();
		System.out.println(listA);
	}
	
	public void usingForLoop() {
		System.out.println("LinkedList using for loop: ");
    LinkedList listB = new LinkedList();
	   
		listB.add(71);
		listB.add('A');
		listB.add('7');
		listB.add(true);
		listB.add(false);
		listB.add("Adu");
		listB.add(null);
		listB.add(36);
		listB.add("Makad");
		listB.add(96.96f);
		listB.add('7');
		
		
		for(Object b:listB){
	    	System.out.print(b +" ");
	    }
		System.out.print("\n\n");
		for(int i = 0; i<=10; i++) {
			
			System.out.println(listB.get(i));
		}
	        
		System.out.println("LinkedList using Iterator: ");
		System.out.print("\n\n");
		Iterator it = listB.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println("LinkedList using ListIterator: ");
		System.out.print("\n\n");
		ListIterator li = listB.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
	public static void main(String [] args) {
		System.out.print("\n\n");
		ListLinkedList L = new ListLinkedList();
		L.LL();
		L.usingForLoop();
		//L.usingIterator();
		//L.usingListIterator();
	}

}
