package day03_Scanner;

/*
Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
yazdirin.
 */


import java.util.Scanner;

public class P01_Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Karşı taraftan veri alabilmemiz için Scanner kullanmamız gerek
        // scanner obje tanımlamamız lazım

        System.out.print("Lütfen adınızı girin: "); // Karşı taraftan almak istediğimiz bilgiyi belirtmemiz lazım
        String name=scan.nextLine();  // karşı taraftan aldığımız adı saklaması için bir isim verelim

        System.out.print("Lütfen ondalıklı sayı girin: ");
        double OndalikliSayi=scan.nextDouble();

        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas= scan.nextInt(); // karşı taraftan yaşı saklaması için isim verelim

        System.out.println("İsminiz: "+name); // İsminiz: İsmail
        System.out.println("Ondalıklı sayı : "+OndalikliSayi); // Soy adınız: Kaya
        System.out.println("Yaşınız: "+yas); // Yaşınız: 16

    }
}
