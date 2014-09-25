import java.util.*;


public class FrequencyOfCouples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int total = 0;
		Map<String, Integer> couples = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < numbers.length-1; i++) {
			String newCouple = numbers[i].toString() + " " + numbers[i+1].toString();
			if(couples.containsKey(newCouple)) {
				couples.put(newCouple, couples.get(newCouple) + 1);
			} else {
				couples.put(newCouple, 1);
			}
			total++;
		}
		float percent = (float)100/total;
		
		for (String key : couples.keySet()) {
		    float val = couples.get(key) * percent;
		    System.out.printf("%s -> %.2f", key, val);
		    System.out.print("%");
		    System.out.println();
		}
		
		scanner.close();
	}
}
