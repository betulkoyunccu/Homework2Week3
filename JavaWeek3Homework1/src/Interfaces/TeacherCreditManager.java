package Interfaces;

public class TeacherCreditManager extends BaseCreditManager {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Calculated credit for Teacher.");
	}

	@Override
	public void save() {
		// teacher specified code
		// super.save() runs save mehod in BaseCreditManager
		super.save();
		// teacher specified code
	}
}
