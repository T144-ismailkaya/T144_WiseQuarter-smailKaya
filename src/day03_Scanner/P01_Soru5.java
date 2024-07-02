package day03_Scanner;

/*
Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
girilen bilgiler : J Doe, 44
 */


import java.util.Scanner;

public class P01_Soru5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen isminizi girin: ");
        String name= scan.nextLine(); // Kullanıcının ismini alacağız yani metinsel bir np oluşturdum

        System.out.print("Lütfen soy adınızı girin: ");
        String surname= scan.nextLine();

        System.out.print("Lütfen yaşınızı girin: ");
        byte yas= scan.nextByte();

        System.out.println("girilen bilgiler: "+(name+" "+surname+"," )+yas);




    }
}
