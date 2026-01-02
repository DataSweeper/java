package org.learning;

import java.time.Duration;

public class Worker implements Runnable {
	private final String name;
	private final Duration duration;

	public Worker(String name, int durationInMinutes) {
		this.name = name;
		this.duration = Duration.ofSeconds(durationInMinutes);
	}

	@Override
	public void run() {
		System.out.println("Worker " + name + " is starting.");
		try {
			Thread.sleep(duration.toMillis()); // Simulate work with sleep
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Worker " + name + " has finished.");
	}
}
