import java.util.ArrayList;
import java.util.Scanner;


public class CombineListOfLetters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine().replace(" ", "");
		String str2 = scanner.nextLine().replace(" ", "");
		ArrayList<Character> l1 = new ArrayList<Character>();
		ArrayList<Character> l2 = new ArrayList<Character>();
		ArrayList<Character> l3 = new ArrayList<Character>();
		
		for (char ch : str1.toCharArray()) {
			l1.add(ch);
			l3.add(ch);
		}
		for (char ch : str2.toCharArray()) {
			l2.add(ch);
			if(!l1.contains(ch))
				l3.add(ch);
		}
		for (Character character : l3) {
			System.out.print(character + " ");
		}
		
		scanner.close();
	}
}
