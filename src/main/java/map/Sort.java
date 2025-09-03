package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Sort {
	public static void main(String[] args) {
		Map<?,?> nestedMap = Map.of("d", 4, "b", List.of(3, 1, 2), "a", Map.of("y", 2, "x", 1));
		Map<?,?> map = Map.of("b", 2, "a", "hi", "c", 3.01);
		String result = deepSortAndStringify(nestedMap);
		System.out.println(result);
	}

	private static String deepSortAndStringify(Object object) {
		if (object == null) {
			return "";
		} else if (object instanceof Map) {
			StringBuilder result = new StringBuilder();
			Map<?, ?> map = (Map<?, ?>) object;
			List<Map.Entry<?, ?>> entries = new ArrayList<>(map.entrySet());
			entries.sort(Comparator.comparing(e -> e.getKey().toString()));
			for (Map.Entry<?, ?> entry : entries) {
				result.append(entry.getKey()).append(deepSortAndStringify(entry.getValue()));
			}
			return result.toString();
		} else if (object instanceof List) {
			StringBuilder result = new StringBuilder();
			List<?> list = (List<?>) object;
			List<String> stringifiedElements = new ArrayList<>();
			for (Object elem : list) {
				stringifiedElements.add(deepSortAndStringify(elem));
			}
			stringifiedElements.sort(String::compareTo);
			for (String elem : stringifiedElements) {
				result.append(elem);
			}
			return result.toString();
		} else {
			return object.toString();
		}
	}
}
