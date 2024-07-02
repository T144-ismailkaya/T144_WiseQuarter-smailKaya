package day04_wrapperClassCharOperators;

// Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

import java.util.Scanner;

public class P01_Soru2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir harf girin: ");
        char harf= scan.nextLine().charAt(0); // Char sistemini scanner kullanmak için "charAt(0);" yazarız

        System.out.println("Harfin sonraki 1'sayısı: "+(char)(harf+1)); //Harfe 1 eklediğimiz için alfabeye göre bir sonraki harfi yazdı
        System.out.println("Harfin sonraki 2'sayısı: "+(char)(harf+2));
        System.out.println("Harfin sonraki 3'sayısı: "+(char)(harf+3));

        //Char veriable'sini print sisteminde kullanmasaydık alfabeye göre değil yanına 1 ekleyerek devam ederdi



    }

}
