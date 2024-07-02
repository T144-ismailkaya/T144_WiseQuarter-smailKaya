package day03_Scanner;

/*
Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
 */


import java.util.Scanner;

public class P01_Soru7 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen A sayısını girin: ");
        int A= scan.nextInt();

        System.out.println("Lütfen B sayısını girin: ");
        int B= scan.nextInt();

        int C=0; // İnt ile yeni değer oluşrutdum ve buna hiç bir şey atamadım

        A=C; // A değerini C atadım
        // A= 10 B=25 C=10
        A=B;
        // A=25 B=25 C=10
        B=C;
        // A= 25 B=10 C=0
        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }


}
