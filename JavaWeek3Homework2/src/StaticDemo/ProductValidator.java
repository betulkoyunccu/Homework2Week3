package StaticDemo;

public class ProductValidator {
	static {
		System.out.println("Statik Yap�c� blok �al�st�");
	}

	public ProductValidator() {
		System.out.println("Yap�c� blok �al�st�");
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

