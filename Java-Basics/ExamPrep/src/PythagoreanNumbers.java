import java.util.*;


public class PythagoreanNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			numbers.add(scanner.nextInt());
		}
		boolean haveMatch = false;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					int a = numbers.get(i);
					int b = numbers.get(j);
					int c = numbers.get(k);
					if(a*a + b*b == c*c && a<=b) {
						System.out.printf("%d*%d + %d*%d = %d*%d",a,a,b,b,c,c);
						System.out.println();
						haveMatch = true;
					}
				}
			}
		}
		if(!haveMatch)
			System.out.println("No");
		scanner.close();
	}
}
