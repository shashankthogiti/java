package Programs.java;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int i, num, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \' num \' value:");
		num = sc.nextInt();
		
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);

	}

}
