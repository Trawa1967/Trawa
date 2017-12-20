package Choinka;

import javax.swing.JOptionPane;

public class choinka {

	public static void main(String[] args) {
		//
		//String[][] tablica = new String[5][9];
		int rozmiar =Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj rozmiar tablicy - ilość wierszy"));
		System.out.println(rozmiar);
		String [][] tablica = new String[rozmiar][2*rozmiar-1];
		
		//WYpełnienie całej tablicy
		System.out.println("rozmar tablicy"+rozmiar+" na "+(2*rozmiar-1));
		for (int x = 0; x < rozmiar; x++)
			for (int y = 0; y < (2*rozmiar-1); y++)
				tablica[x][y] = "*";
		//Wypełnienie lewej strony
		for (int x = 0; x <=(rozmiar-1); x++)
			for (int y = 0; y +x<rozmiar-1; y++)
				tablica[x][y] = (" ");
		
		 //Wypełnienie prawej strony
		for (int x = (rozmiar-1); x >= 0; x--)
			for (int y = (2*rozmiar-2); y -x>= 4; y--)
				tablica[x][y] = (" ");
		//Wyświetlenie zawartości
		for (int x = 0; x < rozmiar; x++) {
			for (int y = 0; y < (2*rozmiar-1); y++) {
				System.out.print(tablica[x][y]);
		
			}
			System.out.println("");
		}
	}

}
