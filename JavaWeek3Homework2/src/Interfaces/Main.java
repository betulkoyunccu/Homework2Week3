package Interfaces; // Interfaceler de abstractlar gibi newlenemezler 

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();

	}

}
