package AbstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager();  //konfig�rasyon
		customerManager.getCustomers();

	}

}
