package Classes;

public class Main {

	public static void main(String[] args) {
		 CreditManager creditManager = new CreditManager();
	        creditManager.calculate();
	        creditManager.save();

	        Customer customer = new Customer();
	        customer.setId(1);
	        customer.setCity("Konya");

	        CustomerManager customerManager = new CustomerManager(customer);
	        customerManager.save();
	        customerManager.delete();

	        Company company = new Company();
	        company.setCompanyName("Arçelik");
	        company.setTaxNumber("100000");
	        company.setId(100);

	        CustomerManager customerManager2 = new CustomerManager(new Person());

	        Person person = new Person();
	        person.setNationalIdentity("123456");
	        person.setFirstName("Person");

	        Customer c1 = new Customer();
	        Customer c2 = new Person();

	}

}
