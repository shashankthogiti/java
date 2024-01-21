package Collections.java;

//The java framework provides a set of interface and classes to work with collection.

import java.util.List;

public class List1 {

//List is an interface thatt extends the collection interface. It represent an ordered collection of elements.

	public static void main(String[] args) {

		List<String> list = List.of("apple", "Banana");
		System.out.println(list);

		List listAutoBoxing = List.of("A", 'A', 20, 20.25);
		System.out.println(listAutoBoxing);
	}

}
