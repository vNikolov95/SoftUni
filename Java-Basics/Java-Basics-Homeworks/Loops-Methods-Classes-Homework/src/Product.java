import java.math.BigDecimal;

public class Product implements Comparable<Product>{
	public String Name;
	
	public BigDecimal Price;
	
	public Product(String name, BigDecimal price) {
		this.Name = name;
		this.Price = price;
	}
	
	public int compareTo(Product other) {
        return Price.compareTo(other.Price);
    }
}
