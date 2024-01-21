package FunctionalProgramming.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Functional Programming is a programming paradigm(different pattern).
//The functional programming feature were introduced in java 8 with the addition of Lambda Expression and the stream API.

public class FunctionalProgramming1 {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>(List.of(1, 12, 10, 45));
		System.out.println(number);
		
		List<Integer> doubleNumber = number.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(doubleNumber);// doubling the number

	}

}
