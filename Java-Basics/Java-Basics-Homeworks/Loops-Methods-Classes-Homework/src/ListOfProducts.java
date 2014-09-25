import java.io.*;
import java.math.BigDecimal;
import java.util.*;


public class ListOfProducts {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.ROOT);
		List<Product> products = new ArrayList<Product>();
		BufferedReader reader = null;
		PrintWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader("src/inputList.txt"));
			writer = new PrintWriter(new FileWriter("src/outputList.txt"));
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(" ");
				BigDecimal price = BigDecimal.valueOf(Float.parseFloat(str[1]));
				Product current = new Product(str[0], price);
				products.add(current);
			}
			Collections.sort(products);
			for (Product product : products) {
				writer.println(String.format("%.2f",product.Price) + " " + product.Name);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		} finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
		
		
	}
}
