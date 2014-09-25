import java.util.*;


public class SequenceOfEqualStrings {
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
		for (String string : keys) {
			for (int i = 0; i < sequences.get(string); i++) {
				System.out.print(string + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
