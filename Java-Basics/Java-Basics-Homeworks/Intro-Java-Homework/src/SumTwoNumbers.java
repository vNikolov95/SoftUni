import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("First number = ");
		num1 = in.nextInt();
		System.out.print("Second number = ");
		num2 = in.nextInt();
		
		System.out.println("Result: " + (num1+num2));
	}
}
