package Choinka;

public class choinka4 {

	public static void main(String[] args) {
		//
		String[][] tablica = new String[4][7];
		//WYpełnienie całej tablicy
		for (int x = 0; x <= 3; x++)
			for (int y = 0; y <= 6; y++)
				tablica[x][y] = "*";
		//Wypełnienie lewej strony
		for (int x = 0; x <= 3; x++)
			for (int y = 0; y +x<= 2; y++)
				tablica[x][y] = " ";
		//Wypełnienie prawej strony
		for (int x = 2; x >= 0; x--)
			for (int y = 6; y -x>= 4; y--)
				tablica[x][y] = " ";
		//Wyświetlenie zawartości
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y <= 6; y++) {
				System.out.print(tablica[x][y]);
			}
			System.out.println("");
		}
	}

}
