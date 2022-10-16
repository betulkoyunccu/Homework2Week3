package StaticDemo;

public class ProductValidator {
	static {
		System.out.println("Statik Yapýcý blok çalýstý");
	}

	public ProductValidator() {
		System.out.println("Yapýcý blok çalýstý");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public void bisey() {

	}


}

