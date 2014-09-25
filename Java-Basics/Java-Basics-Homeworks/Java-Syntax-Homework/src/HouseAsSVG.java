import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Scanner;


public class HouseAsSVG {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Locale.setDefault(Locale.ROOT);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		DoublePoint[] points = new DoublePoint[n];
		
		for (int i = 0; i < n; i++) {
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			points[i] = new DoublePoint(x,y);
		}
		
		PrintWriter writer = new PrintWriter("house.html", "UTF-8");
		double m = 10;
		writer.println("<div style='margin-left: 25;'>");
		for (int i = 0; i < 6; i++) {
			writer.println("<p style='margin: 0 5 0 0; display: inline-block;'>"+m+"</p>");
			m+=2.5;
		}
		writer.println("</div>");
		
		m = 3.5;
		writer.println("<div style='display: inline-block; text-align: right;'>");
		for (int i = 0; i < 6; i++) {
			writer.println("<p style='margin: 0 0 10 0;'>"+m+"</p>");
			m+=2.5;
		}
		writer.println("</div>");
		
		writer.println("<svg style='display: inline-block; vertical-align: top' height='500' width='500'>");
		writer.println("<polygon points='90,10 150,70 150,130 120,130 120,70 90,70 90,130 30,130 30,70'"
				+ " style='stroke: blue; fill:#ccc;stroke-width:1' />");
		
		for (int i = 10; i <= 160; i+=30) {
			writer.println("<g fill='none' stroke='black' stroke-width='.5'>"
					+ "<path stroke-dasharray='5,5' d='M0 "+i+" l200 0' />"
					+ "</g>");
		}
		
		for (int i = 0; i <= 180; i+=30) {
			writer.println("<g fill='none' stroke='black' stroke-width='.5'>"
					+ "<path stroke-dasharray='5,5' d='M"+i+" 0 l0 180' />"
					+ "</g>");
		}
		
		double[] rect1 = new double[] {12.5, 17.5, 8.5, 13.5};
		double[] rect2 = new double[] {20, 22.5, 8.5, 16};
		
		for (DoublePoint point : points) {
			double newX = (point.X*12 - 120);
			double newY = point.Y*12 - 35;
			// Check if the dot is inside one of the three rectangles
			if((point.X >= rect1[0] && point.X <=rect1[1] && point.Y>=rect1[2] && point.Y<=rect1[3])
					|| (point.X >=rect2[0] && point.X <=rect2[1] && point.Y>=rect2[2] && point.Y<=rect2[3])
					|| isInTriangle(point.X, point.Y, 12.5, 8.5, 22.5, 8.5, 17.5, 3.5)) {
				writer.println("<circle r='1' stroke-width='3' cx='"+ String.format("%.2f", newX) +"' cy='"+String.format("%.2f", newY)+"' stroke='black' fill='black' />");
			} else {
				writer.println("<circle r='1' stroke-width='3' cx='"+ String.format("%.2f", newX) +"' cy='"+String.format("%.2f", newY)+"' stroke='#999' fill='#999' />");
			}
		}
		
		writer.println("</svg>");
		writer.close();
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
