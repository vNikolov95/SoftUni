import java.util.Scanner;

public class CountOfBitPairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		char[] bits = Integer.toBinaryString(n).toCharArray();
		
		int equalBitsCounter = 0;
        while (n != 0) {
                int twoBitsValue = n & 3;
                if (twoBitsValue == 0 || twoBitsValue == 3) {
                        equalBitsCounter++;
                }

                n >>>= 1;
        }

        System.out.println(equalBitsCounter);
	}
}
