import java.awt.Point;
import java.util.Scanner;


public class Durts {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Point startPoint = new Point(scanner.nextInt(), scanner.nextInt());
		
		int r = scanner.nextInt();
		int n = scanner.nextInt();
		
		Point[] points = new Point[n];
		
		for (int i = 0; i < n; i++) {
			points[i] = new Point(scanner.nextInt(), scanner.nextInt());
			
			if(isInsideDurts(startPoint, r, points[i])) {
				System.out.println("yes");
			}
			else 
				System.out.println("no");
		}
		System.out.println();
	}
	
	public static boolean isInsideDurts(Point durtsStartPoint, int durtsRadius, Point point) {
		
		if((point.x >= durtsStartPoint.x-durtsRadius && point.x <= durtsStartPoint.x + durtsRadius 
				&& point.y <= durtsStartPoint.y+durtsRadius-1 && point.y >= durtsStartPoint.y-durtsRadius+1)
				|| point.x >= durtsStartPoint.x-durtsRadius+1 && point.x <= durtsStartPoint.x+durtsRadius-1
				&& point.y >= durtsStartPoint.y-durtsRadius && point.y <= durtsStartPoint.y+durtsRadius) {
			return true;
		}
		
		return false;
	}
}
