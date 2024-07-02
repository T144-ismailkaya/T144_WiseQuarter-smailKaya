package day03_Scanner;


import java.util.Scanner;

/*
Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
Isminiz : John
Soyisminiz : Doe
Yasiniz : 44
Kaydiniz basariyla tamamlanmistir.
 */
public class P03_Soru3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen İsminizi girin: ");
        String name= scan.nextLine();

        System.out.print("Lütfen Soy isminizi girin: ");
        String surname= scan.nextLine();

        System.out.print("Lütfen yaşınızı girin: ");
        int yas= scan.nextInt();


        System.out.println("İsminiz: "+name+"\nSoy adınız: "+surname+"\nYaşınız: "+yas+"\nKaydınız başarıyla tamamlanmıştır ");

        // Her veri yazdırmak için birden fazla sout kodunu yazmamıza gerek yok
        // Bir sonraki kelimeyi yanına yazdırmaik için "\n" ifadesini kullanmamız yeterli


       /*
        System.out.println("İsminiz: " + name);
        System.out.println("Soy adınız: " + surname);
        System.out.println("yas: " + yas);
        System.out.println("Kaydınız başarıyla tamamlanmıştır.");
       */

    }




}
