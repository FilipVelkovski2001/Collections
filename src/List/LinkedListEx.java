package List;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		/*
		 LinkedList vs ArrayList:
		 
		 - LinkedList can also be used as a Stack and a Queue.
		 - It is a very flexible data structure its called a LinkedList because each value of a list knows the -
		   back and the front and the next element. 
		 - Both ArrayList and LinkedList are implementation of List interface in Java.
		 - Both classes are non-synchronized. But there are certain differences as well.
		 
         Following are the important differences between ArrayList and LinkedList method: 
         - Internal Implementation:
         
             - ArrayList internally uses a dynamic array to store its elements.
             - LinkedList uses Doubly Linked List to store its elements.
             
         - Manipulation: 
         
             - ArrayList is slow as array manipulation is slower.
             - LinkedList is faster being node based as not much bit shifting required.
             
         - Implementation: 
         
             - ArrayList implements only List.
             - LinkedList implements List as well as Queue. It can acts as a queue as well.
             
         - Access: 
        
             - ArrayList is faster in storing and accessing data.
             - LinkedList is faster in manipulation of data.
		 */
		
		List<Integer> nums = new LinkedList();
		
		//We can add to a linked list.
		nums.add(15);
		nums.add(21);
		nums.add(34);
		nums.add(39);
		nums.add(68);
		
		//We can remove from a linked list.
	    nums.remove(3);
	    
	    //We can clear the list.
	    nums.clear();
		
		System.out.println(nums);
		

	}

}
