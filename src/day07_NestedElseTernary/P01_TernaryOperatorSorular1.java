package day07_NestedElseTernary;

import java.util.Scanner;

public class P01_TernaryOperatorSorular1 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin: ");
        int sayi= scan.nextInt();

        if (sayi%5 == 0){
            System.out.println("Sayi 5’in tam kati");
        }else {
            System.out.println("Bu sayı 5 ile bölünemez");
        }

    }

}
