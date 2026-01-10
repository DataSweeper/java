package org.learning;

public class IsSorted {
	public static void main(String[] args) {
		int[] arr = {4, 3, 1};
		boolean assending = false;
		boolean desending = false;

		for (int i=0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				continue;
			}
			if (arr[i] < arr[i+1] && !desending) {
				assending = true;
			} else if (assending && arr[i] > arr[i+1]) {
				System.out.println("A: Not Sorted");
				assending = false;
				break;
			}
			if (arr[i] > arr[i+1] && !assending) {
				desending = true;
			} else if (desending && arr[i] < arr[i+1]) {
				System.out.println("D: Not Sorted");
				desending = false;
				break;
			}
		}
		if (assending) {
			System.out.println("Sorted in Assending Order");
		} else if (desending) {
			System.out.println("Sorted in Desending Order");
		}
	}
}
