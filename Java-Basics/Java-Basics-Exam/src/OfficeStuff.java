import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;


public class OfficeStuff {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		ArrayList<String> companies = new ArrayList<String>();
		LinkedHashMap<String, Integer> products = new LinkedHashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			String[] input = scanner.nextLine().replace("|","").replaceAll("\\s+","").split("-");
			if(!companies.contains(input[0])) {
				companies.add(input[0]);
			}
			
			if(products.get(input[2] + "-" + input[0]) == null) {
				products.put(input[2] + "-" + input[0], Integer.parseInt(input[1]));
			} else {
				products.put(input[2] + "-" + input[0], products.get(input[2] + "-" + input[0]) + Integer.parseInt(input[1]));
			}
		}
		Collections.sort(companies);
		for (int i = 0; i < companies.size(); i++) {
			System.out.print(companies.get(i) + ": ");
			Set<String> keys = products.keySet();
			String str = "";
			for (String string : keys) {
				if(string.split("-")[1].equals(companies.get(i))) {
					str += string.split("-")[0] + "-" + products.get(string) + ", ";
				}
			}
			System.out.println(str.substring(0,str.length()-2));
		}
		
		scanner.close();
	}
}
