package org.learning.fasterxml;

import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.event.JacksonEvent;

import java.util.Map;

public class DataAccess {
	public static void main(String[] args) {
		try {
			System.out.println("Hello world");
			Event event = JacksonEvent.builder()
					.withEventType("event")
					.withData("{\"data\":{\"meta\":{\"product\":\"staging-freshdesk\",\"stack\":\"example-stack\",\"layer\":\"example-layer\",\"host\":\"example-host\",\"he_type\":\"example-type\",\"logSource\":\"example-log-source\"}}}")
					.build();
			System.out.println(event.get("data.meta", Map.class));
			System.out.println(event.get("data", Map.class));
			//System.out.println(event.get("data", Map.class).get("meta", Map.class).get("product", String.class));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
