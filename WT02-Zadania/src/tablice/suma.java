package tablice;

import java.util.Random;

import javax.swing.JOptionPane;

public class suma {

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
		//Obliczenie sumy
		//int roz=  tab.length;
		int suma = 0; 
		for (int i =0; i<roz; i++) {
			suma+=tab[i];
		}
		System.out.println("\n");
		System.out.println("Suma komórek tablicy wynosi: "+suma);
		double srednia = suma/roz;
		System.out.println("Śrdenia zaś to: "+srednia);
	}

}
