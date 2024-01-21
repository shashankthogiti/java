package Collections.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//The java framework provides a set of interface and classes to work with collection.

public class Map2 {

//Map interface is a part of java collection framework and it is a key-value pair, where each key is associated with one vlaue.

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
		System.out.println(map);

		// The Map interface is classified in to 3 types:
		// 1.HashMap
		// 2.TreeMap
		// 3.LinkedHashMap

		// 1.HashMap:HashMap is a class that implements the Map interface and is part of
		// java collection Framework. It provides a collection of key-value pair where
		// each key is associated with specific values.

		System.out.println("HashMap:");
		Map<String, Integer> HM = new HashMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(HM);
		HM.put("C", 8);// add
		System.out.println(HM);
		HM.get("A");// getting value from key
		System.out.println(HM);
		HM.remove("A", 3);// removing
		System.out.println(HM);

		// 2.TreeMap:TreeMap is a class that implements the Navigable Map interface and
		// extends the Abstract Map class.

		System.out.println("TreeMap");
		Map<String, Integer> TM = new TreeMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(TM);
		TM.put("C", 8);// add
		System.out.println(TM);
		TM.get("A");// getting value from key
		System.out.println(TM);
		TM.remove("A", 3);// removing
		System.out.println(TM);

		// 3.LinkedHashMap:Linked HashMap is a class that extends HashMap andimplements
		// Map interface. It is a part of java collection framework and maintain the
		// order of insertion of element

		System.out.println("LinkedHashMap:");
		Map<String, Integer> LHM = new LinkedHashMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(LHM);
		LHM.put("C", 8);// add
		System.out.println(LHM);
		LHM.get("A");// getting value from key
		System.out.println(LHM);
		LHM.remove("A", 3);// removing
		System.out.println(LHM);

	}

}
