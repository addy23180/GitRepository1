package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetLinkedHashset {
	public void linked_hashset() {
		LinkedHashSet lh = new LinkedHashSet();
		
		lh.add(200);
		lh.add('!');
		lh.add("Syndrella");
		lh.add(true);
		lh.add(false);
		lh.add(null);
		lh.add(06.09);
		lh.add(200);
		
		System.out.println(lh);
		
		System.out.println(lh.contains("Where is my prince charming"));
		
		System.out.println(lh.isEmpty());
		
		lh.remove(null);
		System.out.println(lh);
		
		System.out.println(lh.add(lh));
		
		System.out.println("\nFor loop starts");
		for(Object o : lh) {
			System.out.println(o);
		}
		/* for(int j=0; j>=3; j++) {
			System.out.println(o.get(j));
		}
		*/
		System.out.println("\nIterator starts");
		Iterator it = lh.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		lh.clear();
		System.out.println(lh);
		
	}
	public static void main(String [] args) {
		SetLinkedHashset t = new SetLinkedHashset();
		t.linked_hashset();
	}
}
