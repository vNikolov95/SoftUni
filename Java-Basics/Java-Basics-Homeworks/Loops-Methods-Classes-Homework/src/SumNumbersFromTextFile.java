import java.io.*;
import java.util.*;


public class SumNumbersFromTextFile {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/inputNumbers.txt"));
			
			String line = null;
			int sum = 0;
			while ((line = reader.readLine()) != null) {
			    sum += Integer.parseInt(line);
			}
			System.out.println(sum);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
		
	}
}
