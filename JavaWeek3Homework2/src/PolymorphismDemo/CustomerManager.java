package PolymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;

	}

	public void add() {
		System.out.println("Musteri Eklendi");
		this.logger.log("log mesajý");
	}
}
