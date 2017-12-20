package tablice;

import java.util.Random;

import javax.swing.JOptionPane;

public class pierwszaWieksza {

	public static void main(String[] args) {
		//Prośba o podanie rozmiaru tablicy
		int roz = Integer.parseInt(JOptionPane.showInputDialog(("Podaj rozmiar tablicy")));
		//Deklarowanie i inicjowanie tablicy
		int[] tab = new int[roz];
		//Wypełnianie tablicy losowymi danymi
		Random r = new Random();
		for (int i = 0; i<roz; i++)
			tab[i] = r.nextInt(100);
		//Wyświetlenie zawartości tablicy
				System.out.println("Zawartość tablicy");
		for (int x: tab) {
		System.out.print(x+" ");
		}
		int liczba = Integer.parseInt(JOptionPane.showInputDialog("Podaj dowolna liczbe z przedziału 0-100"));
		//Obliczenie sumy
		//int roz=  tab.length;
		System.out.println("\n");
		System.out.println("---------------------------");
		funkcje.pierwszaWieksza(tab, liczba);
		//System.out.println("\n");
		//int suma_k=tablice.suma_c.suma(tab);
		//System.out.println("Suma komórek tablicy wynosi: "+tablice.suma_c.suma(tab));
		//double srednia = suma/roz;
		//System.out.println("Śrdenia zaś to: "+tablice.suma_c.srednia(tab));
	}

}
