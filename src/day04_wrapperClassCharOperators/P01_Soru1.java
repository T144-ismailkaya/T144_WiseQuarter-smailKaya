package day04_wrapperClassCharOperators;

//Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
//yazin

import java.util.Scanner;

public class P01_Soru1 {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin: ");
        int sayi1= scan.nextInt();

        System.out.print("Lütfen ikinci sayıyı girin: ");
        int sayi2= scan.nextInt();

        System.out.print("Lütfen üçüncü sayıyı girin: ");
        int sayi3= scan.nextInt();

        double sonuc= (sayi1+sayi2+sayi3) /3.0;


        System.out.println("Sonuç "+sonuc);



    }

}


