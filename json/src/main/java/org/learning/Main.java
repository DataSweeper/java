package org.learning;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	private static final ObjectMapper objectMapper = new ObjectMapper();
	public static void main(String[] args) {
		String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
		JsonNode jsonNode = null;
		try {
			jsonNode = objectMapper.readTree(jsonString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		String name = jsonNode.get("name").asText();
		System.out.println("Name: " + name);
	}
}