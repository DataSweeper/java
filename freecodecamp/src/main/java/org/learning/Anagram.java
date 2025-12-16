package org.learning;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silente ";
		boolean result = isAnagram(str1, str2);
		if (result) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		if (str1 != null && str2 != null && str1.length() != str2.length()) {
			return false;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		java.util.Arrays.sort(arr1);
		java.util.Arrays.sort(arr2);
		return java.util.Arrays.equals(arr1, arr2);
	}
}
