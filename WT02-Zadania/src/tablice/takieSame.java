package tablice;

import java.util.Random;

import javax.swing.JOptionPane;

public class takieSame {

	public static void main(String[] args) {
		// Prośba o podanie rozmiaru tablicy
		int roz = Integer.parseInt(JOptionPane.showInputDialog(("Podaj rozmiar pierwszej tablicy")));
		// Deklarowanie i inicjowanie tablicy
		int[] tab1 = new int[roz];
		// Wypełnianie tablicy losowymi danymi
		Random r = new Random();
		for (int i = 0; i < roz; i++)
			tab1[i] = r.nextInt(100);
		// Wyświetlenie zawartości tablicy
		System.out.println("Zawartość tablicy");
		for (int x : tab1) {
			System.out.print(x + " ");
		}
		int rozB = Integer.parseInt(JOptionPane.showInputDialog(("Podaj rozmiar drugie tablicy")));
		// Deklarowanie i inicjowanie tablicy
		int[] tab2 = new int[rozB];
		System.out.println("\n");
		System.out.println("\n");
		// Wypełnianie tablicy losowymi danymi
		// Random r = new Random();
		for (int i = 0; i < roz; i++)
			tab2[i] = r.nextInt(100);
		// Wyświetlenie zawartości tablicy
		System.out.println("Zawartość tablicy");
		for (int x : tab2) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		System.out.println("----------------------------");
		funkcje.wPierwszejIWDrugiej(tab1, tab2);
	}

}
