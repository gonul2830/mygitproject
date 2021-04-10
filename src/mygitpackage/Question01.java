package mygitpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {


	public static void main(String[] args) {
		// Verilen bir Array’den isten degere esit olan elamanlari kaldirip,
		// kalanlari yeni bir Array olarak yazdiran bir method yaziniz

		int arr[] = { 2, 3, 5, 3, 6, 4, 3, 6, 7 };
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();

kalaniYaz(arr, sayi);
scan.close();

}

public static void kalaniYaz(int arr[], int sayi) {
int count = 0;
for (int i = 0; i < arr.length; i++) { //bu for arr uzunlugunu belirlemek icin
if (arr[i] == sayi) { //sayi=3
count++;
}
}
int arr2[] = new int[arr.length - count];
int index = 0;
for (int j = 0; j < arr.length; j++) { //bu for elemanlari kontrol etmek icin
if (arr[j] != sayi) {
	arr2[index]=arr[j]; //arr2[0]=2 //arr2[1]=5

index++;
}

}
System.out.println(Arrays.toString(arr2));
		

		
	}

}
