package Programs.java;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter number of column");
		int colm = sc.nextInt();

		int arr[][] = new int[rows][colm];
		
		for(int i = 0;i< rows ;i++) {
			for (int j = 0; j < colm; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colm; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
