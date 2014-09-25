import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LongestIncreasingSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] stringNumbers = scanner.nextLine().split(" ");
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (String s : stringNumbers) {
			numbers.add(Integer.parseInt(s));
		}
		int longestStart = 0;
		int longestEnd = 0;
		int count = 1;
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
			if(i < numbers.size()-1 && numbers.get(i+1) > numbers.get(i)) {
				count++;
			} else {
				System.out.println();
				if(count > longestEnd - longestStart) {
					longestEnd = i+1;
					longestStart = i - count + 1;
				}
				count = 1;
			}
		}
		System.out.print("Longest: ");
		for(int i = longestStart; i < longestEnd; i++) {
			System.out.print(numbers.get(i) + " ");
		}
		
		scanner.close();
	}
}
