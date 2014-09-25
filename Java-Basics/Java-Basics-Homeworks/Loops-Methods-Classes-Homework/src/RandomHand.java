import java.util.*;


public class RandomHand {
	public static void main(String[] args) {
		String[] cardsFaces = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] cardSuits = new String[] {"♣", "♦", "♥", "♠" };
		List<String> cards = new ArrayList<String>();
		
		for (String face : cardsFaces) {
			for (String suit : cardSuits) {
				cards.add(face+suit);
			}
		}
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			Collections.shuffle(cards);
			for(int j = 0; j < 5; j++){
				System.out.print(cards.get(j) + " ");
			}
			System.out.println();
		}
	}
}
