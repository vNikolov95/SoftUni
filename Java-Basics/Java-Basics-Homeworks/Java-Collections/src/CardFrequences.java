import java.util.LinkedHashMap;
import java.util.Scanner;


public class CardFrequences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] cards = scanner.nextLine().replaceAll("[♥♣♦♠]", "").split(" ");
		LinkedHashMap<String, Integer> frequencyOfCards = new LinkedHashMap<>();
		
		int total = 0;
		for (int i = 0; i < cards.length; i++) {
			if(!cards[i].equals("")) {
				if(frequencyOfCards.containsKey(cards[i])) {
					frequencyOfCards.put(cards[i], frequencyOfCards.get(cards[i]) + 1);
				} else {
					frequencyOfCards.put(cards[i], 1);
				}
			}
			total++;
		}
		float percent = (float)100/total;
		
		for (String key : frequencyOfCards.keySet()) {
			System.out.printf("%s -> %.2f%%", key, (float)frequencyOfCards.get(key) * percent);
			System.out.println();
		}
		
		scanner.close();
	}
}
