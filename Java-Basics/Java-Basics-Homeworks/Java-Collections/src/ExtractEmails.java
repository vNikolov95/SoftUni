import java.util.Scanner;


public class ExtractEmails {
	public static void main(String[] args) {
		//([a-zA-Z0-9\-_+]*@([a-zA-Z0-9\-_+].)?[a-zA-Z0-9\-_+].[a-zA-Z0-9]{2,6})
		Scanner scanner = new Scanner(System.in);
		
		String[] words = scanner.nextLine().split(" ");
		
		for (String string : words) {
			if(string.matches("([a-zA-Z0-9]+[.-_]?[a-zA-Z0-9]*@([a-zA-Z0-9]+[.-_])?[a-zA-Z0-9]+[.-_]?[a-zA-Z0-9]+[.-_].{2,6})"))
				System.out.println(string);
		}
		 
		scanner.close();
	}
}
