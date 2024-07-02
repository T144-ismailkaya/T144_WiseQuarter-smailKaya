package day04_wrapperClassCharOperators;

import java.util.Scanner;

public class P01_Casting {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen 1'ci notunuzu girin: ");
        int sayi1= scan.nextInt();

        System.out.print("Lütfen 2'ci notunuzu girin: ");
        int sayi2= scan.nextInt();

        System.out.print("Lütfen 3'ci notunuzu girin: ");
        int sayi3= scan.nextInt();

        System.out.println("Not ortalaması: "+(sayi1+(double)+sayi2+sayi3)/3);





    }

}
