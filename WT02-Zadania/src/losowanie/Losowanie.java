package losowanie;

import java.util.Random;

import javax.swing.JOptionPane;

public class Losowanie {

	public static void main(String[] args) {
		Random r = new Random();
		int liczba = r.nextInt(100);
		//System.out.println(liczba);
		int licznik = 0;
		int podanaLiczba;
		boolean trafiony = false;
		do {
			podanaLiczba = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę w zakresie 0-99"));
			licznik++;
			if (liczba == podanaLiczba) {
				trafiony = true;
			} else if (liczba > podanaLiczba) {
				System.out.println("Za mało");
				//trafiony = false;
			} else {
				System.out.println("Za dużo");
				//trafiony = false;
			}
			//System.out.println(trafiony);
		} while (trafiony != true);
		JOptionPane.showMessageDialog(null, "Udało Ci się " + licznik + " próbach");

	}

}
