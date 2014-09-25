import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ExtractAllUniqueWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] words = scanner.nextLine().toLowerCase().replaceAll("[.,-_;+\\-!@#$%^&*()]", "").split(" ");
		List<String> nonRepeatingWords = new ArrayList<String>();
		
		
		for (String string : words) {
			if(!nonRepeatingWords.contains(string)) 
				nonRepeatingWords.add(string);
		}
		
		Collections.sort(nonRepeatingWords);
		for (String string : nonRepeatingWords) {
			System.out.print(string + " ");
		}
		
		scanner.close();
	}
}
