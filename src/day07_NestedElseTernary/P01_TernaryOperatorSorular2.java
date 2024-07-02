package day07_NestedElseTernary;

import java.util.Scanner;

public class P01_TernaryOperatorSorular2 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        degilse “Eskenar degil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Üçgeninizin 1.kenar uzunluğunu kaçtır: ");
        int kenar1 = scan.nextInt();

        System.out.print("Üçgeninizin 2.kenar uzunluğunu kaçtır: ");
        int kenar2 = scan.nextInt();

        System.out.print("Üçgeninizin 3.kenar uzunluğunu kaçtır: ");
        int kenar3 = scan.nextInt();

         if (kenar1 == kenar2 && kenar1 == kenar3) {
             System.out.println("Eskenar ucgen");
         } else {
             System.out.println("Eskenar degil");
         }


    }
}
