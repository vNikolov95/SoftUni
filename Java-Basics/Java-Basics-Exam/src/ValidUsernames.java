import java.util.ArrayList;
import java.util.Scanner;


public class ValidUsernames {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inp = scanner.nextLine();
		
		if(inp.length() > 0) {
			String[] input = inp.replaceAll("[/\\\\)(]", " ").replaceAll("\\s+"," ").split(" ");
			if(input.length > 1) {
				ArrayList<String> validUsernames = new ArrayList<>();
			
				int i = 0;
				for (String string : input) {
					if(!string.isEmpty()) {
						if(!Character.isDigit(string.charAt(0)) && string.length() <= 25 && string.length() >= 3) {
							validUsernames.add(string);
							i++;
						}
					}
				}
				if(validUsernames.size() > 1) {
					int longest = validUsernames.get(0).length() + validUsernames.get(1).length();
					String longestUsernameCouple = validUsernames.get(0) + "\n" + validUsernames.get(1);
					for (int j = 0; j < i-1; j++) {
							if(validUsernames.get(j).length() + validUsernames.get(j+1).length() > longest) {
								longest = validUsernames.get(j).length() + validUsernames.get(j+1).length();
								longestUsernameCouple = validUsernames.get(j) + "\n" + validUsernames.get(j+1);
							}
					}
					System.out.println(longestUsernameCouple);
				}
			}
		}
		
		scanner.close();
	}
}
