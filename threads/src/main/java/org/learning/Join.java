package org.learning;

public class Join {
	public static void main(String[] args) {
		Thread worker1 = new Thread(new Worker("A", 20));
		Thread worker2 = new Thread(new Worker("B", 5));

		worker1.start();
		worker2.start();

		try {
			worker1.join();
			worker2.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("Both workers have finished.");
	}
}
