package Collections.java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//The java framework provides a set of interface and classes to work with collection.

public class Set2 {

//Set is an interface in the java collections Framework that represents an unordered collection unique elements.

	public static void main(String[] args) {
		
		Set<String> set = Set.of("Apple", "Banana");
		System.out.println(set);

		// we can not change or update the Set values.
		// The set are classified in to 3 types

		// 1.HashSet
		// 2.LinkedHashSet
		// 3.TreeSet

		// 1.HashSet:HashSet is a class that implementsthe set interface which is part
		// of java collection framework. It represents an unordered collection unique
		// elements and it doesnot duplicate
		
		System.out.println("HashSet:");
		Set<String> HS = new HashSet<>(List.of("Apple", "Banana"));
		System.out.println(HS);
		HS.add("Cat, Dog");
		System.out.println(HS);
		HS.remove("Apple");
		System.out.println(HS);

		// 2.LinkedHashSet:LinkedHashSet is a class that extends and implements the Set
		// interface. It is a part of java Collecttion Framework.It is maintained in
		// ordered.

		System.out.println("LinkedHashSet:");
		Set<String> LHS = new HashSet<>(List.of("Apple", "Banana"));
		System.out.println(LHS);
		LHS.add("Cat, Dog");
		System.out.println(LHS);
		LHS.remove("Apple");
		System.out.println(LHS);

		// 3.TreeSet:It is a NavigatableSet.TreeSet is a part of java Collection
		// Framework.It maintain order insertion.

		System.out.println("TreeSet:");
		Set<String> TS = new HashSet<>(List.of("Apple", "Banana"));
		System.out.println(TS);
		TS.add("Cat, Dog");
		System.out.println(TS);
		TS.remove("Apple");
		System.out.println(TS);

	}

}
