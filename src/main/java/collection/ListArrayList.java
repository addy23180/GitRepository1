package collection;
import java.util.ArrayList;
public class ListArrayList {
	
	public void arrayList() {
		
		ArrayList list = new ArrayList();
		System.out.println("ArrayList: ");
		list.add("abc"); //array with double qoute
		list.add('A');//char
		list.add(786);//no
		list.add(111);//no
		list.add("xyz");//array with double qoute
		list.add(null);//array with null
		list.add(null);//array with null
		
		//1.to print the whole list
		System.out.println(list);
		
		//2.to get the size of list
		System.out.println(list.size());
		
		//3.to get the value available at given index
		System.out.println(list.get(3));
		
		//4.to set the value given at provided index
		list.set(6, "jkl");
		System.out.println(list);
		
		//5.to remove the provided index value
		list.remove(2);
		System.out.println(list);
		
		//6.to check whether the given list is empty  
		System.out.println(list.isEmpty());
		
		//7.to check whether the value contains at provided index
		System.out.println(list.contains("pqr"));
		System.out.println(list.contains("xyz"));
		
		//8.to clear or delete the data
		list.clear();
		System.out.println(list);
	}
	
	public void arrayListInteger() {
		//int array[] = new int[5];
		
		//Integer, String, Float, Boolean
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println("\nArrayList with only Integer: ");
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(null);
		list1.add(null);
		list1.add(70);
		
		//to print the whole list
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		System.out.println(list1.isEmpty());
		
		list1.set(3, 8);
		System.out.println(list1);
		
		list1.remove(3);
		System.out.println(list1);
		
		//System.out.println(list1.get(5));
		
		System.out.println(list1.contains(2));
		
		list1.clear();
		System.out.println(list1);
		
	}
	
	public void arrayListString() {
		ArrayList<String> list2 = new ArrayList<String>();
		System.out.println("\nArrayList with only String: ");
		
		list2.add("abc");
		list2.add("xyz");
		list2.add("pqr");
		list2.add("jklm");
		list2.add("opq");
		list2.add(null);
		
		list2.clone();
		System.out.println(list2);
		
		System.out.println(list2.size());
		
		System.out.println(list2.contains("ijk"));
		
		System.out.println(list2.isEmpty());
		
		list2.set(0, "abcd");
		System.out.println(list2);
		
		list2.remove("xyz");
		System.out.println(list2);
		
		list2.clear();
		System.out.println(list2);
	}
	
	public void arrayListFloat() {
		ArrayList<Float> list3 = new ArrayList<Float>();
		System.out.println("\nArrayList with only Float: ");
		list3.add(null);
		list3.add(1.0f);
		list3.add(2.0f);
		list3.add(3.0f);
		list3.add(4.0f);
		list3.add(5.0f);
		
		System.out.println(list3);
		
		System.out.println(list3.size());
		
		System.out.println(list3.contains(7.0f));
		
		list3.remove(2.0f);
		System.out.println(list3);
		
		list3.set(3, null);
		System.out.println(list3);
		
		System.out.println(list3.isEmpty());
		
		list3.clear();
		System.out.println(list3);
	}
	
    public void arrayListBoolean() {
		ArrayList<Boolean> list4 = new ArrayList<Boolean>();
		System.out.println("\nArrayList with only Boolean: ");
		
		list4.add(true);
		list4.add(false);
		
		System.out.println(list4);
		
		System.out.println(list4.size());
		
		list4.remove(1);
		System.out.println(list4);
		
		System.out.println(list4.contains(false));
		
		list4.set(0, false);
		System.out.println(list4);
		
		System.out.println(list4.isEmpty());
		
		list4.clear();
		System.out.println(list4);
	}
	
	public static void main (String [] args) {
		ListArrayList a = new ListArrayList();
		a.arrayList();
		
		a.arrayListInteger();
		a.arrayListString();
		a.arrayListFloat();
		a.arrayListBoolean();
	}
}
