import java.util.*;


public class FullHouse {
	public static void main(String[] args) {
		String[] cardsFaces = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] cardSuits = new String[] {"♣", "♦", "♥", "♠" };
		List<String> comb = new ArrayList<String>();
		List<String> comb2 = new ArrayList<String>();
		
		for (String face : cardsFaces) {
			for(int i = 0; i < 4; i++) {
				String temp = cardSuits[0];
				cardSuits[0] = cardSuits[i];
				cardSuits[i] = temp;
				comb.add(face+cardSuits[1]+face+cardSuits[2]+face+cardSuits[3]);
			}
			for (String suit : cardSuits) {
				for (String suit1 : cardSuits) {
					if(suit.equals(suit1)) continue;
					boolean add = true;
					for (String s : comb2) {
						String u = "" + s.toCharArray()[0] + s.toCharArray()[1];
						String u1 = "" + s.toCharArray()[3] + s.toCharArray()[4];
						String u3 = "" + s.toCharArray()[0] + s.toCharArray()[1] + s.toCharArray()[2];
						if(u.equals(face+suit1) && u1.equals(face+suit) || u3.equals(face+suit1)) add = false;
					}
					if(add)
						comb2.add(face+suit + " " + face+suit1);
				}
			}
		}
		int count = 0;
		for (int i = 0; i < comb.size(); i++) {
			for (int j = 0; j < comb2.size(); j++) {
				if(comb.get(i).toCharArray()[0] != comb2.get(j).toCharArray()[0]) {
					System.out.print("(" + comb.get(i) + comb2.get(j) + ")");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println(count + " full houses");
	}
}
