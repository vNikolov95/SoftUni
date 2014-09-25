import java.util.Scanner;


public class GenerateThreeLetterWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] letters = scanner.nextLine().toCharArray();
		
		for (char c : letters) {
			for (char c1 : letters) {
				for (char c2 : letters) {
					System.out.print(c);
					System.out.print(c1);
					System.out.print(c2);
					System.out.print(" ");
				}
			}
		}
	}
}
