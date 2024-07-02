package day07_NestedElseTernary;

import java.util.Scanner;

public class P01_TernaryOperatorSorular6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int mutlakDeger;
        if (sayi >= 0) {
            mutlakDeger = sayi;
        } else {
            mutlakDeger = -sayi;
        }

        System.out.println("Girilen sayının mutlak değeri: " + mutlakDeger);



    }

}
