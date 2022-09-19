package SwitchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println(" Mükemmel Geçtiniz");
			break;
		case 'B':
			System.out.println(" Çok iyi Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi Geçtiniz");
			break;
		case 'D':
			System.out.println("Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldýnýz");
			break;
			default:
				System.out.println("Geçersiz not girdiniz..");
		}
	}

}
