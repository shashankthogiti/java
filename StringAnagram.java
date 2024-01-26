package Programs.java;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		str1.toLowerCase();
		str2.toLowerCase();

		char ch1[] = str1.toCharArray();// converting String to Character Array i.e.,[hello is conveted as {h,e,l,l,o}
		char ch2[] = str2.toCharArray();// converting String to Character Array i.e.,[hello is conveted as {h,e,l,l,o}

		Arrays.sort(ch1);// Sorting an array i.e., Ascending order
		Arrays.sort(ch2);// sorting an array i.e., Acsending order
		
		boolean result = Arrays.equals(ch1, ch2);
		
		if (result == true) {
			System.out.println("It is an Anagram");
		} else {
			System.out.println("It is not an Anagram");
		}

	}

}
