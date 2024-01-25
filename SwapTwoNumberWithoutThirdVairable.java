package Programs.java;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVairable {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);

	}

}
