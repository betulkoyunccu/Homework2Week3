package ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(3, "Laptop", "Asus Laptop", 4500, 7, "Siyah");
		
		//Product product = new Product();
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Asus Leptop");
		//product.setPrice(5000);
		//product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
