import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;


public class LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] words = scanner.nextLine().split(" ");
		LinkedHashMap<String, Integer> sequences = new LinkedHashMap<>();
		
		for (int i = 0; i < words.length; i++) {
			if(sequences.get(words[i]) == null) {
				sequences.put(words[i], 1);
			} else {
				sequences.put(words[i], sequences.get(words[i]) + 1);
			}
		}
		
		Set<String> keys = sequences.keySet();
		String longestKey = null;
		for (String string : keys) {
			if(longestKey == null || sequences.get(string) > sequences.get(longestKey)) {
				longestKey = string;
			}
		}
		
		for (int i = 0; i < sequences.get(longestKey); i++) {
			System.out.print(longestKey + " ");
		}
		
		scanner.close();
	}
}
