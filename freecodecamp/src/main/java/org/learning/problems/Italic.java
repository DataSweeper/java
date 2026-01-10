package org.learning.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Italic {
	public static void main(String[] args) {
		String sentence = "_This is an example of italic text.";
		StringBuilder result = new StringBuilder();
		boolean closeCheck = false;
		int closeIndex = -1;
		for (int i = 0; i < sentence.length(); i++) {
			char currenChar = sentence.charAt(i);
			if (closeCheck && i != closeIndex) {
				result.append(sentence.charAt(i));
				continue;
			} else if (closeCheck) {
				closeCheck = false;
				result.append("</i>");
				continue;
			}
			if (currenChar == '_') {
				List check = checkClosing(sentence, i);
				if(check.get(0).equals(true)) {
					closeCheck = true;
					closeIndex = (int) check.get(1);
					result.append("<i>");
				} else {
					result.append(currenChar);
				}
			} else {
				result.append(currenChar);
			}
		}
		System.out.println(result);
	}

	public static List checkClosing(String str, int index) {
		List result = new ArrayList();
		for (int i = index + 1; i < str.length(); i++) {
			if (str.charAt(i) == '_') {
				result.add(true);
				result.add(i);
				return result;
			}
		}
		result.add(false);
		return result;
	}
}
