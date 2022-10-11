package sayıArama;

public class Main {

	public static void main(String[] args) {
		int[] sayılar = new int[] { 1, 5, 6, 7, 9 };
		int aranacak = 3;
		boolean varMi = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMi = true;
				break;

			}
		}
		if (varMi) {
			System.out.println("sayı mevcuttur");
		} else {
			System.out.println("sayı mevcutt değil");
		}
	}

}
