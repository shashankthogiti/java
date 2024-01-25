package Programs.java;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		int num, sum = 0, rem, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter\' num \' value:");
		num = sc.nextInt();
		temp = num;
		
		while(num>0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrom Number");
		} else {
			System.out.println("Not a palindrom Number");
		}

	}

}
