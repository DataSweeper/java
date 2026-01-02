package org.learning;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		// Create a ThreadPoolExecutor with 4 threads
		ExecutorService executor = Executors.newFixedThreadPool(4);

		// Submit Worker tasks to the executor
		executor.submit(new Worker("A", 1));
		executor.submit(new Worker("B", 5));
		executor.submit(new Worker("C", 3));
		executor.submit(new Worker("D", 10));

		// Shutdown the executor
		executor.shutdown();
	}
}