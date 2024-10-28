package collectionExample;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;

public class Colors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("Red");
		ls.add("Green");
		ls.add("Blue");
		ls.add("Black");
		ls.add("Yellow");
		System.out.println("Array List:"+ls);
		
		
		System.out.println("Enter the index of the element which you want to retreive:");
		int index=sc.nextInt();
		String element=ls.get(index);
		System.out.println("Element at the Given Index:"+element);
		
		System.out.println("List iteration using iterator:");
		Iterator<String>it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		System.out.println("Element removing...");
		System.out.println("Enter the element you want to remove:");
		String n=sc.next();
		ls.remove(n);
		System.out.println("List after removing the element:"+ls);
		
		
		System.out.println("Element Searching..");
		System.out.println("Enter the element you want to search:");
		String e=sc.next();
		if(ls.contains(e))
		{
			System.out.println("element found ");
		}
		else
		{
			System.out.println("Element not found");
		}
		

	}

}

