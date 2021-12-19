package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetEx {

	public static void main(String[] args) {
		
		/*
		 HashSet is a collection of items where every item is unique.
		 Implements Set Interface.
         The underlying data structure for HashSet is Hashtable.
         As it implements the Set Interface, duplicate values are not allowed.
         Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
         NULL elements are allowed in HashSet.
         HashSet also implements Serializable and Cloneable interfaces.
		 */
		
		Set<String> h = new HashSet<String>();
		
		//The HashSet class has many useful methods. For example, to add items to it, use the add() method:
		h.add("Lemur");
		h.add("Orangutan");
		h.add("Chimp");
		h.add("Monkey");
		h.add("Spider-Monkey");
		
		//To remove an item, use the remove() method:
		h.remove("Monkey");
		
		System.out.println(h.contains("Spider-Monkey"));
		
		System.out.println(h.size());
		
		h.remove("Lemur");
		
		System.out.println(h);
		
		//To clear an item, use the clear() method:
		h.clear();
		
		Set<Integer> a = new HashSet<Integer>();
		a.add(13);
		a.add(35);
		a.add(39);
		a.add(98);
		a.add(45);
		
		//Using the Iterator to iterate through the HashSet
		Iterator<Integer> it = a.iterator();
		
		//What we are doing here is we are basically telling the while loop while it has a next element do this
		while(it.hasNext()) {
			
			//And here we are telling it to just print out the next value
			System.out.println(it.next());
		}

	}

}
