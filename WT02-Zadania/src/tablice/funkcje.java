package tablice;

public class funkcje {

	public static void wypiszWieksze(int[] tab, int liczba) {
		int roz = tab.length;
		for (int i = 0; i < roz; i++) {
			if (tab[i] > liczba) {
				System.out.print(tab[i] + " ");
			}
		}
	}

	public static void pierwszaWieksza(int[] tab, int liczba) {
		int roz = tab.length;
		int liczba_z = 0;
		for (int i = 0; i < roz; i++) {
			if (tab[i] > liczba) {
				liczba_z = tab[i];
				System.out.print("Piersza większa to liczba " + tab[i]);
				break;
			}
		}
		if (liczba_z == 0) {
			System.out.println("Nie znalezino takiej liczby ");
		}
	}

	public static int sumaWiekszych(int[] tab, int liczba) {
		int roz = tab.length;
		int suma = 0;
		for (int i = 0; i < roz; i++) {
			if (tab[i] > liczba) {
				tab[i] = 0;
			}
		}
		for (int x : tab)
			suma += x;
		return suma;
	}

	public static int ileWiekszych(int[] tab, int liczba) {
		int roz = tab.length;
		int ile = 0;
		for (int i = 0; i < roz; i++) {
			if (tab[i] > liczba) {
				ile++;
			}
		}
		return ile;
	}

	public static void wPierwszejIWDrugiej(int[] tab1, int tab2[]) {
		int roz1 = tab1.length;
		int roz2 = tab2.length;
		int liczba_z = 0;
		for (int i = 0; i < roz1; i++) {
			for (int j = 0; j < roz2; j++) {
				if (tab1[i] == tab2[j]) {
					System.out.print("Wspólne częsic tablic to " + tab1[i]);
					liczba_z++;
				}
			}
		}
		if (liczba_z == 0)
		System.out.print("tablice nie maja wspólnych elementów ");
	}
}
