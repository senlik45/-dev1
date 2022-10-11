package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] mylist = { 5.3, 4.8, 6.3, 10.5 };
		double total = 0;
		double enBüyük = mylist[3];

		for (double number : mylist) {
			if (enBüyük < number) {
				enBüyük = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam=" + total);
		System.out.println(enBüyük);

	}

}
