package org.learning;

public class Strings {
	public static void main(String[] args) {
		try {
			String str = "Hello, World!";
			System.out.println("Original String: " + str);

			// Convert to uppercase
			String upperStr = str.toUpperCase();
			System.out.println("Uppercase String: " + upperStr);

			// Convert to lowercase
			String lowerStr = str.toLowerCase();
			System.out.println("Lowercase String: " + lowerStr);

			// Get substring
			String subStr = str.substring(7, 12);
			System.out.println("Substring (7, 12): " + subStr);

			// Replace characters
			String replacedStr = str.replace("World", "Java");
			System.out.println("Replaced String: " + replacedStr);

			// Split string
			String[] splitStr = str.split(", ");
			System.out.println("Split String: ");
			for (String s : splitStr) {
				System.out.println(s);
			}

			// Trim whitespace
			String strWithSpaces = "   Hello, World!   ";
			String trimmedStr = strWithSpaces.trim();
			System.out.println("Trimmed String: '" + trimmedStr + "'");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
