package Choinka;

public class choinka2 {

	public static void main(String[] args) {
		//
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		int x, z;
		x=0;
		z=0;
		for (x = 1; x <= 5; x++) {
			//System.out.print("*");
			for (z = 5; z <= 0; z--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
