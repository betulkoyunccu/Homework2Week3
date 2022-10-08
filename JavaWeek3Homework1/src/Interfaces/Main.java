package Interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		CustomerManager customerManager2 = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager2.giveCredit();
		CustomerManager customerManager3 = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager3.giveCredit();
	}

}
