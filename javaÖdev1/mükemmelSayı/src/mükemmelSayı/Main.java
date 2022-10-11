package mükemmelSayı;

public class Main {

	public static void main(String[] args) {
		int sayı = 28;
		int toplam = 0;

		for (int i = 1; i < sayı; i++) {
			if (sayı % i == 0) {
				toplam = toplam + i;
			}
		}
		if (toplam == sayı) {
			System.out.println("mükemmel sayıdır");
		} else {
			System.out.println("mükemmel sayı değil");
		}
	}

}
