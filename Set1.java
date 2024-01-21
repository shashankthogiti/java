package Collections.java;

import java.util.Set;

//The java framework provides a set of interface and classes to work with collection.

public class Set1 {

//Set is an interface in the java collections Framework that represents an unordered collection unique elements.

	public static void main(String[] args) {
		
		Set<String> set = Set.of("Apple", "Banana");
		System.out.println(set);

		Set setAutoBoxing = Set.of("A", 'A', 20, 20.25);
		System.out.println(setAutoBoxing);

	}

}
