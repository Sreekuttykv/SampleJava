package collectionExample;

import java.util.HashMap;
import java.util.Map;

public class MapDuplicate {

	public static void main(String[] args) {
	
		 int[] values = {10, 20,60, 30, 10, 50, 60,60};
	        int position = 2;

	        // Step 1: Find the repeating value and count its occurrences
	        Map<Integer, Integer> countMap = new HashMap<>();
	        for (int value : values) {
	            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
	        }

	        System.out.println("Repeating values and their counts:");
	        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " repeats " + entry.getValue() + " times");
	            }
	        }

	        // Step 2: Print values from the given position circularly
	        System.out.println("Values starting from position " + position + ":");
	        int n = values.length;
	        for (int i = 0; i < n; i++) {
	            System.out.print(values[(position + i) % n] + " ");
	        }
	    }
	

	}


