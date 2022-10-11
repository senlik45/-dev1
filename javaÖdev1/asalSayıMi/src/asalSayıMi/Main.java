package asalSayıMi;

public class Main {

	public static void main(String[] args) {
		int number = 29;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("sayı asal değil");
			return;
		}
		if (number < 1) {
			System.out.println("geçersiz sayı");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("sayı asaldır");
		} else {
			System.out.println("sayı asal  değil");
		}

	}

}
