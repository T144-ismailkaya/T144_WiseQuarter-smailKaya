package day03_Scanner;

/*
Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
degerlerini degistirin(swap)
 */


import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class P01_Soru8 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayı: "); // Kullanıcıdan veri almak için birinci sayıyı istiyorum
        int sayi1= scan.nextInt(); // Kullanıcıdan aldığım sayıyı hafızada tutuyorum

        System.out.println("İkinci sayı: ");
        int sayi2= scan.nextInt();

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        // Sonuçları yazdırın
        System.out.println("Değerler değiştirildi:");
        System.out.println("Birinci sayı: " + sayi1);
        System.out.println("İkinci sayı: " + sayi2);





    }

}
