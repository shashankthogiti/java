package Programs.java;

import java.util.Scanner;

public class InputIntegerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0 ; i < size ; i++) {
			System.out.println("Enter element " + i + " :");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println("The output is: " + arr[i]);
		}

	}

}
