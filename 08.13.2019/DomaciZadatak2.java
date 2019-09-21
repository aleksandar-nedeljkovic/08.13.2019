package domaci08132019;

import java.util.Scanner;

public class DomaciZadatak2 {
	
	public static int[] ucitajNiz(char c) {
		Scanner sc = new Scanner(System.in);
		int[] niz;
		System.out.print("Koliko elemenata zelite da ima niz " + c + " ? ");
		int n = sc.nextInt();
		niz = new int[n];
		System.out.print("Unesite elemente niza " + c + ": ");
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			niz[i] = m;
		}
		return niz;
	}
	public static boolean proveraPodskupa(int[] a, int[] b) {
		boolean test = true;
		for (int i = 0; i < a.length; i++) {
			test = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					test = true;
					break;
				}
			}
			if (test == false)
				break;
		}
		return test;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean provera;
		char a = 'A';
		char b = 'B';
		int[] niz_a = ucitajNiz(a);
		int[] niz_b = ucitajNiz(b);
		provera = proveraPodskupa(niz_a, niz_b);
		if (provera == true)
			System.out.println("Niz A jeste podskup niza B!");
		else
			System.out.println("Niz A nije podskup niza B!");
	}
	

}
