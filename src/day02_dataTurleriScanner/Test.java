package day02_dataTurleriScanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi girin= ");
        String girilenIsim= scan.nextLine();
        System.out.println("Tebrikler giriş başarılı "+girilenIsim);
      String KimlikNo= "Şimdi lütfen tc kimlik numaranızı girin";
        System.out.println(KimlikNo +" "+girilenIsim);






    }


}
