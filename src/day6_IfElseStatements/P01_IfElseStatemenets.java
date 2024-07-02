package day6_IfElseStatements;

import java.util.Scanner;

public class P01_IfElseStatemenets {
    public static void main(String[] args) {
         /*
        Kullanicidan bir karakter girmesini isteyin
        girilen karakterin bütük harf olup olmadığını kontrol edin
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir harf girin: ");
        char harf = scan.nextLine().charAt(0);

        if (Character.isUpperCase(harf)) {
            System.out.println("Girdiğiniz harf büyük");
        } else {
            System.out.println("Girdiğiniz harf küçük");
        }
    }

}
