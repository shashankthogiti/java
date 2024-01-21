package Collections.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//The java framework provides a set of interface and classes to work with collection.

public class List2 {

//List is an interface thatt extends the collection interface. It represent an ordered collection of elements.

	public static void main(String[] args) {

		System.out.println("List");
		List<String> list = List.of("Apple", "Banana");
		System.out.println(list);// we can not change the List value becauusee it is immutable

//we can add,remove and access elements based on their index . 
		// The List is divided into 3 types . They are:-
		// 1. ArrayList
		// 2.LinkedList
		// 3.Vector
		// with the help of these 3 types we can access and change thevalues in the list

		// 1.ArrayList:ArrayList is a class that implements the interface.It is a part
		// of java collection framework. It is not Thread safe

		System.out.println("ArrayList:");
		List<String> AL = new ArrayList<>(List.of("Apple", "Banana"));
		System.out.println(AL);
		AL.add("Cat,Dog");// adding
		System.out.println(AL);
		AL.remove("Apple");// removing
		System.out.println(AL);

		// 2.LinkedList:LinkedList is a class that implements the List interface . It is
		// a part of the Java Collection Framework. It is not Thread safe.

		System.out.println("LinkedList:");
		List<String> LL = new LinkedList<>(List.of("Apple", "Banana"));
		System.out.println(LL);
		LL.add("Cat,Dog");// addition
		System.out.println(LL);
		LL.remove("Apple");// removing
		System.out.println(LL);

		// 3. Vector:Vector is a class that is the collection of java framework.It is
		// Thread safe.

		System.out.println("Vector:");
		List<String> vector = new Vector<>(List.of("Apple", "Banana"));
		System.out.println(vector);
		vector.add("Cat,Dog");// addition
		System.out.println(vector);
		vector.remove("Apple");// removing
		System.out.println(vector);
	}

}
