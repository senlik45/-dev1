package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// arrays

		String ögrenci0 = "Engin";
		String ögrenci1 = "Derin";
		String ögrenci2 = "Salih";
		String ögrenci3 = "Ahmet";

		System.out.println(ögrenci0);
		System.out.println(ögrenci1);
		System.out.println(ögrenci2);
		System.out.println(ögrenci3);

		System.out.println("-------------------");

		String[] ögrenciler = new String[4];

		ögrenciler[0] = "Engin";
		ögrenciler[1] = "Derin";
		ögrenciler[2] = "salih";
		ögrenciler[3] = "ahmet";
		
		for(int i=0;i<ögrenciler.length;i++){
		System.out.println(ögrenciler[i]);
		}
		System.out.println("-------------------");
		for(String ögrenci:ögrenciler)
		{System.out.println(ögrenci);}
		
		
		
		

	}

}
