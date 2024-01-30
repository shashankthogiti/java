package codsoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("Welcome to Number Game!\n");

		while (true) {

			int randomNumber = r.nextInt(100) + 1;
			int totalAttempts = 0;
			int maxAttempt = 10;

			while (totalAttempts < maxAttempt) {

				System.out.print("Enter your guess (1-100): ");
				int personGuess = sc.nextInt();

				if (personGuess == randomNumber) {
					System.out.println("Congratulations! You guessed the correct number ");
					break;
				} else if (personGuess < randomNumber) {
					System.out.println("Too low! Try again.");
				} else {
					System.out.println("Too high! Try again.");
				}

				totalAttempts++;
			}

			if (totalAttempts == maxAttempt) {
				System.out.println("Sorry, you've reached the maximum number of attempts. ");
				System.out.println("The correct number was " + randomNumber);
			}

			System.out.print("Do you want to play again? (1 for yes, 0 for no): ");
			int anotherGame = sc.nextInt();
			if (anotherGame != 1) {
				break;
			}
		}
		System.out.println("Thank you for playing");

		sc.close();
	}
}

