package day07_NestedElseTernary;

import java.util.Scanner;

public class P02_SwitchStatementsSoru5 {
    public static void main(String[] args) {
        //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.print("Haftanın hangi günündesin: ");
        char gun = scan.nextLine().charAt(0);

        switch (gun) {
            case '1':
                System.out.println("Hafta içi");
                break;
            case '2':
                System.out.println("Hafta içi");
                break;
            case '3':
                System.out.println("Hafta içi");
                break;
            case '4':
                System.out.println("Hafta içi");
                break;
            case '5':
                System.out.println("Hafta içi");
                break;
            case '6':
                System.out.println("Hafta sonu");
                break;
            case '7':
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("1 Haftada 7 Gün vardır.");
        }


    }
}
