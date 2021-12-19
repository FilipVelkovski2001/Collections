package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
public static void main(String[] args) {
	/*
	Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique.
	- Java HashMap contains values based on the key.
    - Java HashMap contains only unique keys.
    - Java HashMap may have one null key and multiple null values.
    - Java HashMap is non synchronized.
    - Java HashMap maintains no order.
    - The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
    - K: It is the type of keys maintained by this map.
    - V: It is the type of mapped values.
	 */
	
	
	//When creating a HashMAp you have to put a key type and value type inside of the diamond operators 
	Map<String, Integer> h = new HashMap<String, Integer>();
	h.put("a", 10);
	h.put("b", 3);
	h.put("c", 88);

	//You can get a key or a value
	System.out.println(h.get("c"));

	System.out.println(h);

	Map<String, String> fun = new HashMap<String, String>();
	fun.put("BobJoe996", "Fluffyponies");
	fun.put("FunGuy31", "FunGuy@776");
	fun.put("JonJones23", "BonesMeats");
	fun.put("GSP321", "RushStPierre23");
	
	//You can remove a key or value from a HashMap
	fun.remove("FunGuy31");

	//You can replace a key or a value from a HashMap
	fun.replace("GSP321", "RushStPierre141415");
	
	System.out.println(fun);

	//You can check if a value is inside of a HashMap
	System.out.println(fun.containsValue("Fluffyponies"));
	
	//You can print out the keys only
	System.out.println(fun.keySet());
  }
}
