import java.util.*;


public class CognateWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] inputString = scanner.nextLine().replaceAll("[^a-zA-Z]", " ").toCharArray();
		List<String> words = new ArrayList<String>();
		int countOfWords = 0;
		boolean newWord = true;
		for (int i = 0; i < inputString.length; i++) {
			if(Character.isAlphabetic(inputString[i])) {
				if(newWord) {
					words.add("" + inputString[i]);
					countOfWords++;
					newWord = false;
				} else {
					words.set(countOfWords-1, words.get(countOfWords-1) + inputString[i]);
				}
			} else {
				newWord = true;
			}
		}
		int countOfCombinations = 0;
		Set<String> combinations = new HashSet<String>();
		for(int i = 0; i < words.size(); i++) {
			for(int j = 0; j < words.size(); j++) {
				if(j != i) {
					for(int k = 0; k < words.size(); k++) {
						if((words.get(i)+words.get(j)).equals(words.get(k))) {
							combinations.add(words.get(i)+"|"+words.get(j)+"="+words.get(k));
							countOfCombinations++;
							break;
						}
					}
				}
			}
		}
		
		if(countOfCombinations > 0) {
			for (String combination : combinations) {
				System.out.println(combination);
			}
		} else 
			System.out.println("No");
	}
}
