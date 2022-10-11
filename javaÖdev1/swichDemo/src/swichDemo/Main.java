package swichDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtinz");
			break;
		case 'B':
		case 'C':
			System.out.println("iyi: Geçtinz");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");

		}

	}

}
