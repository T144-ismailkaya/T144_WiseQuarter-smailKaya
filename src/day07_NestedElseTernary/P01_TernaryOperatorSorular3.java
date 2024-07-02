package day07_NestedElseTernary;

import java.util.Scanner;

public class P01_TernaryOperatorSorular3 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise
        onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir harf girin: ");
        char harf = scanner.next().charAt(0);

        if (Character.isLowerCase(harf)) {
            System.out.println(Character.toUpperCase(harf));
        } else {
            System.out.println(harf);
        }


    }

}
