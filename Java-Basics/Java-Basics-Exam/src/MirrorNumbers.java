import java.util.Scanner;


public class MirrorNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String input = scanner.nextLine();
		String[] numbers = input.split(" ");
		boolean hasMirror = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				String reversed = new StringBuffer(numbers[j]).reverse().toString();
				if(numbers[i].equals(reversed)) {
					System.out.println(numbers[i] + "<!>" + numbers[j]);
					hasMirror = true;
				}
			}
		}
		if(!hasMirror) 
			System.out.println("No");
		scanner.close();
	}
}
