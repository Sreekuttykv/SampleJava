package collectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {
		
		
	System.out.println("List");	
	List list2=new ArrayList();
	System.out.println(list2.isEmpty());
	list2.add("ammu");
	list2.add(34);
	list2.add('c');
	list2.add("meera");
	System.out.println(list2);
	System.out.println(list2.size());
	
	List<String> list9=new ArrayList();
	list9.add("45");
	
	  
	
		
	System.out.println("ArrayList");	
	System.out.println("Generic collection");
	ArrayList<String> l=new ArrayList<String>();
	l.add("12");
	l.add(0, null);
	l.add("Orange");
	l.add("Grapes");
	
	System.out.println(l);
	System.out.println(l.contains("mango"));
	
	
	
	
	System.out.println("Non Generic collection");
	ArrayList list=new ArrayList();
	list.add(23);
	list.add("car");
	list.add('v');
	System.out.println(list);
	
	
	
	System.out.println("List of primitive data type float");
	ArrayList<Float> l3=new ArrayList<Float>();
	l3.add(0.5f);
	l3.add(7.4f);
	l3.add(1.8f);
	l3.add(5.9f);
	
	System.out.println(l3);
	
	
	System.out.println("List of primitive data type Integer");
	ArrayList<Integer> l4=new ArrayList<Integer>();
	l4.add(34);
	l4.add(7);
	l4.add(14);
	l4.add(5);
	System.out.println(l4);
	Collections.sort(l4);
	System.out.println(l4);
	
	
	System.out.println("List using for each loop");
	for(int element:l4)          //for generic only
	{
		System.out.println(element);
	}
	
	
	
	
	
	ArrayList<String> l2=new ArrayList<String>();
	l2.add("Apple");
	l2.add("Orange");
	l2.add("Watermelon");
	l2.add("Pineapple");
	l2.add(null);
	l2.add(null);
	l2.add(null);
	
	

	System.out.println(l.contains("Grapes"));
	
	
	
	System.out.println("List using for loop");
	for(int i=0;i<l.size();i++)
	{
	
		System.out.println(l.get(i));
	}
	
	
	
	
	System.out.println("List using for each loop");
	for(String element:l)          //for generic only
	{
		System.out.println(element);
	}
	
	
	
	
	ArrayList ls=new ArrayList();
	ls.add("hii");
	ls.add(5475); 
	ls.add('k');
	Iterator iter=ls.iterator();
	while(iter.hasNext())
	{
		System.out.println("i"+iter.next());
	}
	iter.remove();
	System.out.println("After using iterator remove"+ls);
	
	
	
	
	
	Iterator<Integer> ite=l4.iterator();
	while(ite.hasNext())
	{
		System.out.println(ite.next());
	}	
	 ite.remove();
	
	
	list.addAll(l);      
	System.out.println("List:"+ls); 
	System.out.println("List:"+l); 
	list.add("orange");
	
	
	System.out.println("Remove All");
	System.out.println("List1:"+l);
	System.out.println("List2:"+list);
	l.removeAll(list);
	System.out.println("After removing list1"+l);
	System.out.println("After removing list2"+list);
	
	
	
	
	l.remove("Apple");
	
	System.out.println("After deletion List:"+l);
	
	l.add("Mango");
	l.add("Banana");
	
	
	Collections.sort(l);
	System.out.println("Sorted List:"+l);
	
	

	System.out.println("Getting element:");
	System.out.println(l.get(0));
	
	
	System.out.println("List:"+l);
	System.out.println("Setting element:");
	l.set(1,"Manu");// It replace the element of a particular location
	System.out.println("List:"+l);
	
	
	
	System.out.println(l.size());
	
	
	
	
	System.out.println("*****SET*****");
	
	HashSet<String> s=new HashSet<String>();
	s.add("Benz");
	s.add("Mini Cooper");
	s.add("Audi");
	s.add("BMW");
	System.out.println(s);
	
	
	
	
	HashSet set=new HashSet();
	set.add("23");
	set.add(79);
	set.add(null);
	set.add(null);
	System.out.println(set);
	
	
	HashSet<String> set1=new HashSet<String>();
	set1.add("apple");
	set1.add("orange");
	set1.add("mango");
	set1.add("grapes");
	set1.add("Benz");     
	System.out.println(set1);
	
	

	System.out.println("Set using iterator");
	
	Iterator<String>i=s.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	i.remove();
	System.out.println("After Deletion"+s);
	
	
	
	
	s.remove("Audi");
	System.out.println("After removing element:"+s);
	s.remove(1);   //index won't work
	System.out.println("After removing index:"+s);
	//s.get(0);   get and set methods not available in set
	//s.set(1,"hi");
	
	
	s.add("Range Rover");
	System.out.println(s);
	
	
	
	
	System.out.println(s.size());
	
	
	//Collections.sort(set1);  No sort method
	
	
	System.out.println("addAll Method");
	set1.addAll(s);
	System.out.println(set1);
	System.out.println(s);
	
	
	
	System.out.println("removeAll Method");
	set1.removeAll(s);       //elements are case sensitive benz won't work
	System.out.println(set1);
	System.out.println(s);
	
	
	
	System.out.println(set1.contains("mango"));
	
	Set s3=new HashSet();
	
	Set<String> s2=new HashSet();
	
	Set<Integer> s8=new HashSet<Integer>();
	s8.add(1);
	}
	

}
