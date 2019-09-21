package domaci08122019;

import java.util.Scanner;

public class DomaciZadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Unesite broj elemenata niza: ");
		n = sc.nextInt();
		int[] niz = unosNiza(n);
		ispisiNiz(niz);
		int[] sortiranNiz = sortirajPoParnosti(niz);
		System.out.println("Sortiran po parnosti: ");
		ispisiNiz(sortiranNiz);
	}

	static int[] sortirajPoParnosti(int[] a) {
		int[] niz = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				niz[k] = a[i];
				k++;
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 != 0) {
				niz[k] = a[j];
				k++;
			}
		}
		return niz;
	}

	static int[] unosNiza(int br) {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[br];
		System.out.println("Unesi elemente niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();

	}

}
