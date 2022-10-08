package Methods;

public class Main {
	public static void main(String[] args) {
		sayiBulmaca();// methodu çagirdik

	}

	public static void sayiBulmaca() {// method

		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 5;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer("Sayý Mevcuttur: " + aranacak);
		} else {
			mesajVer("Sayý Mevcut degildir: " + aranacak);
		}
	}

	// public static void mesajVer(int aranacak) {//Parametreli method
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
