package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		/*
		ArrayList:
		- Array List is an implementation of the List Interface.
		- The List automatically grows in size even if the elements exceed initial size.
		- Has a numeric index.
	    - Elements are accessed by index.
	    - Elements can be overwritten, deleted or added.
	    - Allows duplicate items.
		*/
		
		
		List<String> list1 = new ArrayList();
		
		//We can add elements to Array List
		list1.add("Jake");
		list1.add("Frank");
		list1.add("John");
		list1.add("Ben");
		list1.add("Anne");
		
		//We can remove elements from Array List. 
		list1.remove(0);
		
		//We can add alements to a specified index.
		list1.add(0, "New String at index 0");
		list1.add(2, "New String at index 2");
		
		
		//Iterating is done the same way as a normal Array.
		for(String list : list1 ) {
			System.out.println(list);
		}
		
		//We can also do a lot more things by using the methods offered by our list.
		
	}

}
