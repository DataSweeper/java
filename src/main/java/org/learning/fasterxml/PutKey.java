package org.learning.fasterxml;

import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.event.JacksonEvent;

import java.util.Map;

public class PutKey {
	public static void main(String[] args) {
		try {
			System.out.println("Hello world");
			Event event = JacksonEvent.builder()
					.withEventType("event")
					.withData("{\"data\":{\"meta\":{\"product\":\"staging-freshdesk\",\"stack\":\"example-stack\",\"layer\":\"example-layer\",\"host\":\"example-host\",\"he_type\":\"example-type\",\"logSource\":\"example-log-source\"}}}")
					.build();
			event.put("data base", "mysql");
			String test = "Hello World";
			for (int i = 0; i < test.length(); i++) {
				System.out.println(test.charAt(i));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
