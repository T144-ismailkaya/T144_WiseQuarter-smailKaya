package day10_StringManipulationForLoop;

import java.util.Scanner;

public class P03_ForLoopQuiz3 {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Başlangıç değeri kaç: ");
        int baslangic = scan.nextInt();

        System.out.print("Bitiş değeri kaç: ");
        int bitis = scan.nextInt();

        int toplam = 0;
if (bitis<baslangic){
    System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz...");
}else {
    for (int i = baslangic; i < bitis; i++) {
        toplam+=i;

    }
    System.out.println(toplam+" ");
}



    }

}

