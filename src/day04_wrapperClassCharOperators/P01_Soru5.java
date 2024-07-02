package day04_wrapperClassCharOperators;

//Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
//ve bolum isleminin sonucununun tamsayi kismini yazdirin


import java.util.Scanner;

public class P01_Soru5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir double sayı girin: "); //92,2
        double sayi1= scan.nextDouble();

        System.out.print("Bir tam sayı girin: "); //4
        int sayi2= scan.nextInt();

        int sonuc= (int) (sayi1/sayi2);


        System.out.println("sonuc = "+sonuc); //23



    }

}
