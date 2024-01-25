package Programs.java;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		int num,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Ever or Odd Number");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}

}
