package day03_Scanner;

import java.util.Scanner;

/*
       Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
       dikdortgenin alanini yazdirin.
        */
public class P04_Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen kısa kenarın uzunluğunu yazın ");
        double kkenar= scan.nextDouble();
        // Her weriable'de farkli kod kullanırız
        // doublede scan.nextDouble İntiger'de scan.next.int String'te scan.nextLine

        System.out.println("Lütfen uzun kenarın uzumluğunu yazın");
        double ukenar= scan.nextDouble();

        System.out.println("Dikdörgenin alanı: "+kkenar*ukenar); // Kısa kenar ile Uzun kenarın çarpımı sonucu alanı elde ederiz

    }
}
