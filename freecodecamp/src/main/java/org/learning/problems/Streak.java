package org.learning.problems;

public class Streak {
	public static void main(String[] args) {
		int[][] streaks = {{10000, 120, 5}, {10950, 121, 11}};
		int successStreakDays = 0;
		for (int[] streak :streaks) {
			int steps = streak[0];
			int stime = streak[1];
			int rtime = streak[2];
			if (steps >= 10000 && stime <= 120 && rtime >= 5) {
				successStreakDays++;
			} else {
				int streakFailedDay = streaks.length - successStreakDays;
				System.out.println("Resolution failed on: " + (streakFailedDay + 1) + " day. " + successStreakDays + " days streak.");
				break;
			}
		}
		if (successStreakDays == streaks.length)
			System.out.println("Resolution on track : " + successStreakDays + " days streak.");
	}
}
