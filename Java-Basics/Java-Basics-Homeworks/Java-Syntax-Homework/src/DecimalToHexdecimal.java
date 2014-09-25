import java.util.Scanner;

public class DecimalToHexdecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		System.out.println(Integer.toHexString(n).toUpperCase());
	}
}
