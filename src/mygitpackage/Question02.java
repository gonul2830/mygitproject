package mygitpackage;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		/*
		 * Kullan�c� durdurana kadar say�lar� girmek i�in bir program yaz�n ve sonunda
		 * girilen pozitif, negatif ve s�f�r say�s�n� g�r�nt�lemelidir.
		 */
		Scanner scan = new Scanner(System.in);
		char secim;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
	
			do {
			System.out.println("lutfen girmek istediginiz sayilari giriniz");

			int sayi = scan.nextInt();
			
			if (sayi < 0) {
				count1++;
			}
			if (sayi > 0) {
				count2++;
			}
			if (sayi == 0) {
				count3++;
			}

			System.out.println("girmek istediginiz sayilar bitince S sayisini tuslay�n");
			secim = scan.next().toUpperCase().charAt(0);
		} while (secim == 'S');
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
	}

}
