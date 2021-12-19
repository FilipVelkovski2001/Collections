package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

		/*
		 Java TreeMap class is a red-black tree based implementation.
		 It provides an efficient means of storing key-value pairs in sorted order.
         The important points about Java TreeMap class are:
         - Java TreeMap contains values based on the key. 
         - It implements the NavigableMap interface and extends AbstractMap class.
         - Java TreeMap contains only unique elements.
         - Java TreeMap cannot have a null key but can have multiple null values.
         - Java TreeMap is non synchronized.
         - Java TreeMap maintains ascending order.
		 */
		
		Map<String, Integer> i = new TreeMap<String, Integer>();
		i.put("First: ", 12);
		i.put("Second: ", 24);
		i.put("Third: ", 35);
		i.put("Fourth: ", 31);

		System.out.println(i);
		
	}

}
