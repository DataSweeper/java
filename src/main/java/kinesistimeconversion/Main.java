package kinesistimeconversion;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		String dateStr = "June 10, 2020 at 18:59 GMT+5:30";

		// Option 1: Remove GMT and parse as OffsetDateTime
		String cleanedDateStr = dateStr.replace("GMT", "").trim();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM d, yyyy 'at' HH:mm X");
		OffsetDateTime odt = OffsetDateTime.parse(cleanedDateStr, formatter1);
		System.out.println("Parsed: " + odt);
		System.out.println("Epoch seconds: " + odt.toEpochSecond());

		// Option 2: Use DateTimeFormatterBuilder with 'GMT' as literal
		DateTimeFormatter formatter2 = new DateTimeFormatterBuilder()
				.parseCaseInsensitive()
				.appendPattern("MMMM d, uuuu 'at' HH:mm 'GMT'X")
				.toFormatter(Locale.ENGLISH);
		OffsetDateTime odt2 = OffsetDateTime.parse(dateStr, formatter2);
		System.out.println("Parsed with GMT literal: " + odt2);
	}
}
