package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListVector {
	public void vector() {
		Vector LV = new Vector();
		
		LV.add(1000);//0
		LV.add("VECTOR");//1
		LV.add('V');//2
		LV.add(1000);//3
		LV.add(null);//4
		LV.add(71.32);//5
		LV.add("VECTOR 1");//6
		LV.add('A');//7
		LV.add(null);//8
		LV.add(60.90f);//9
		
		System.out.println(LV);
		
		System.out.println(LV.size());
		
		System.out.println(LV.capacity());
		
		LV.remove(4);
		System.out.println(LV);
		
		LV.add(4, "super");
		System.out.println(LV);
		
		System.out.println("\nFor loop starts");
		for(Object o:LV) {
			System.out.println(o);
		}
		for(int i=0; i>=5; i++) {
			System.out.println(LV.get(i));
		}
		
		System.out.println("\nIterator");
		Iterator i = LV.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\nList Iterator");
		ListIterator li = LV.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("\nEnumeration");
		Enumeration en = LV.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
	public static void main(String [] args) {
		ListVector t = new ListVector();
		t.vector();
	}
}
