package tablice;

import java.util.Random;

import javax.swing.JOptionPane;

public class maksy {

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
		//Znalezienie największej i najmniejszej wartości w tablicy
		//int roz=  tab.length;
		int max = 0; 
		int min = 100;
		for (int x: tab) {
			if (x>=max) {
				max=x;
			}
			if (x<=min) {
				min = x;
			}
		}
		//Wyświetlenie wyników
		System.out.println("\n");
		System.out.println("Największa z liczba to: "+max);
		System.out.println("Zajmniejsza zaś to: "+min);
		System.out.println("\n");
		System.out.println("----------------------");
		System.out.println("Różnica pomiędzy max a min wynosi: "+(max-min));
	}

}
