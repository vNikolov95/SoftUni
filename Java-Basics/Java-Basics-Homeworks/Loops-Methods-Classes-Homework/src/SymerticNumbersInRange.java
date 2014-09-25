import java.util.Scanner;


public class SymerticNumbersInRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for (int i = a; i <= b; i++) {
			if (i<10) {
				System.out.print(i + " ");
			} else if(i < 100) {
				if(i/10 == i%10) {
					System.out.print(i + " ");
				}
			} else {
				if(i/100 == i%10) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
