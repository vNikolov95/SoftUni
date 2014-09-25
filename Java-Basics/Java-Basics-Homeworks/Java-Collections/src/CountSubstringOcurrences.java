import java.util.Scanner;


public class CountSubstringOcurrences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().toLowerCase().split("[\\W]+");
		String toSearch = scanner.nextLine();
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			int subIndex = str[i].indexOf(toSearch);
			while(subIndex != -1) {
				for(int j = 0; j < str[i].length(); j++) {
					if(subIndex == j) {
						str[i] = str[i].substring(j+1);
					}
				}
				count++;
				subIndex = str[i].indexOf(toSearch);
			}
		}
		System.out.println(count);
		
		scanner.close();
	}
}
