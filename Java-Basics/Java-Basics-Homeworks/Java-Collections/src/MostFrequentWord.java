import java.util.Scanner;
import java.util.TreeMap;


public class MostFrequentWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] words = scanner.nextLine().toLowerCase().split("\\W");
		TreeMap<String, Integer> frequencyOfWords = new TreeMap<>();
		
		for (int i = 0; i < words.length; i++) {
			if(!words[i].equals("")) {
				if(frequencyOfWords.containsKey(words[i])) {
					frequencyOfWords.put(words[i], frequencyOfWords.get(words[i]) + 1);
				} else {
					frequencyOfWords.put(words[i], 1);
				}
			}
		}
		String mostFrequentKey = "";
		for (String key : frequencyOfWords.keySet()) {
			if(frequencyOfWords.containsKey(mostFrequentKey)) {
			    if(frequencyOfWords.get(key) > frequencyOfWords.get(mostFrequentKey)) {
			    	mostFrequentKey = key;
			    }
			} else {
				mostFrequentKey = key;
			}
		}
		for (String key : frequencyOfWords.keySet()) {
			if(frequencyOfWords.get(key) == frequencyOfWords.get(mostFrequentKey)) {
				System.out.println(key + " -> " + frequencyOfWords.get(key));
			}
		}
		
		scanner.close();
	}
}
