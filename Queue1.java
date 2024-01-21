package Collections.java;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//The java framework provides a set of interface and classes to work with collection.

public class Queue1 {

//Queue is java Collection framework and it is First-in & First-out method.

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>(List.of("Apple", "Banana"));
		System.out.println(queue);
		
		
	}

}
