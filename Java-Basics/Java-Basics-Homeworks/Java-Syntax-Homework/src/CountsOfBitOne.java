import java.util.Locale;
import java.util.Scanner;


public class CountsOfBitOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		System.out.println(Integer.bitCount(n));
	}
}
