package day6_IfElseStatementsandQuiz;

import java.util.Scanner;

public class P03IfElseStatemenets {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin: ");
        char sayi = scan.nextLine().charAt(0);

        if (sayi%5 == 0){
            System.out.println("Sayi 5’in tam kati");
        }


    }


}
