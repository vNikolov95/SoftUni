import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scanner = new Scanner(System.in);
		
		double[] numbers = new double[3];
		
		numbers[0] = scanner.nextDouble();
		numbers[1] = scanner.nextDouble();
		numbers[2] = scanner.nextDouble();
		
		Arrays.sort(numbers);
		
		System.out.println(numbers[0]);
	}
}
