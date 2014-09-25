import java.util.*;


public class AngleUnitConverter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while(n != 0) {
			double angle = scanner.nextDouble();
			String measure = scanner.next();
			if(measure.equals("rad")) {
				System.out.println(String.format("%.6f deg", Math.toDegrees(angle)));
			} else {
				System.out.println(String.format("%.6f rad", Math.toRadians(angle)));
			}
			n--;
		}
		System.out.println();
	}
}
