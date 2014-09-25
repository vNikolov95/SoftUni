import java.util.Scanner;


public class StuckNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] numbers = scanner.nextLine().split(" ");
		boolean hasMatch = false;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if(j!=i) {
					for (int k = 0; k < numbers.length; k++) {
						if(k!=i && k!=j) {
							for (int l = 0; l < numbers.length; l++) {
								if(l!=i && l!=j && l!=k) {
									if((numbers[i] + numbers[j]).equals(numbers[k] + numbers[l])) {
										System.out.println(numbers[i] + "|" + numbers[j] + "==" + numbers[k] + "|" + numbers[l]);
										hasMatch = true;
									}
								}
							}
						}
					}
				}
			}
		}
		
		if(!hasMatch)
			System.out.println("No");
		
		scanner.close();
	}
}
