package collection;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<?> list = List.of(1, "hi", 3.01);
		StringBuilder result = new StringBuilder();
		List<String> stringifiedElements = new ArrayList<>();
		for (Object elem : list) {
			stringifiedElements.add(elem.toString());
		}
		stringifiedElements.sort(String::compareTo);
		for (String elem : stringifiedElements) {
			result.append(elem);
		}
		System.out.println(result);
	}
}
