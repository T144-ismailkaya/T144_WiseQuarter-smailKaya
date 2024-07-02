package day07_NestedElseTernary;

import java.util.Scanner;

public class P02_SwitchStatementsSoru6 {
    public static void main(String[] args) {
        //- Kullanicidan ay numarasini alip mevsimi yazdirin.
        Scanner scan = new Scanner(System.in);

        System.out.print("Ay numarasını girin: ");
        byte ay = scan.nextByte();

        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kış Mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar Mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz Mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar Mevsimi");
                break;
            default:
                System.out.println("1 YIL = 12 AY");
        }


    }
}
