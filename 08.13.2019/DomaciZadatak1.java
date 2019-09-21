package domaci08132019;

import java.util.Scanner;

public class DomaciZadatak1 {

	static int tribonaci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else
			return tribonaci(n - 1) + tribonaci(n - 2) + tribonaci(n - 3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite N: ");
		int n = sc.nextInt();

		if (n < 0 || n > 37) {
			System.out.println("Max. Tribonacijev broj je 37. Unesite ponovo: ");
			n = sc.nextInt();
		}
		System.out.println(n + "-i Tribonacijev broj je: " + tribonaci(n));

	}

}
