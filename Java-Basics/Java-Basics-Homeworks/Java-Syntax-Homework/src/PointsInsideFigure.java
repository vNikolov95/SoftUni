import java.util.Locale;
import java.util.Scanner;


public class PointsInsideFigure {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scanner = new Scanner(System.in);
		
		double ax = scanner.nextDouble();
		double ay = scanner.nextDouble();
		
		// The figure is slip on three rectangles, initiate arrays with their end points
		double[] rect1 = new double[] {12.5, 22.5, 6, 8.5};
		double[] rect2 = new double[] {12.5, 17.5, 8.5, 13.5};
		double[] rect3 = new double[] {20, 22.5, 8.5, 13.5};
		
		// Check if the dot is inside one of the three rectangles
		if((ax>=rect1[0] && ax<=rect1[1] && ay>=rect1[2] && ay<=rect1[3])
				|| (ax>=rect2[0] && ax<=rect2[1] && ay>=rect2[2] && ay<=rect2[3])
				|| (ax>=rect3[0] && ax<=rect3[1] && ay>=rect3[2] && ay<=rect3[3])) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}
