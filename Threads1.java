package Threads.java;

//Threads are a way to achive concurrent execution of tasks.They allows multiple parts of a program to rum simultaneously, making it possible to perform multiple operation concurrently.

public class Threads1 {

	public static void main(String[] args) {
		for (int i = 101; i <= 199; i++) {
			System.out.println(i);
		}
		System.out.println("Task1 Completed");

		for (int i = 201; i <= 299; i++) {
			System.out.println(i);
		}
		System.out.println("Task2 completed");
		
		for (int i = 301; i <= 399; i++) {
			System.out.println(i);
		}
		System.out.println("Task3 completed");
		
	}

}
