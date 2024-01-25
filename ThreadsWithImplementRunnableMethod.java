package Threads.java;

//Threads are a way to achive concurrent execution of tasks.They allows multiple parts of a program to rum simultaneously, making it possible to perform multiple operation concurrently.
//The two commonly used methods in java threads are 'start()' and 'join()'

class ThreadsWithImplementRunnableMethod implements Runnable {// Method 2 : using "implements Runnable"
	@Override
	public void run() {
		System.out.println("Task1 Started");
		for (int i = 101; i <= 199; i++) {
			System.out.println(i);
		}
		System.out.println("Task1 Completed");
	}

	public static void main(String[] args) {

		System.out.println("Task1 kicked off");
		ThreadsWithImplementRunnableMethod task1 = new ThreadsWithImplementRunnableMethod();
		Thread task1Thread = new Thread(task1);
		task1Thread.start();

		System.out.println("Task2 kicked off");
		for (int i = 201; i <= 299; i++) {
			System.out.println(i);
		}
		System.out.println("Task2 completed");
		
		System.out.println("Task3 kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.println(i);
		}
		System.out.println("Task3 completed");
		
	}

}
