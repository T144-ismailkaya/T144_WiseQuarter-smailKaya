package day05_OperatorsIfElseStatements;



/*
    Soru:

    Kullanıcıdan yaşını alıp
    yaşı 18 ve üzeri ise "Ehliyet Başvurunuz kabul edilmiştir"
    Yaşı 18'den küçük ise  "Ehliyet Başvurunuz reddedilmiştir. .... yıl sonra başvurabilirisniz"
     ... yerine kaç yıl sonra 18 olacaksa onu yazdırın
    Not: Bağımsız if'ler kullanın
 */

import java.util.Scanner;

public class P03_OdevSorusu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı girin: ");
        byte yas = scan.nextByte();

        if (yas >= 18) {
            System.out.println("Ehliyet Başvurunuz kabul edilmiştir.");
        }

        if (yas < 18) {
            int kacyilsonra = 18 - yas;
            System.out.println("Ehliyet Başvurunuz reddedilmiştir." + " " + kacyilsonra + " " + "yıl sonra başvurabilirisniz");

        }


    }


}
