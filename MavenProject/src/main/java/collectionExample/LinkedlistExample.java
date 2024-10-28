package collectionExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistExample {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("Red");
		l.add("Green");
		l.add("Yellow");
		l.add("White");
		l.addFirst("Green");  //allows duplicate
		l.addLast("pink");
		System.out.println(l);
		l.remove("pink");
		
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
		
		
		LinkedList l2=new LinkedList();
		l2.add("apple");
		l2.add("grapes");
		l2.add("pineapple");
		l.addAll(l2);
		System.out.println(l);
		
		ArrayList l3=new ArrayList();
		
		
		
	}

}
