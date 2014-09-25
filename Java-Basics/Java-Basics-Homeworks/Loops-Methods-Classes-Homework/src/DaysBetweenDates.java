import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DaysBetweenDates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		String inputString1 = scanner.next();
		String inputString2 = scanner.next();
		try {
			Date date1 = myFormat.parse(inputString1);
		    Date date2 = myFormat.parse(inputString2);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}
