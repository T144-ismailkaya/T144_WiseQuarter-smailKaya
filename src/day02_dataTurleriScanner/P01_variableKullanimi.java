package day02_dataTurleriScanner;

public class P01_variableKullanimi {
    public static void main(String[] args) {

        int sayi=5;

        /* Javada birden fazla data türü vardır bunlardan biri "int" komutudur bu komuta bir değer atana bilir
        mesela int komutuna sayi değerini atatdık bu değerin print sisteminde kullana biliriz
        /*

       //  System.out.println("sayi"); //sayi


         /*
         Burada olduğu gibi barantez içindese data verimiz bu sonuç 5 olarak yansımaz
         Çiftırnak içinde ne varsa onu yazar komut çalışmaz
         */

        System.out.println(sayi); //5
        // burada ise çift tırnak olmadığından dolayı direk değerimizi yazar
        // Çift tırnak yoksa komut sistemi devreye girer

        sayi = sayi + 10;
        System.out.println(sayi); // Cevabı 15 Olarak verdi
        // Data verimize birden fazla sayi ataya biliriz


    }


}
