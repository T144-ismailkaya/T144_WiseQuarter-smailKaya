package day07_NestedElseTernary;

import java.util.Scanner;

public class P02_SwitchStatementsSoru4 {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board
        Scanner scan = new Scanner(System.in);

        System.out.print("ISTQB kısaltmasından hangi harfin anlamını öğrenmek istersiniz: ");
        char harf = scan.nextLine().toUpperCase().charAt(0);

        switch (harf) {
            case 'I':
                System.out.println("I: International");
                break;
            case 'S':
                System.out.println("S: Software");
                break;
            case 'T':
                System.out.println("T: Testing");
                break;
            case 'Q':
                System.out.println("Q: Qualifications");
                break;
            case 'B':
                System.out.println("B: Board");
            default:
                System.out.println("ISTQB harfleri dışında harf var");

        }

    }
}
