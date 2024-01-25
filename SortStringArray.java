package Programs.java;

import java.util.Arrays;

public class SortStringArray {
	public static void main(String[] args) {
		String[] stringArray = { "Banana", "Apple", "Cat" };
		Arrays.sort(stringArray);
		
		for (String s : stringArray) {
			System.out.println(s);
		}
		
	}

}
