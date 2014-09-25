import java.math.BigDecimal;
import java.util.Scanner;


public class PossibleTriangles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		boolean hasTriangle = false;
		boolean hasInput = false;
		
		while(!input.equals("End")) {
			String[] numbers = input.split(" ");
			BigDecimal num1 = BigDecimal.valueOf(Float.parseFloat(numbers[0]));
			BigDecimal num2 = BigDecimal.valueOf(Float.parseFloat(numbers[1]));
			BigDecimal num3 = BigDecimal.valueOf(Float.parseFloat(numbers[2]));
			if(num1.add(num2).compareTo(num3) > 0 && num1.compareTo(num3) < 0 && num2.compareTo(num3) < 0) {
				System.out.printf("%.2f+%.2f>%.2f \n", num1, num2, num3);
				hasTriangle = true;
			} 
			if(num2.add(num3).compareTo(num1) > 0 && num2.compareTo(num1) < 0 && num3.compareTo(num1) < 0) { 
				System.out.printf("%.2f+%.2f>%.2f \n", num2, num3, num1);
				hasTriangle = true;
			}
			if(num1.add(num3).compareTo(num2) > 0 && num1.compareTo(num2) < 0 && num3.compareTo(num2) < 0) { 
				System.out.printf("%.2f+%.2f>%.2f \n", num1, num3, num2);
				hasTriangle = true;
			}
			hasInput = true;
			input = scanner.nextLine();
		}
		if(!hasTriangle && hasInput)
			System.out.println("No");
		scanner.close();
	}
}
