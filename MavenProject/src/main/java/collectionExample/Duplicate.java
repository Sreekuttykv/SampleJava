package collectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(23);
		list1.add(10);
		list1.add(23);
		list1.add(7);
		list1.add(3);
		list1.add(4);
		list1.add(7);
		list1.add(23);
		list1.add(23);
		
		
		Set<Integer> s=new HashSet<>();    //Purpose: To keep track of all unique integers encountered while iterating through the list.
		Set<Integer> repeat=new HashSet<>(); //To store integers that are found to be duplicates in the list.
		
	  int count=1;   
		for (int i : list1) 
		{
	        if (!s.add(i)) 
	        {
	        	repeat.add(i);
	        	count++;
	        	
	        }
	     }
		
		
		System.out.println("Repeating values:");
        for (int i : repeat) {
            System.out.println("Value: " + i+"and count:"+count);
        }
        
        int position=2;
        System.out.println("Values from position " + position + ":");
        for (int i = position; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        for (int i = 0; i < position; i++) {
            System.out.print(list1.get(i) + " ");
        }
        
	}

}
