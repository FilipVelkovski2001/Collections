package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	/*
	 TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage.
	 The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided.
	 This must be consistent with equals if it is to correctly implement the Set interface. 
	 */
	
	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(15);
		a.add(29);
		a.add(39);
		a.add(49);
		a.add(68);
		
		a.remove(29);
		
		System.out.println(a.isEmpty()); 
		
		System.out.println(a);
		
		a.clear();
		
	}

}
