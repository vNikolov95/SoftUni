import java.util.Scanner;


public class CountSpecificWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().split("[\\W]+");
		String toSearch = scanner.nextLine();
		
		int count = 0;
		for (String word : str) {
			if(toSearch.equals(word))
				count++;
		}
		
		System.out.println(count);
		
		scanner.close();
	}
}
