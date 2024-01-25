package Programs.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i, num, count = 0;
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i =1;i<=num;i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}

	}

}
