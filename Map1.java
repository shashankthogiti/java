package Collections.java;

import java.util.Map;

//The java framework provides a set of interface and classes to work with collection.

public class Map1 {

//Map interface is a part of java collection framework and it is a key-value pair, where each key is associated with one vlaue.

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
		System.out.println(map);

		Map mapAutoBoxing = Map.of("A", 3, 'B', 5, "Z", 10, 1, 2, 3, 4, 5, 88, 889, 852);
		System.out.println(mapAutoBoxing);

	}

}
