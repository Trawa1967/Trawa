package Choinka;

public class choinka3 {

	public static void main(String[] args) {
		//
		int x, z, y;
		x = 0;
		y = 0;
		z = 0;
		for (x = 1; x <= 5; x++) {
			// System.out.print("*");
			for (y = 5; y >= x; y--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
