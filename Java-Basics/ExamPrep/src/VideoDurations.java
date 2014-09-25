import java.util.Scanner;


public class VideoDurations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long minutes = 0;
		String input = scanner.nextLine();
		
		do {
			if(input.compareTo("End") == 0)
				break;
			minutes += Long.parseLong(input.split(":")[1]);
			minutes += Long.parseLong(input.split(":")[0])*60;
			input = scanner.nextLine();
		} while (input.compareTo("End") != 0);
		
		System.out.printf("%d:%02d", minutes/60, minutes%60);
		
		scanner.close();
	}
}
