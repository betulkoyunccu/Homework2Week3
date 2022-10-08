package Classes;

public class CustomerManager {
	private Customer _customer;

	public CustomerManager(Customer customer) {
		_customer = customer;
	}

	public void save() {
		System.out.println("Customer Saved");
	}

	public void delete() {
		System.out.println("Customer Deleted");
	}
}
