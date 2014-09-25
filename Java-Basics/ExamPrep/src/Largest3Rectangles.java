import java.util.Scanner;


public class Largest3Rectangles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().replace(" ", "").replace("[", " ").replace("]", "").trim().split(" ");
		long largestArea = 0;
		for (int i = 0; i < input.length; i++) {
			if(i < input.length-2) {
				int a1 = Integer.parseInt(input[i].split("x")[0]);
				int a2 = Integer.parseInt(input[i].split("x")[1]);
				int b1 = Integer.parseInt(input[i+1].split("x")[0]);
				int b2 = Integer.parseInt(input[i+1].split("x")[1]);
				int c1 = Integer.parseInt(input[i+2].split("x")[0]);
				int c2 = Integer.parseInt(input[i+2].split("x")[1]);
				if(a1*a2 + b1*b2 + c1*c2 > largestArea)
					largestArea = a1*a2 + b1*b2 + c1*c2;
			}
		}
		System.out.println(largestArea);
		scanner.close();
	}
}
