package day07_NestedElseTernary;

import java.util.Scanner;

public class P01_TernaryOperatorSorular5 {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayıyı gir: ");
        int ilksayi = scan.nextInt();

        System.out.print("İkinci sayıyı gir: ");
        int ikincisayi = scan.nextInt();

        if (ilksayi < ikincisayi) {
            System.out.println("Küçük olan sayı = " + ilksayi);
        }
        if (ikincisayi < ilksayi) {
            System.out.println("Küçük olan sayı = " + ikincisayi);
        } else {
            System.out.println("İki sayıdada hata var");
        }

    }

}
