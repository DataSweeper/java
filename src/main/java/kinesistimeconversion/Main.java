package kinesistimeconversion;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main {
	public static void main(String[] args) {
		String dateStr = "June 10, 2020 at 18:59 GMT+5:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy 'at' HH:mm 'GMT'XXX");
		ZonedDateTime zdt = ZonedDateTime.parse(dateStr, formatter);
		long creationEpoch = zdt.toEpochSecond();
		System.out.println(creationEpoch);
	}
}

