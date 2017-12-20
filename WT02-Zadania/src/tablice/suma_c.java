package tablice;

public class suma_c {

	public static int suma(int[] tab) {
		int suma = 0;
		int roz = tab.length;
		for (int i = 0; i < roz; i++) {
			suma += tab[i];
		}
		return suma;
	}
	public static double srednia(int[] tab ) {
		int rozmiar= tab.length;
		double srednia =suma(tab)/rozmiar;
		return srednia;
	}
}
