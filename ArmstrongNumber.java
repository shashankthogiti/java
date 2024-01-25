package Programs.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num, rem, arm = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \' num \' Value:");
		num = sc.nextInt();
		temp = num;
		
		while(num>0) {
			rem = num%10;
			arm = rem * rem * rem + arm;
			num = num / 10;
		}
		if (temp == arm) {
			System.out.println("Armstromg Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
