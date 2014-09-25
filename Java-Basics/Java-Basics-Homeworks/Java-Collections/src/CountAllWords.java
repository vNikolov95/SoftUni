import java.util.Scanner;


public class CountAllWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split("[\\W]");
		
		System.out.println(str.length);
		
		scanner.close();
	}
}
