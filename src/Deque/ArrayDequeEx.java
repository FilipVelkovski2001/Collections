package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	/*
	 A collection that can be used as a Stack or a Queue
	 - It means a "double-ended queue" (and is pronounced deck) 
	 - A queue provides FIFO(first in, first out) operations:
	    - add (e) and remove() methods
	 - A stack provides LIFO(last in, first out) operations:
	    - push(e) and pop() methods   
	 */

	public static void main(String[] args) {
		Deque<String> s = new <String>ArrayDeque();
		//We add elements by using the push method
		
		s.push("Hi");
		s.push("Woorld");
		s.push("Wassup");
		s.push("My name is");

	}

}
