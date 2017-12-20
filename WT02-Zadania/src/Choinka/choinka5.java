package Choinka;

public class choinka5 {

	public static void main(String[] args) {
		//
		String[][] tablica = new String[5][9];
		//WYpełnienie całej tablicy
		for (int x = 0; x <= 4; x++)
			for (int y = 0; y <= 8; y++)
				tablica[x][y] = "*";
		//Wypełnienie lewej strony
		for (int x = 0; x <= 3; x++)
			for (int y = 0; y +x<=3; y++)
				tablica[x][y] = " ";
		
		 //Wypełnienie prawej strony
		for (int x = 3; x >= 0; x--)
			for (int y = 8; y -x>= 5; y--)
				tablica[x][y] = " ";
		//Wyświetlenie zawartości
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y <= 8; y++) {
				System.out.print(tablica[x][y]);
			}
			System.out.println("");
		}
	}

}
