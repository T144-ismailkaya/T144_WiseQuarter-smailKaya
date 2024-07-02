package day04_wrapperClassCharOperators;

import java.util.Scanner;

/*
Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
isleminin sonucununun tamsayi kismini yazdirin.
 */
public class P01_Soru4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen ilk double sayısını girin: ");
        double dbl1= scan.nextDouble();

        System.out.print("Lütfen ikinci double sayısını girin: ");
        double dbl2= scan.nextDouble();


        double bolum= dbl1/dbl2;

        System.out.println("Sonuç = " + (int)bolum);


    }

}
