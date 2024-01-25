package Programs.java;

import java.util.Scanner;

public class SwapTwoNumberWithThirdVariable {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		a = sc.nextInt();
		System.out.println("Enter b value");
		b = sc.nextInt();

		c = a;
		a = b;
		b = c;
		System.out.println("value of a is:" + a);
		System.out.println("value of b is:" + b);

	}

}
