import java.util.Locale;
import java.util.Scanner;


public class FormattingNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		String hex = Integer.toHexString(a).toUpperCase();
		String binary = Integer.toBinaryString(a);
		String doubleWithPrecision1 = String.format("%.2f", b);
		String doubleWithPrecision2 = String.format("%.3f", c);
		
		System.out.print(String.format("|%-10s", hex));
		System.out.print(String.format("|%10s", binary).replace(' ', '0'));
		System.out.print(String.format("|%10s", doubleWithPrecision1));
		System.out.print(String.format("|%-10s|", doubleWithPrecision2));
	}
}
