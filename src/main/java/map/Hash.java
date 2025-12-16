package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hash {
	public static void main(String[] args) {
		Map<?,?> nestedMap = Map.of("d", 4, "b", List.of(3, 1, 2), "a", Map.of("y", 2, "x", 1));
		Map<Object,Object> map = new HashMap<>();
		System.out.println(nestedMap.keySet());
		map.put("my name", "is khan");
		map.put(2, 3.01);
		map.put(3.01, 2);
		System.out.println(map.keySet());
		System.out.println(map.get("my name"));
		System.out.println(map.get(2));
	}
}
