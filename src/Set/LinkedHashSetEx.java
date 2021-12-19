package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

		/*
		 LinkedHashSet has following Features:
- No Duplicate values
 - Iteration order maintained
 - Permits null value
 - Implements Set Interface, extends HashSet Class
 - Not Synchronized
 - Underlying Data structure is HashTable & Doubly Linked List
 - Internal Working is based on HashMap
 - Initial Capacity 
 - Load Factor = Number of elements present / Size of HashTable
 - Default initial capacity is 16 & load factor is 0.75
 - LinkedHashSet h = new LinkedHashSet();
 - LinkedHashSet h = new LinkedHashSet(int initialCapacity); 
 - LinkedHashSet h = new LinkedHashSet(int initialCapacity, float loadFactor);
		 */
	public static void main(String[] args) {

		Set<String> s = new LinkedHashSet<String>();
		s.add("Philip");
		s.add("John");
		s.add("Ben");
		s.add("Anna");
		System.out.println(s);	
        
        for(String a : s) {
        	System.out.println(a);
        }

	}

}
