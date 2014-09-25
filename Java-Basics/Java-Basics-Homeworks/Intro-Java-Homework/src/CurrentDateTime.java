import java.time.*;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
		String todayAsString = today.format(formatter);
		System.out.println("Today is: " + todayAsString);
	}
}
