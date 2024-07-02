package day07_NestedElseTernary;

import java.util.Scanner;

public class P01_TernaryOperatorSorular4 {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        50’den kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu girin: ");
        double not= scan.nextDouble();

        if (not>50){
            System.out.println("Sinifi Gectin");
        }else{
            System.out.println("Maalesef kaldin");
        }

    }
}
