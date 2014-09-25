import java.awt.Point;
import java.util.Locale;
import java.util.Scanner;


public class PointsInsideHouse {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scanner = new Scanner(System.in);
		
		double sx = scanner.nextDouble();
		double sy = scanner.nextDouble();
		
		double[] rect1 = new double[] {12.5, 17.5, 8.5, 13.5};
		double[] rect2 = new double[] {20, 22.5, 8.5, 16};
		
		// Check if the dot is inside one of the three rectangles
		if((sx >=rect1[0] && sx <=rect1[1] && sy>=rect1[2] && sy<=rect1[3])
				|| (sx >=rect2[0] && sx <=rect2[1] && sy>=rect2[2] && sy<=rect2[3])
				|| isInTriangle(sx, sy, 12.5, 8.5, 22.5, 8.5, 17.5, 3.5)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
		
	}
	
	static Boolean isInTriangle(double sx, double sy, double ax, double ay, double bx, double by, double cx, double cy)
	{
	    double as_x = sx-ax;
	    double as_y = sy-ay;

	    Boolean s_ab = (bx-ax)*as_y-(by-ay)*as_x > 0;

	    if((cx-ax)*as_y-(cy-ay)*as_x > 0 == s_ab) return false;

	    if((cx-bx)*(sy-by)-(cy-by)*(sx-bx) > 0 != s_ab) return false;

	    return true;
	}
}
