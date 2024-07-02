package day03_Scanner;



/*
Kullanicidan bir double, bir de int sayi alip
bunlarin toplamini ve carpimini yazdırın.
 */

import java.util.Scanner;

public class P02_Soru2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Yapacağınız işlemin ilk sayısını yazın: "); // KARŞI TARAFTAN VERİ ALACAĞIZ
        int sayi1= scan.nextInt();

        System.out.print("Yapacağınız işlemin ikinci sayısını yazın: ");
        double sayi2= scan.nextDouble();

        System.out.println("Toplama işleminin sonucu: "+(sayi1+sayi2));
        System.out.println("--------------SONUÇ-------------");
        System.out.println("Çarpma işleminin sonucu: "+(sayi1*sayi2));




    }
}
