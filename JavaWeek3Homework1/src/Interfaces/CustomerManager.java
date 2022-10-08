package Interfaces;

public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void save() {
		System.out.println("Customer Saved");
	}

	public void delete() {
		System.out.println("Customer Deleted");
	}

	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Credit given to the customer.");
	}
}
