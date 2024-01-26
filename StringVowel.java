package Programs.java;

import java.util.Scanner;

public class StringVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word");
		String str = sc.nextLine();
		str = str.toLowerCase();
		System.out.println(str);
		
		int vowel = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			}
		}
		System.out.println("The number of vowel in the string are: " + vowel);

	}

}
