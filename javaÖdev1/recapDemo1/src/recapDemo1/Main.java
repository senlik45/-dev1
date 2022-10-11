package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayı1 = 85;
		int sayı2 = 200;
		int sayı3 = 65;

		int enBüyük = sayı2;
		
		if (enBüyük < sayı1)
			enBüyük = sayı1;
		if (enBüyük < sayı3)
			enBüyük = sayı3;

		System.out.println("En Büyük=" + enBüyük);
	}

}
